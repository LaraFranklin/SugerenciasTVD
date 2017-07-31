CREATE DATABASE  IF NOT EXISTS `televison` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `televison`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: televison
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `canal`
--

DROP TABLE IF EXISTS `canal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `canal` (
  `id_canal` varchar(45) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_canal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canal`
--

LOCK TABLES `canal` WRITE;
/*!40000 ALTER TABLE `canal` DISABLE KEYS */;
INSERT INTO `canal` VALUES ('RTS','Canald e '),('TC','Canal de canal');
/*!40000 ALTER TABLE `canal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `id_categoria` varchar(45) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES ('Educativo','Educar '),('Entretenimiento','Para entretener '),('Noticias','Noticias');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial`
--

DROP TABLE IF EXISTS `historial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historial` (
  `id_usuario` varchar(10) NOT NULL,
  `id_programa` varchar(45) NOT NULL,
  `id_canal` varchar(45) NOT NULL,
  `tiempo` int(11) DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`id_usuario`,`id_programa`,`id_canal`,`fecha`),
  KEY `FKcanal_idx` (`id_programa`),
  CONSTRAINT `FKProa` FOREIGN KEY (`id_programa`) REFERENCES `programa` (`id_programa`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKusuariohistorial` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial`
--

LOCK TABLES `historial` WRITE;
/*!40000 ALTER TABLE `historial` DISABLE KEYS */;
INSERT INTO `historial` VALUES ('1','24 Horas','TC',110,2,'2017-07-26'),('1','Plaza sesamo','RTS',25,1,'2017-07-26'),('2','Plaza sesamo','RTS',20,1,'2017-07-26');
/*!40000 ALTER TABLE `historial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programa`
--

DROP TABLE IF EXISTS `programa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `programa` (
  `id_programa` varchar(45) NOT NULL,
  `duracion` int(11) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_fin` time DEFAULT NULL,
  `id_tipoprograma` varchar(45) DEFAULT NULL,
  `id_categoria` varchar(45) DEFAULT NULL,
  `id_canal` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_programa`),
  KEY `FKTipo_idx` (`id_tipoprograma`),
  KEY `FKCategoria_idx` (`id_categoria`),
  KEY `CFCana_idx` (`id_canal`),
  CONSTRAINT `CFCana` FOREIGN KEY (`id_canal`) REFERENCES `canal` (`id_canal`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `CFCate` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKTipo` FOREIGN KEY (`id_tipoprograma`) REFERENCES `tipoprograma` (`id_tipoprograma`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programa`
--

LOCK TABLES `programa` WRITE;
/*!40000 ALTER TABLE `programa` DISABLE KEYS */;
INSERT INTO `programa` VALUES ('24 Horas',110,'Noticas','/media/videos/24horas.mp4','18:00:00','20:00:00','B','Noticias','TC'),('ECTV',30,'Entretenimiento','/media/videos/ectv.mp4','11:30:00','12:00:00','A','Noticias','TC'),('Plaza sesamo',25,'Noticias','/media/videos/plaza.mp4','12:00:00','13:00:00','A','Noticias','RTS');
/*!40000 ALTER TABLE `programa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoprograma`
--

DROP TABLE IF EXISTS `tipoprograma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoprograma` (
  `id_tipoprograma` varchar(45) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `edad_restringida` int(11) NOT NULL,
  PRIMARY KEY (`id_tipoprograma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoprograma`
--

LOCK TABLES `tipoprograma` WRITE;
/*!40000 ALTER TABLE `tipoprograma` DISABLE KEYS */;
INSERT INTO `tipoprograma` VALUES ('A','todo el publico',0),('B','Con supervision de un adulto',12),('c','mayores de edad',18);
/*!40000 ALTER TABLE `tipoprograma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id_usuario` varchar(10) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `genero` varchar(15) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `imagen` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('1','Juan','Perez','M','1992-12-12','Sin ','/media/1.jpg'),('2','Pepe','Calle','M','1982-05-15','S/N','/media/2.jpg');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-30 20:18:57
