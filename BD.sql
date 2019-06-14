create schema locadora;
use locadora;
create table cliente(
	id int(11) not null auto_increment,
    nome varchar(255) not null,
    cpf varchar(14) not null unique,
    rua varchar(255) not null,
    numero varchar(11) not null,
    cidade varchar(50) not null,
    telefone varchar(15) not null,
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
    status varchar(11) not null,
    primary key(id),
    foreign key (id_cliente) references cliente(id),
    foreign key (id_filme) references filme(id)
);


