SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema BancoTCC
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `BancoTCC` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `BancoTCC` ;

-- -----------------------------------------------------
-- Table `BancoTCC`.`Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BancoTCC`.`Funcionario` (
  `idFuncionario` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `senha` VARCHAR(6) NOT NULL,
  `endereço` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(8) NULL,
  `celular` VARCHAR(8) NULL,
  `cidade` VARCHAR(100) NOT NULL,
  `estado` VARCHAR(2) NOT NULL,
  `adm` INT NOT NULL,
  `Salario` INT NOT NULL,
  PRIMARY KEY (`idFuncionario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BancoTCC`.`Adiantamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BancoTCC`.`Adiantamento` (
  `idVales` INT NOT NULL  AUTO_INCREMENT,
  `valor` INT NOT NULL,
  `data` DATETIME NOT NULL,
  `idFuncionario` INT NOT NULL,
  `descricao` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idVales`),
  INDEX `fk_Vales_Funcionario_idx` (`idFuncionario` ASC),
  CONSTRAINT `fk_Vales_Funcionario`
    FOREIGN KEY (`idFuncionario`)
    REFERENCES `BancoTCC`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BancoTCC`.`saques`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BancoTCC`.`saques` (
  `idsaques` INT NOT NULL  AUTO_INCREMENT,
  `valor` INT NOT NULL,
  `data` DATETIME NOT NULL,
  `idFuncionario` INT NOT NULL,
  `descricao` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idsaques`),
  INDEX `fk_saques_Funcionario1_idx` (`idFuncionario` ASC),
  CONSTRAINT `fk_saques_Funcionario1`
    FOREIGN KEY (`idFuncionario`)
    REFERENCES `BancoTCC`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BancoTCC`.`deposito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BancoTCC`.`deposito` (
  `iddeposito` INT NOT NULL  AUTO_INCREMENT,
  `valor` INT NOT NULL,
  `data` DATETIME NOT NULL,
  `idFuncionario` INT NOT NULL,
  PRIMARY KEY (`iddeposito`),
  INDEX `fk_deposito_Funcionario1_idx` (`idFuncionario` ASC),
  CONSTRAINT `fk_deposito_Funcionario1`
    FOREIGN KEY (`idFuncionario`)
    REFERENCES `BancoTCC`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BancoTCC`.`saldo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BancoTCC`.`saldo` (
  `idsaldo` INT NOT NULL  AUTO_INCREMENT,
  `valor` INT NOT NULL,
  PRIMARY KEY (`idsaldo`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT  INTO saldo (valor)VALUES  (1000)


