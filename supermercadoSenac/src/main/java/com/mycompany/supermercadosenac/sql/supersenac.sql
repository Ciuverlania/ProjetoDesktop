create database supersenac;
use supersenac;

create table cliente(
idCliente int primary key auto_increment,
CPFCliente varchar(30) unique not null,
nomeCliente varchar(40) not null,
enderecoCliente varchar(50) not null,
dataNascimento date not null,
emailCliente varchar(40) not null,
sexoCliente varchar(20) not null,
estadoCivil varchar(30) not null
);

insert into cliente (CPFCliente, nomeCliente,enderecoCliente,dataNascimento,emailCliente,sexoCliente,estadoCivil) values
					("431.833.458-97","Leonardo Fujimura","Rua Sócrates, 853, Apt.193 D", '30/03/2002',"leonardo.fujimura123@gmail.com", "M", "Solteiro(a)");
                    
select*from cliente;

Select*from cliente where nomeCliente like "leonardo%";

drop table cliente;

update cliente set dataNascimento='2002-03-30' where idCliente=1;

create table produto(
id int primary key auto_increment,
codigo varchar(40) not null unique,
nome varchar(40) not null,
descricao varchar(100) not null,
quantidade int not null,
peso decimal(3,2),
preco decimal(9,2) not null
);

select*from produto;

drop table produto;

insert into produto (codigo,nome,descricao,quantidade,peso,preco) values ("123123123","H2OH","Bebida refrescante de limão", 10,0.5,5.25);
