CREATE DATABASE IF NOT EXISTS DB_ESTOQUE;
USE DB_ESTOQUE;

CREATE TABLE IF NOT EXISTS TB_PESSOA (
	PES_ID INT PRIMARY KEY AUTO_INCREMENT,
	PES_NOME VARCHAR(50),
	PES_LOGIN VARCHAR(50),
	PES_SENHA VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS TB_EMAIL (
	EMAIL_ID INT PRIMARY KEY AUTO_INCREMENT,
	EMAIL_ENDERECO VARCHAR(50),
	EMAIL_PES_ID INT,
	FOREIGN KEY (EMAIL_PES_ID) REFERENCES TB_PESSOA(PES_ID)
);

CREATE TABLE IF NOT EXISTS TB_TELEFONE (
	TEL_ID INT PRIMARY KEY AUTO_INCREMENT,
	TEL_TELEFONE VARCHAR(30),
	TEL_PES_ID INT,
	FOREIGN KEY (TEL_PES_ID) REFERENCES TB_PESSOA(PES_ID)
);

CREATE TABLE IF NOT EXISTS TB_FUNCIONARIO (
	FUN_CPF VARCHAR(20) UNIQUE KEY,
	FUN_RG VARCHAR(20),
	FUN_TURNO INT,
	FUN_PES_ID INT PRIMARY KEY,
	FOREIGN KEY (FUN_PES_ID) REFERENCES TB_PESSOA(PES_ID)
);

CREATE TABLE IF NOT EXISTS TB_CLIENTE (
	CLI_DATA_NASCIMENTO VARCHAR(10),
	CLI_PES_ID INT PRIMARY KEY,
	FOREIGN KEY (CLI_PES_ID) REFERENCES TB_PESSOA(PES_ID)
);

CREATE TABLE IF NOT EXISTS TB_PRODUTO (
	PRO_ID INT PRIMARY KEY AUTO_INCREMENT,
	PRO_NOME VARCHAR(100),
	PRO_QNT INT,
	PRO_CATEGORIA INT,
	PRO_PRECO DECIMAL(7,2)
);

CREATE TABLE IF NOT EXISTS TB_VENDAS (
	VEND_ID INT PRIMARY KEY AUTO_INCREMENT,
	VEND_DATA VARCHAR(10),
	VEND_FUN_PES_ID INT,
	VEND_CLI_PES_ID INT,
	FOREIGN KEY (VEND_CLI_PES_ID) REFERENCES TB_CLIENTE(CLI_PES_ID),
	FOREIGN KEY (VEND_FUN_PES_ID) REFERENCES TB_FUNCIONARIO(FUN_PES_ID)
);

CREATE TABLE IF NOT EXISTS TB_PRODUTO_VENDIDO (
    	PV_ID INT PRIMARY KEY AUTO_INCREMENT,
	PV_PRO_ID INT,
	PV_VEND_ID INT,
	PV_VEND_PRECO DECIMAL(7,2),
	FOREIGN KEY (PV_PRO_ID) REFERENCES TB_PRODUTO(PRO_ID),
	FOREIGN KEY (PV_VEND_ID) REFERENCES TB_VENDAS(VEND_ID)
);