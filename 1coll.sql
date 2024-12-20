create database contact;
use contact;
create table people (
id integer primary key,
name varchar(30) not null,
surname varchar(30) not null,
mail varchar(30)
);
insert into people (id, name, surname, mail)
value
(1, 'Роберт', 'Антонович', 'trupi@gmail.com'),
(2, 'Александр', 'Янович', 'pixnvm@gmail.com'),
(3, 'Катя', 'Иванов', 'ven@gamil.com');
select *from people;
select name, surname from people;
update people set mail = 'worker_venom@gmail.com' where id = 1;
delete from people where namee = 'Роберт';
drop database contact;