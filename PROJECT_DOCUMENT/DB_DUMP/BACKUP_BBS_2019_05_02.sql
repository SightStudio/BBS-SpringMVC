-- MySQL dump 10.13  Distrib 5.7.24, for Win64 (x86_64)
--
-- Host: localhost    Database: bbs
-- ------------------------------------------------------
-- Server version	5.7.24-log

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
-- Table structure for table `bbs`
--

DROP TABLE IF EXISTS `bbs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bbs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `content` mediumtext NOT NULL,
  `flag` int(1) NOT NULL,
  `time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bbs`
--

LOCK TABLES `bbs` WRITE;
/*!40000 ALTER TABLE `bbs` DISABLE KEYS */;
INSERT INTO `bbs` VALUES (1,'하 이걸 이렇게 하네','하하하하ㅏ\r\n',1,'2018-12-19 23:56:27'),(2,'sdf','sdf',1,'2018-12-19 23:56:49'),(3,'sdf','sdf',1,'2018-12-20 10:53:21'),(4,'이제 뷰단에 뿌리즈아','페이징 끗낫드아....',1,'2018-12-20 11:26:35'),(5,'빼애애애액','어허허헣허헣후ㅜㅜㅜ',1,'2018-12-20 11:26:49'),(6,'아니다 아직 안끗낫드아','ㅜㅜㅜㅜ....',1,'2018-12-20 11:31:43'),(7,'더 하즈아...','ㅡㄲ',1,'2018-12-20 11:31:51'),(8,'빼애애액','ㅜㅜ',1,'2018-12-20 11:31:57'),(9,'키에엥엑','이ㅣ키킼',1,'2018-12-20 14:15:02'),(10,'sadf','asdf',1,'2018-12-20 15:54:39'),(11,'asdf','adsf',1,'2018-12-20 15:54:42'),(12,'asdf','asdf',1,'2018-12-20 15:54:45'),(13,'sdf','sdf',1,'2018-12-20 15:54:48'),(14,'asdf','asdf',1,'2018-12-20 15:54:50'),(15,'asdf','asdf',1,'2018-12-20 15:54:53'),(16,'asdfasdfasdf','asdfasdfasdf',1,'2018-12-20 15:54:56'),(17,'asdfasdfasdf','asdfasdf',1,'2018-12-20 15:55:00'),(18,'asdfasdfasdf','asdfasdfasdf',1,'2018-12-20 15:55:03'),(19,'asdfasdfasdf','sdfasdfa',1,'2018-12-20 15:55:06'),(20,'asdfasdfasdfasd','asdfasdfasdf',1,'2018-12-20 15:55:11'),(21,'qweq','q',1,'2018-12-20 15:55:14'),(22,'qweqwe','qweqwe',1,'2018-12-20 15:55:16'),(23,'fdsf','qew',1,'2018-12-20 15:55:20'),(24,'qweqweqwe','qwe',1,'2018-12-20 15:55:22'),(25,'qweqwe','qweqwe',1,'2018-12-20 15:55:26'),(26,'qweqwe','qweqwe',1,'2018-12-20 15:55:30'),(27,'asasdf','adfasd',1,'2018-12-20 15:55:35'),(28,'asdfasdfasdf','asdfasdf',1,'2018-12-20 15:55:38'),(29,'asdfasdfasdf','asdfasdf',1,'2018-12-20 15:55:41'),(30,'asdfad','asdfsg',1,'2018-12-20 15:55:46'),(31,'dfasdfa','sdfasdfas',1,'2018-12-20 15:55:49'),(32,'asdfasdfasdfasfasdf','asdfasdf',1,'2018-12-20 15:55:52'),(33,'sadfas','asdfas',1,'2018-12-20 15:55:55'),(34,'asddf','asf',1,'2018-12-20 15:55:57'),(35,'asddfadsf','sad',1,'2018-12-20 15:56:00'),(36,'asdfasdfasdf','asdf',1,'2018-12-20 15:56:03'),(37,'saddf','asdf',1,'2018-12-20 15:56:06'),(38,'asdfasdfasdf','asdf',1,'2018-12-20 15:56:10'),(39,'sadf','sadf',1,'2018-12-20 15:56:12'),(40,'수정 해씀','수정수정',1,'2018-12-20 15:56:16'),(41,'asdfasdfasdf','asdf',1,'2018-12-20 15:56:19'),(42,'asdfasdfasdf','asdf',1,'2018-12-20 15:56:21'),(43,'asdfasdfasdf','adsf',1,'2018-12-20 15:56:24'),(44,'asdfasdfasdf','asdf',1,'2018-12-20 15:56:27'),(45,'속도가 안나온다...','꾸에에에에엑',0,'2018-12-20 16:44:53'),(46,'ㅜㅜㅜ','ㅜㅜㅜ',1,'2018-12-20 16:44:57'),(47,'dsf','sdf',0,'2018-12-20 17:33:37'),(48,'sdf','sdf',0,'2018-12-20 20:20:06'),(49,'123213','213123',0,'2018-12-20 21:18:26'),(50,'asfd','asdf',0,'2018-12-20 21:18:31'),(51,'sadfasdf','sadfasdf',0,'2018-12-20 21:18:34'),(52,'ㄴㅇㄹ','ㄴㅇㄹ',0,'2018-12-21 05:49:27'),(53,'ㅏㅏㅏㅏㅏㅏ','ㅏㅏㅏㅏ',0,'2018-12-21 06:15:23'),(54,'sdf','sdf',1,'2018-12-21 10:12:37'),(55,'테스트 케이스 1 ','띠요오오오오오오오오오오ㅗ',1,'2018-12-21 13:04:15'),(56,'XSS 테스트','<script type=\"text/javascript\">\r\n\r\n    window.alert(\'?????\')\r\n\r\n</script>',1,'2018-12-21 13:05:27'),(57,'테스트 케이스','수정수정 김수정',1,'2018-12-21 13:06:02'),(58,'ㄴㅇㄹ','ㄴㅇㄹ',1,'2018-12-21 13:31:09'),(59,'ㅁㄴㅇㄹ','ㅁㄴㅇㄹ',1,'2018-12-21 13:31:15'),(60,'ㄴㅁㅇㄹ','ㅁㄴㅇㄹ',1,'2018-12-21 13:31:18'),(61,'테스트 11111111','테스트 111111',0,'2018-12-21 16:58:42'),(62,'1','1',1,'2019-01-04 23:38:04'),(63,'1','1',1,'2019-01-04 23:38:04'),(64,'1','1',1,'2019-01-04 23:38:04'),(65,'1','1',1,'2019-01-04 23:38:04'),(66,'sadfasasdf','',1,'2019-03-19 15:02:46');
/*!40000 ALTER TABLE `bbs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-02 10:06:36
