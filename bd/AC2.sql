drop database if exists Ac2;
create database Ac2;
use Ac2;

create table Usuario (
  login_usuario varchar(40) unique,
  senha_usuario varchar(30),
  nome_usuario varchar(100) not null
  );
  
  create table Prestador_de_Serviço (
  nome varchar(50) not null,
  valor_hora decimal(5,2),
  nome_empresa varchar(100),
  tempo_contrato char(20),
  data_inicio char(20),
  data_fim char(20),
  descricao_serviço varchar(500)
  );
  