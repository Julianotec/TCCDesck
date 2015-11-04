SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bancotcc
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bancotcc` DEFAULT CHARACTER SET utf8 ;
USE `bancotcc` ;

-- -----------------------------------------------------
-- Table `bancotcc`.`funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancotcc`.`funcionario` (
  `idFuncionario` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `senha` VARCHAR(6) NOT NULL,
  `endereço` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(8) NULL DEFAULT NULL,
  `celular` VARCHAR(8) NULL DEFAULT NULL,
  `cidade` VARCHAR(100) NOT NULL,
  `estado` VARCHAR(2) NOT NULL,
  `adm` INT(11) NOT NULL,
  `Salario` INT(11) NOT NULL,
  `Vales` DOUBLE NULL,
  PRIMARY KEY (`idFuncionario`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bancotcc`.`saldo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancotcc`.`saldo` (
  `idsaldo` INT(11) NOT NULL AUTO_INCREMENT,
  `valor` INT(11) NOT NULL,
  PRIMARY KEY (`idsaldo`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bancotcc`.`Extrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancotcc`.`Extrato` (
  `idExtrato` INT NOT NULL,
  `valor` DOUBLE NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `data` DATETIME NOT NULL,
  `nomeFuncionario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idExtrato`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
