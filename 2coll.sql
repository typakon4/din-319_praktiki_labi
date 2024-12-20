create database Users1;
use Users1;
create table Users (
user_id int auto_increment primary key,
name varchar(100) not null,
mail varchar(100) unique not null,
phone varchar(10) unique not null,
registration_date timestamp not null default current_timestamp,
check (mail <> '' and phone <> '') 
);
insert into Users (name, mail, phone)
values
('Robert', 'Robert@example.com', '1234567890'),
('Alex', 'Alex@example.com', '7394658254'),
('Anton', 'Anton@example.com', '5553535130');
create index idx_email on Users(mail);

create table Orders (
order_id int auto_increment primary key,
user_id int not null,
amount decimal(10, 2) not null check (amount >= 0),
order_date timestamp not null default current_timestamp,
status varchar(30) not null,
foreign key (user_id) references Users(user_id) on delete cascade
);
insert into Orders (user_id, amount, order_date, status)
value
(1, 250, '2025-11-01', 'completed'),
(1, 150, '2025-11-05', 'in progress'),
(2, 100, '2025-10-10', 'canceled'),
(3, 500, '2025-11-12', 'completed'),
(3, 200, '2025-11-18', 'completed');
create index idx_order_date on Orders(order_date);

select u.name, o.order_id, o.amount, o.order_date, o.status 
from Users u
left join Orders o on u.user_id = o.user_id
where o.order_id is not null
order by o.order_date desc;

select * from Users where user_id not in (select distinct user_id from Orders) order by registration_date;

select u.name, COUNT(o.order_id) as total_orders, SUM(o.amount) as total_amount
from Users u
join Orders o on u.user_id = o.user_id
group by u.name;

select u.name, o.order_id, o.amount, o.order_date, o.status
from Users u
join Orders o on u.user_id = o.user_id
order by o.status, o.order_date desc;

select u.user_id, u.name, SUM(o.amount) as total_amount
from Users u
join Orders o on u.user_id = o.user_id
group by u.user_id, u.name
having SUM(o.amount) > 1000;

select distinct u.name
from Users u
join Orders o on u.user_id = o.user_id
where o.status in ('отменен', 'доставлен');

select u.name
from Users u
join Orders o on u.user_id = o.user_id
group by u.name
having MIN(o.amount) > 500;

select u.name
from Users u
join Orders o on u.user_id = o.user_id
where o.order_date between u.registration_date and DATE_ADD(u.registration_date, interval 1 month);

select u.name
from Users u
left join Orders o on u.user_id = o.user_id
where u.registration_date < DATE_SUB(CURDATE(), interval 1 year)
  and (o.order_id is null or o.order_date < DATE_SUB(CURDATE(), interval 6 month));

select distinct u.name
from Users u
join Orders o on u.user_id = o.user_id
where month(o.order_date) = month(CURDATE());

drop database Users1;