CREATE DATABASE db_rh;

CREATE TABLE tb_colaboradores(
	id BIGINT AUTO_INCREMENT ,
    nome VARCHAR(150),
    idade INT,
    salario DECIMAL(7,2), -- quantidade de numeros totais e depois da virgula
	cargo VARCHAR(30),
    
    PRIMARY KEY(id)
);

INSERT INTO tb_colaboradores(nome, idade, salario, cargo)
VALUES("Mariane",25,8000.99,"Desenvolvedora Sr."); -- insert into e values são um unico comando, com quebra de linha

INSERT INTO tb_colaboradores(nome, idade, salario, cargo)
VALUES("Juliana",27,1500.00,"Estagiaria"); 

INSERT INTO tb_colaboradores(nome, idade, salario, cargo)
VALUES("Roberto",18,5000.00,"Desenvolvedor Jr."); 

INSERT INTO tb_colaboradores(nome, idade, salario, cargo)
VALUES("Camila ",21,1200.99,"Estagiaria"); 

INSERT INTO tb_colaboradores(nome, idade, salario, cargo)
VALUES("Paulo",28,9500.99,"Desenvolvedor Sr."); 

SELECT * FROM tb_colaboradores; 

SELECT nome FROM tb_colaboradores; 

SELECT * FROM tb_colaboradores WHERE salario > 2000.00;

SELECT * FROM tb_colaboradores WHERE salario < 2000.00;

SET SQL_SAFE_UPDATES = 1; 

UPDATE tb_colaboradores SET salario = 8500.00 WHERE id = 1;