CREATE TABLE categoria(
    id serial not null primary key,
    descricao varchar(150)
);


CREATE TABLE produto(
    id serial not null primary key,
    descricao varchar(100),
    quantidade integer,
    preco double precision,
    id_categoria integer,
    foreign key (id_categoria) references categoria(id)
);