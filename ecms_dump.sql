-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: ecms
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `associate_payment`
--

DROP TABLE IF EXISTS `associate_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `associate_payment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `invoice_number` varchar(255) NOT NULL,
  `associate` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `fees` decimal(10,0) NOT NULL,
  `tds` decimal(10,0) DEFAULT NULL,
  `GST` decimal(10,0) DEFAULT NULL,
  `payment_mode` varchar(255) NOT NULL,
  `payment_details` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associate_payment`
--

LOCK TABLES `associate_payment` WRITE;
/*!40000 ALTER TABLE `associate_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `associate_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `associates`
--

DROP TABLE IF EXISTS `associates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `associates` (
  `associate_id` int NOT NULL AUTO_INCREMENT,
  `associate_name` varchar(255) NOT NULL,
  PRIMARY KEY (`associate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associates`
--

LOCK TABLES `associates` WRITE;
/*!40000 ALTER TABLE `associates` DISABLE KEYS */;
/*!40000 ALTER TABLE `associates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bills`
--

DROP TABLE IF EXISTS `bills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bills` (
  `invoice_number` int NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `fees` decimal(10,0) NOT NULL,
  `client` varchar(255) NOT NULL,
  `project` varchar(255) NOT NULL,
  `CGST` decimal(10,0) DEFAULT NULL,
  `SGST` decimal(10,0) DEFAULT NULL,
  `IGST` decimal(10,0) DEFAULT NULL,
  `TDS` decimal(10,0) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `payment_details` int DEFAULT NULL,
  `Bill_path` varchar(255) DEFAULT NULL,
  `TDS_paid` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`invoice_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bills`
--

LOCK TABLES `bills` WRITE;
/*!40000 ALTER TABLE `bills` DISABLE KEYS */;
/*!40000 ALTER TABLE `bills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `clientId` int NOT NULL AUTO_INCREMENT,
  `clientName` varchar(255) NOT NULL,
  `GSTNumber` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `websiteUrl` varchar(255) DEFAULT NULL,
  `primaryEmailId` varchar(255) NOT NULL,
  `otherEmailId` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`clientId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'Ultimate International Pvt. Ltd.\n','07AAEPC1024E1ZL','W-139, First Floor, Greater Kailash - I, New Delhi -110048','xyz','spacedesigngroup@rediffmail.com','spacedesigngroup@rediffmail.com','remark');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clients` (
  `client_id` int NOT NULL AUTO_INCREMENT,
  `client_name` varchar(255) NOT NULL,
  `GST_number` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `website_link` varchar(255) NOT NULL,
  `primary_emailId` varchar(255) NOT NULL,
  `other_emailId` varchar(255) NOT NULL,
  `remarks` varchar(255) NOT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES (1,'Ultimate International Pvt. Ltd.\n','07AAEPC1024E1ZL','W-139, First Floor, Greater Kailash - I, New Delhi -110048','xyz','spacedesigngroup@rediffmail.com','spacedesigngroup@rediffmail.com','remark');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact_person`
--

DROP TABLE IF EXISTS `contact_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact_person` (
  `id` int NOT NULL AUTO_INCREMENT,
  `client` int DEFAULT NULL,
  `contact_person` varchar(255) NOT NULL,
  `contact_number` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_person`
--

LOCK TABLES `contact_person` WRITE;
/*!40000 ALTER TABLE `contact_person` DISABLE KEYS */;
INSERT INTO `contact_person` VALUES (1,1,'xyz',1234567891),(2,1,'xyzss',1234567892);
/*!40000 ALTER TABLE `contact_person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daybook`
--

DROP TABLE IF EXISTS `daybook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `daybook` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `payment_mode` varchar(255) DEFAULT NULL,
  `payment_details` varchar(255) DEFAULT NULL,
  `in_amount` decimal(10,0) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `out_amount` decimal(10,0) DEFAULT NULL,
  `person_from` varchar(255) DEFAULT NULL,
  `person_to` varchar(255) DEFAULT NULL,
  `sub_head` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daybook`
--

LOCK TABLES `daybook` WRITE;
/*!40000 ALTER TABLE `daybook` DISABLE KEYS */;
/*!40000 ALTER TABLE `daybook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Emp_id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `joining_date` date NOT NULL,
  `designation` varchar(255) NOT NULL,
  `monthly_salary` decimal(10,0) NOT NULL,
  `email` varchar(225) DEFAULT NULL,
  `last_date` date DEFAULT NULL,
  `current_address` varchar(225) DEFAULT NULL,
  `permanent_address` varchar(225) DEFAULT NULL,
  `mobile_number` int DEFAULT NULL,
  `em_mobile_number` int DEFAULT NULL,
  PRIMARY KEY (`Emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `office expensices`
--

DROP TABLE IF EXISTS `office expensices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `office expensices` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `payment_mode` varchar(255) NOT NULL,
  `payment_details` varchar(255) NOT NULL,
  `remark` varchar(255) NOT NULL,
  `voucher_number` varchar(255) NOT NULL,
  `amount` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `office expensices`
--

LOCK TABLES `office expensices` WRITE;
/*!40000 ALTER TABLE `office expensices` DISABLE KEYS */;
/*!40000 ALTER TABLE `office expensices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_details`
--

DROP TABLE IF EXISTS `payment_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `payment_mode` varchar(255) NOT NULL,
  `payment_details` varchar(255) NOT NULL,
  `client` int DEFAULT NULL,
  `amount` float DEFAULT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_details`
--

LOCK TABLES `payment_details` WRITE;
/*!40000 ALTER TABLE `payment_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project services`
--

DROP TABLE IF EXISTS `project services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project services` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `projcet` varchar(255) NOT NULL,
  `service` varchar(255) NOT NULL,
  `fees` decimal(10,0) NOT NULL,
  `associate` int NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project services`
--

LOCK TABLES `project services` WRITE;
/*!40000 ALTER TABLE `project services` DISABLE KEYS */;
/*!40000 ALTER TABLE `project services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projects` (
  `project_id` int NOT NULL,
  `work_order_status` varchar(255) NOT NULL,
  `project_date` date NOT NULL,
  `project_name` varchar(255) NOT NULL,
  `scope` varchar(255) NOT NULL,
  `agreed_fees` float DEFAULT NULL,
  `client` int DEFAULT NULL,
  `project_location` varchar(255) NOT NULL,
  `construction_type` varchar(255) NOT NULL,
  `project_status` varchar(255) NOT NULL,
  `project_size` varchar(255) NOT NULL,
  `tender_value` decimal(10,0) NOT NULL,
  PRIMARY KEY (`project_id`),
  KEY `Projects_fk0` (`client`),
  CONSTRAINT `Projects_fk0` FOREIGN KEY (`client`) REFERENCES `clients` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projects`
--

LOCK TABLES `projects` WRITE;
/*!40000 ALTER TABLE `projects` DISABLE KEYS */;
/*!40000 ALTER TABLE `projects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary` (
  `emp_id` varchar(255) NOT NULL,
  `Date` date DEFAULT NULL,
  `amount_total` decimal(10,0) DEFAULT NULL,
  `amount_paid` decimal(10,0) DEFAULT NULL,
  `salary_slip` varchar(255) DEFAULT NULL,
  `OT_days` int DEFAULT NULL,
  `OT_hour` int DEFAULT NULL,
  `OT_min` int DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-24 14:04:07
