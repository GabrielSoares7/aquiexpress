-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 13-Dez-2017 às 12:39
-- Versão do servidor: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_estoque`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_cliente`
--

CREATE TABLE IF NOT EXISTS `tb_cliente` (
  `CLI_DATA_CADASTRO` date DEFAULT NULL,
  `CLI_DATA_NASCIMENTO` date DEFAULT NULL,
  `CLI_PES_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_email`
--

CREATE TABLE IF NOT EXISTS `tb_email` (
  `EMAIL_ID` int(11) NOT NULL,
  `EMAIL_ENDERECO` varchar(50) DEFAULT NULL,
  `EMAIL_PES_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_funcionario`
--

CREATE TABLE IF NOT EXISTS `tb_funcionario` (
  `FUN_CPF` varchar(20) DEFAULT NULL,
  `FUN_RG` varchar(20) DEFAULT NULL,
  `FUN_TURNO` int(11) DEFAULT NULL,
  `FUNC_PES_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_pessoa`
--

CREATE TABLE IF NOT EXISTS `tb_pessoa` (
  `PES_ID` int(11) NOT NULL,
  `PES_NOME` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produto`
--

CREATE TABLE IF NOT EXISTS `tb_produto` (
  `PRO_ID` int(11) NOT NULL,
  `PRO_NOME` varchar(30) DEFAULT NULL,
  `PRO_QNT` int(11) DEFAULT NULL,
  `PRO_CATEGORIA` int(11) DEFAULT NULL,
  `PRO_PRECO` decimal(5,2) DEFAULT NULL,
  `PRO_IMAGEM` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produto_vendido`
--

CREATE TABLE IF NOT EXISTS `tb_produto_vendido` (
  `PV_ID` int(11) NOT NULL,
  `PV_PRO_ID` int(11) DEFAULT NULL,
  `PV_VEND_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_telefone`
--

CREATE TABLE IF NOT EXISTS `tb_telefone` (
  `TEL_ID` int(11) NOT NULL,
  `TEL_TELEFONE` varchar(30) DEFAULT NULL,
  `TEL_PES_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_vendas`
--

CREATE TABLE IF NOT EXISTS `tb_vendas` (
  `VEND_ID` int(11) NOT NULL,
  `VEND_FUN_PES_ID` int(11) DEFAULT NULL,
  `VEND_CLI_PES_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_cliente`
--
ALTER TABLE `tb_cliente`
  ADD PRIMARY KEY (`CLI_PES_ID`);

--
-- Indexes for table `tb_email`
--
ALTER TABLE `tb_email`
  ADD PRIMARY KEY (`EMAIL_ID`), ADD KEY `EMAIL_PES_ID` (`EMAIL_PES_ID`);

--
-- Indexes for table `tb_funcionario`
--
ALTER TABLE `tb_funcionario`
  ADD PRIMARY KEY (`FUNC_PES_ID`), ADD UNIQUE KEY `FUN_CPF` (`FUN_CPF`);

--
-- Indexes for table `tb_pessoa`
--
ALTER TABLE `tb_pessoa`
  ADD PRIMARY KEY (`PES_ID`);

--
-- Indexes for table `tb_produto`
--
ALTER TABLE `tb_produto`
  ADD PRIMARY KEY (`PRO_ID`);

--
-- Indexes for table `tb_produto_vendido`
--
ALTER TABLE `tb_produto_vendido`
  ADD PRIMARY KEY (`PV_ID`), ADD KEY `PV_PRO_ID` (`PV_PRO_ID`), ADD KEY `PV_VEND_ID` (`PV_VEND_ID`);

--
-- Indexes for table `tb_telefone`
--
ALTER TABLE `tb_telefone`
  ADD PRIMARY KEY (`TEL_ID`), ADD KEY `TEL_PES_ID` (`TEL_PES_ID`);

--
-- Indexes for table `tb_vendas`
--
ALTER TABLE `tb_vendas`
  ADD PRIMARY KEY (`VEND_ID`), ADD KEY `VEND_CLI_PES_ID` (`VEND_CLI_PES_ID`), ADD KEY `VEND_FUN_PES_ID` (`VEND_FUN_PES_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_email`
--
ALTER TABLE `tb_email`
  MODIFY `EMAIL_ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_pessoa`
--
ALTER TABLE `tb_pessoa`
  MODIFY `PES_ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_produto`
--
ALTER TABLE `tb_produto`
  MODIFY `PRO_ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_produto_vendido`
--
ALTER TABLE `tb_produto_vendido`
  MODIFY `PV_ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_telefone`
--
ALTER TABLE `tb_telefone`
  MODIFY `TEL_ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_vendas`
--
ALTER TABLE `tb_vendas`
  MODIFY `VEND_ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tb_cliente`
--
ALTER TABLE `tb_cliente`
ADD CONSTRAINT `tb_cliente_ibfk_1` FOREIGN KEY (`CLI_PES_ID`) REFERENCES `tb_pessoa` (`PES_ID`);

--
-- Limitadores para a tabela `tb_email`
--
ALTER TABLE `tb_email`
ADD CONSTRAINT `tb_email_ibfk_1` FOREIGN KEY (`EMAIL_PES_ID`) REFERENCES `tb_pessoa` (`PES_ID`);

--
-- Limitadores para a tabela `tb_funcionario`
--
ALTER TABLE `tb_funcionario`
ADD CONSTRAINT `tb_funcionario_ibfk_1` FOREIGN KEY (`FUNC_PES_ID`) REFERENCES `tb_pessoa` (`PES_ID`);

--
-- Limitadores para a tabela `tb_produto_vendido`
--
ALTER TABLE `tb_produto_vendido`
ADD CONSTRAINT `tb_produto_vendido_ibfk_1` FOREIGN KEY (`PV_PRO_ID`) REFERENCES `tb_produto` (`PRO_ID`),
ADD CONSTRAINT `tb_produto_vendido_ibfk_2` FOREIGN KEY (`PV_VEND_ID`) REFERENCES `tb_vendas` (`VEND_ID`);

--
-- Limitadores para a tabela `tb_telefone`
--
ALTER TABLE `tb_telefone`
ADD CONSTRAINT `tb_telefone_ibfk_1` FOREIGN KEY (`TEL_PES_ID`) REFERENCES `tb_pessoa` (`PES_ID`);

--
-- Limitadores para a tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
ADD CONSTRAINT `tb_vendas_ibfk_1` FOREIGN KEY (`VEND_CLI_PES_ID`) REFERENCES `tb_cliente` (`CLI_PES_ID`),
ADD CONSTRAINT `tb_vendas_ibfk_2` FOREIGN KEY (`VEND_FUN_PES_ID`) REFERENCES `tb_funcionario` (`FUNC_PES_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
