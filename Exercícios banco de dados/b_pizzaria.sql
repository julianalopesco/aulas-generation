CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_classe(
id bigint AUTO_INCREMENT,
categoria VARCHAR(255) NOT NULL,
tipo VARCHAR(255) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE tb_pizzas(
id BIGINT AUTO_INCREMENT,
sabor VARCHAR(70) NOT NULL,
preco DECIMAL(4,2),
qtde_estoque BIGINT,
categoria_id BIGINT,
PRIMARY KEY(id),
FOREIGN KEY (categoria_id) REFERENCES tb_classe(id)
);

INSERT INTO tb_classe (categoria, tipo)
VALUES("Vegetariana","Pizza");

INSERT INTO tb_classe (categoria, tipo)
VALUES("Vegetariana", "Esfirra");

INSERT INTO tb_classe (categoria, tipo)
VALUES("Carnes", "Pizza");

INSERT INTO tb_classe (categoria, tipo)
VALUES ("Carnes", "Esfirra");

INSERT INTO tb_classe (categoria, tipo)
VALUES("Doce","Esfirra");

SELECT * FROM tb_classe;

INSERT INTO tb_pizzas (sabor, preco, qtde_estoque, categoria_id)
VALUES("Frango",30.00, 07, 3);

INSERT INTO tb_pizzas (sabor, preco, qtde_estoque, categoria_id)
VALUES("Carne",03.50,08,4);

INSERT INTO tb_pizzas (sabor, preco, qtde_estoque, categoria_id)
VALUES("4 queijos",48.00,12,1);

INSERT INTO tb_pizzas (sabor, preco, qtde_estoque, categoria_id)
VALUES("Queijo",01.50,30,2);

INSERT INTO tb_pizzas (sabor, preco, qtde_estoque, categoria_id)
VALUES("Brigadeiro",03.50,25,5);

INSERT INTO tb_pizzas (sabor, preco, qtde_estoque, categoria_id)
VALUES("Palmito",25.00,14,1);

INSERT INTO tb_pizzas (sabor, preco, qtde_estoque, categoria_id)
VALUES("Carne Seca",58.00,07,3);

INSERT INTO tb_pizzas (sabor, preco, qtde_estoque, categoria_id)
VALUES("Calabresa",70.00,08,3);

SELECT * FROM tb_pizzas;

SELECT * FROM tb_pizzas WHERE preco > 45.00;

SELECT * FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100.00;

SELECT * FROM tb_pizzas WHERE sabor LIKE "%c%"; 

SELECT * FROM tb_pizzas 
INNER JOIN tb_classe
ON tb_pizzas.categoria_id=tb_classe.id;

SELECT * FROM tb_pizzas
INNER JOIN tb_classe 
ON tb_pizzas.categoria_id=tb_classe.id
WHERE tb_classe.id = 1;