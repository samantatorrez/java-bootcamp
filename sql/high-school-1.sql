-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema high-school
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema high-school
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `high-school` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `high-school` ;

-- -----------------------------------------------------
-- Table `high-school`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high-school`.`Student` (
  `student_first_name` CHAR(20) NOT NULL,
  `student_last_name` CHAR(20) NOT NULL,
  `registration_number` INT(11) NOT NULL,
  `student_date_of_birth` DATE NOT NULL,
  PRIMARY KEY (`registration_number`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `high-school`.`Teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high-school`.`Teacher` (
  `first_name` CHAR(20) NOT NULL,
  `last_name` CHAR(20) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `teacher_id` CHAR(20) NOT NULL,
  PRIMARY KEY (`teacher_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `high-school`.`Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high-school`.`Course` (
  `course_name` CHAR(20) NOT NULL,
  `hours_by_week` INT UNSIGNED NOT NULL,
  `schedule_time` INT UNSIGNED NOT NULL,
  `Teacher_id` CHAR(20) NOT NULL,
  PRIMARY KEY (`course_name`, `Teacher_id`),
  INDEX `fk_Course_Teacher1_idx` (`Teacher_id` ASC),
  CONSTRAINT `fk_Course_Teacher1`
    FOREIGN KEY (`Teacher_id`)
    REFERENCES `high-school`.`Teacher` (`teacher_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `high-school`.`Student_assist_Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high-school`.`Student_assist_Course` (
  `Student_registration_number` INT(11) NOT NULL,
  `Course_name` CHAR(20) NOT NULL,
  `first_partial` DOUBLE UNSIGNED NULL,
  `second_partial` DOUBLE UNSIGNED NULL,
  `third_partial` DOUBLE UNSIGNED NULL,
  `final` DOUBLE UNSIGNED NULL,
  PRIMARY KEY (`Student_registration number`, `Course_name`),
  INDEX `fk_Student_has_Course_Course1_idx` (`Course_name` ASC),
  INDEX `fk_Student_has_Course_Student_idx` (`Student_registration number` ASC),
  CONSTRAINT `fk_Student_has_Course_Student`
    FOREIGN KEY (`Student_registration number`)
    REFERENCES `high-school`.`Student` (`registration_number`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Student_has_Course_Course1`
    FOREIGN KEY (`Course_name`)
    REFERENCES `high-school`.`Course` (`course_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
