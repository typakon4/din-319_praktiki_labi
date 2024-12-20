create database if not exists blog;
use blog;
create table if not exists author (
id int auto_increment primary key,
Имя varchar(55) not null);
insert into author (Имя) values
('Роберт Хвалеев'),
('Александр Кироши'),
('Никита Сиволдаев');

create table if not exists Post (
id int auto_increment primary key,
Заголовок varchar(55) not null,
Текст text not null,
id_автора int,
foreign key (id_автора) references author(id) on delete cascade);
insert into Post (Заголовок, Текст, id_автора) values
('Дикая собака', 'Дружба с дикой собакой.', 1),
('Крипто жизнь', 'Наслаждайтесь крипто жизнью.', 2),
('Компьютер', 'Компьютор Вишни: ошибки и опыт.', 3);

create table if not exists Commentary (
id int auto_increment primary key,
Текст text not null,
id_поста int,
id_автора int,
foreign key (id_поста) references Post(id) on delete cascade, 
foreign key (id_автора) references author(id) on delete cascade);
insert into Commentary (Текст, id_поста, id_автора) values
('Собачки милые', 1, 3),
('Крипто жизнь крутая', 2, 2),
('Вишне сложно собирать компьютор', 3, 1);

select * from Post where id_автора = 1;
select * from Commentary where id_поста = 1;

delete from Commentary where id_автора = 1;
delete from Post where id_автора = 1;
delete from author where id = 1;

drop database blog;