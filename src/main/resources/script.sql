CREATE TABLE produto(
    id serial not null primary key,
    descricao varchar(100),
    quantidade integer,
    preco double precision
);