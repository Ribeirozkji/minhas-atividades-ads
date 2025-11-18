create database projeto;
use projeto;

create table cadastro (
nome varchar(255),
email varchar(255),
senha varchar(255)
);

create table login (
email varchar(255),
senha varchar(255)
);

select * from cadastro;