CREATE TABLE categoria(
    id serial NOT NULL PRIMARY KEY,
    descricao varchar(150)
);


CREATE TABLE produto(
    id serial NOT NULL PRIMARY KEY,
    descricao varchar(100),
    quantidade integer,
    preco double precision,
    id_categoria integer,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id) ON DELETE CASCADE
);

CREATE TABLE usuario(
    id serial NOT NULL PRIMARY KEY,
    usuario varchar(100),
    senha varchar(250)
)

SELECT
    p.id AS id_produto,
    p.descricao AS ds_produto, 
    p.quantidade,
    p.preco,
    c.id AS id_categoria,
    c.descricao AS ds_categoria
FROM
    produto p 
INNER JOIN categoria c ON p.id_categoria = c.id

-- criação da view

CREATE OR REPLACE view_produtocategoria AS 
SELECT
    p.id AS id_produto,
    p.descricao AS ds_produto, 
    p.quantidade,
    p.preco,
    c.id AS id_categoria,
    c.descricao AS ds_categoria
FROM
    produto p 
INNER JOIN categoria c ON p.id_categoria = c.id