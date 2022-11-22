CREATE DATABASE  IF NOT EXISTS supersenac;
USE supersenac;

DROP TABLE IF EXISTS venda;

create table venda (
idVenda int primary key auto_increment,
idCliente int not null,
valorTotalVenda float,
dataVenda date,
foreign key(idCliente) references cliente(idCliente)
);