-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.6.10 - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para kitnet
DROP DATABASE IF EXISTS `kitnet`;
CREATE DATABASE IF NOT EXISTS `kitnet` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `kitnet`;

-- Copiando estrutura para tabela kitnet.contrato
DROP TABLE IF EXISTS `contrato`;
CREATE TABLE IF NOT EXISTS `contrato` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entrada` date NOT NULL,
  `saida` date NOT NULL,
  `valor` int(11) NOT NULL DEFAULT '0',
  `estudante_id` int(11) NOT NULL DEFAULT '0',
  `quarto_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_contrato_estudante` (`estudante_id`),
  KEY `FK_contrato_quarto` (`quarto_id`),
  CONSTRAINT `FK_contrato_estudante` FOREIGN KEY (`estudante_id`) REFERENCES `estudante` (`id`),
  CONSTRAINT `FK_contrato_quarto` FOREIGN KEY (`quarto_id`) REFERENCES `quarto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela kitnet.estudante
DROP TABLE IF EXISTS `estudante`;
CREATE TABLE IF NOT EXISTS `estudante` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `nascimento` date DEFAULT NULL,
  `telefone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela kitnet.proprietario
DROP TABLE IF EXISTS `proprietario`;
CREATE TABLE IF NOT EXISTS `proprietario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela kitnet.quarto
DROP TABLE IF EXISTS `quarto`;
CREATE TABLE IF NOT EXISTS `quarto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantidade_suportada` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `proprietario_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_quarto_proprietario` (`proprietario_id`),
  CONSTRAINT `FK_quarto_proprietario` FOREIGN KEY (`proprietario_id`) REFERENCES `proprietario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
