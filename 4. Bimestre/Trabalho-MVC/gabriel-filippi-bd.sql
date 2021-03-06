-- MySQL Script generated by MySQL Workbench
-- Wed Dec  4 19:40:36 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema gabriel-filippi-4-bim-mvc
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema gabriel-filippi-4-bim-mvc
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `gabriel-filippi-4-bim-mvc` DEFAULT CHARACTER SET utf8 ;
USE `gabriel-filippi-4-bim-mvc` ;

-- -----------------------------------------------------
-- Table `gabriel-filippi-4-bim-mvc`.`produto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gabriel-filippi-4-bim-mvc`.`produto` ;

CREATE TABLE IF NOT EXISTS `gabriel-filippi-4-bim-mvc`.`produto` (
  `id` INT UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `preco` DECIMAL(6,2) UNSIGNED NOT NULL,
  `quantidade` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
