CREATE DATABASE  IF NOT EXISTS `supersenac` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `supersenac`;
-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: supersenac
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `CPFCliente` varchar(30) NOT NULL,
  `nomeCliente` varchar(40) NOT NULL,
  `enderecoCliente` varchar(50) NOT NULL,
  `dataNascimento` date NOT NULL,
  `emailCliente` varchar(40) NOT NULL,
  `sexoCliente` varchar(20) NOT NULL,
  `estadoCivil` varchar(30) NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `CPFCliente` (`CPFCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'431.833.458-97','Leonardo Fujimura','aaaa','2002-03-30','asdasd@afada.com','Masculino','Solteiro(a)'),(2,'111.111.111-11','Leonardo chaves','asd1','2022-11-03','qwe123','Masculino','Casado(a)'),(3,'123.123.123-12','Leonardo Soares','asdasdwq','2022-11-08','qwe123','Masculino','Viúvo(a)'),(4,'555.555.555-55','Lucas Arthur','asdasf','2022-11-15','q1234','Masculino','Separado(a)'),(5,'777.777.777-77','çlçlç','jjkhj','2022-11-04','sfdsds','Masculino','Casado(a)'),(6,'333.333.333-33','renan','asdads','2022-11-02','gkjjjgjg','Masculino','Casado(a)');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-08 19:12:55
