CREATE DATABASE IF NOT exists coderhouse;
USE coderhouse;

CREATE TABLE persona (
	nombre varchar(20),
    apellido varchar(20)
);

select * from persona;

insert into persona values 
	("Alejandro", "Di Stefano"),
	("Alejandro", "Perez"),
	("Alejandro", "Di Stefano");
    
select nombre, apellido from persona;

select * from persona where nombre like "Alejandro";
select * from persona where apellido like "Di Stefano";

alter table persona add column id integer auto_increment not null primary key;

select * from persona where id = 1;

alter table persona add column dni integer null;

update persona set dni = 20222222 where id = 1;
update persona set dni = 20222333 where id = 2;
update persona set dni = 20222444 where id = 3;

select * from persona where  dni = 20222333;

drop table persona;