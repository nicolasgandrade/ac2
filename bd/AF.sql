drop database if exists AF;
create database AF;
use AF;

create table Usuario (
  id int primary key auto_increment,
  login_usuario varchar(40) unique not null,
  senha_usuario varchar(30) not null,
  nome_usuario varchar(100) not null
  );
  
  create table Produto (
  id int primary key auto_increment,
  nome_produto varchar(50) not null,
  editora varchar(50),
  tipo varchar(40),
  categoria varchar(40),
  valor float
  );
  
  