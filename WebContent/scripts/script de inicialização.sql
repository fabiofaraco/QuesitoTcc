CREATE DATABASE QUESITO;

create table perfis 
(
	id int not null,
	descricao varchar(50) not null,
	
	constraint pk_perfis primary key(id)
); 

insert into perfis(id, descricao)
values(1, 'Administrador'), 
	  (2, 'Integrante da Equipe'), 
	  (3, 'Elaborador');

	  
	  
insert into principal_evento(id, descricao)
values(1, 'Acidente com ve�culo'),
	  (2, 'Amea�a de Desabamento'),
	  (3, 'Amea�a de Deslizamento')
	

