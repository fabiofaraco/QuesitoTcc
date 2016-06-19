CREATE DATABASE QUESITO;

create table usuarios
(
	id int not null, 
	email varchar(50) not null,
	senha varchar(50) not null,
	
	constraint pk_usuarios primary key(id)
);

