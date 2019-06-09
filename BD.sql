create schema locadora;

create table cliente(
	id int(11) not null auto_increment,
    nome varchar(255) not null,
    cpf varchar(14) not null unique,
    rua varchar(255) not null,
    numero varchar(11) not null,
    complemento varchar(50) not null,
    cidade varchar(50) not null,
    estado varchar(2) not null,
    cep varchar(9) not null,
    data_nascimento date not null,
    primary key(id)
);

create table funcionario(
	id int(11) not null  auto_increment,
	nome varchar(255) not null,
    cpf varchar(14) not null unique,
    rua varchar(255) not null,
    numero varchar(11) not null,
    complemento varchar(50) not null,
    cidade varchar(50) not null,
    estado varchar(2) not null,
    cep varchar(9) not null,
    login varchar(100) not null,
    senha varchar(100) not null,
    primary key(id)
);

create table filme(
	id int not null auto_increment,
    titulo varchar(100) not null,
    genero varchar(100) not null,
    informacao varchar(255) not null,
    disponivel varchar(20) not null,
    quantidade int(11) not null,
	valor double(9,2) not null,
    primary key(id)
);

create table locacao(
	id int(11) not null auto_increment,
    id_cliente int(11) not null,
    id_filme int(11) not null,
    data_locacao date not null,
    data_devolucao date not null,
    primary key(id),
    foreign key (id_cliente) references cliente(id),
    foreign key (id_filme) references filme(id)
);

create table debito_cliente(
	id int(11) not null auto_increment,
    id_locacao int(11) not null,
    valor double(9,2) not null,
    primary key(id),
    foreign key (id_locacao) references locacao(id)
);