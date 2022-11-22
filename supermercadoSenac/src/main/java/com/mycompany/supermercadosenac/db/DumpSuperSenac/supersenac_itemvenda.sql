CREATE DATABASE  IF NOT EXISTS supersenac;
USE supersenac;

DROP TABLE IF EXISTS itemVenda;

create table itemVenda (
idItemVenda int primary key auto_increment,
idVenda int not null,
idProduto int not null,
nomeProduto varchar(20),
precoProduto float,
qtdProduto int,
foreign key(idVenda) references venda(idVenda),
foreign key(idProduto) references produto(idProduto)
);
