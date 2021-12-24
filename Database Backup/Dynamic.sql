/*
SQLyog Ultimate v11.33 (32 bit)
MySQL - 5.5.1-m2-community : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `adminlogintable` */

DROP TABLE IF EXISTS `adminlogintable`;

CREATE TABLE `adminlogintable` (
  `adminid` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `question` varchar(40) NOT NULL,
  `answers` varchar(30) NOT NULL,
  PRIMARY KEY (`adminid`,`password`,`question`,`answers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `adminlogintable` */

insert  into `adminlogintable`(`adminid`,`password`,`question`,`answers`) values ('achint','achii','abc','abc'),('aparna','tubelight','abc','abc');

/*Table structure for table `clientlogintable` */

DROP TABLE IF EXISTS `clientlogintable`;

CREATE TABLE `clientlogintable` (
  `clientId` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`clientId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `clientlogintable` */

insert  into `clientlogintable`(`clientId`,`password`) values ('achint','achint0610');

/*Table structure for table `college` */

DROP TABLE IF EXISTS `college`;

CREATE TABLE `college` (
  `regNo` varchar(100) NOT NULL,
  `collegeName` varchar(100) DEFAULT NULL,
  `services` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`regNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `college` */

insert  into `college`(`regNo`,`collegeName`,`services`) values ('121212','Black Ship','pirates');

/*Table structure for table `complaintable` */

DROP TABLE IF EXISTS `complaintable`;

CREATE TABLE `complaintable` (
  `id` varchar(20) DEFAULT NULL,
  `complainNo` varchar(20) NOT NULL,
  `caption` varchar(50) DEFAULT NULL,
  `discription` varchar(100) DEFAULT NULL,
  `complainDate` varchar(100) DEFAULT NULL,
  `solvedBy` varchar(100) DEFAULT NULL,
  `contactno` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`complainNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `complaintable` */

insert  into `complaintable`(`id`,`complainNo`,`caption`,`discription`,`complainDate`,`solvedBy`,`contactno`) values ('achint','1998220400','hjgjahd','jjhjd','22/2/21','Aparna','523654834'),(NULL,'9990117855','asf','khkbb','22/2/21','Aparna','gh');

/*Table structure for table `demo` */

DROP TABLE IF EXISTS `demo`;

CREATE TABLE `demo` (
  `a` int(11) DEFAULT NULL,
  `b` int(11) DEFAULT NULL,
  `id` varchar(100) DEFAULT NULL,
  `pass` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `demo` */

/*Table structure for table `fatab` */

DROP TABLE IF EXISTS `fatab`;

CREATE TABLE `fatab` (
  `fa_Id` varchar(255) NOT NULL,
  `faculty_name` varchar(255) DEFAULT NULL,
  `faculty_pass` varchar(255) DEFAULT NULL,
  `faculty_dept` varchar(255) DEFAULT NULL,
  `faculty_subject` varchar(255) DEFAULT NULL,
  `faculty_contact` varchar(255) DEFAULT NULL,
  `operator_mail_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fa_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fatab` */

insert  into `fatab`(`fa_Id`,`faculty_name`,`faculty_pass`,`faculty_dept`,`faculty_subject`,`faculty_contact`,`operator_mail_id`) values ('acgcgg','adsf','ABC123','jhg','jh','gj','gj'),('achint','achint0610','ACHINT','ComputerScience','Data Structure','8871132171','achint.rawal@gmail.com'),('achint0610','achint0610','ACHINT','ComputerScience','Data Structure','8871132171','achint.rawal@gmail.com'),('rah','rah','rah','CS','Java','0817420830','achint.rawal@gmail.com');

/*Table structure for table `fatab1` */

DROP TABLE IF EXISTS `fatab1`;

CREATE TABLE `fatab1` (
  `fa_Id` varchar(255) NOT NULL,
  `faculty_name` varchar(255) DEFAULT NULL,
  `faculty_pass` varchar(255) DEFAULT NULL,
  `faculty_dept` varchar(255) DEFAULT NULL,
  `faculty_subject` varchar(255) DEFAULT NULL,
  `faculty_contact` varchar(255) DEFAULT NULL,
  `operator_mail_id` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `DOB` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fa_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fatab1` */

insert  into `fatab1`(`fa_Id`,`faculty_name`,`faculty_pass`,`faculty_dept`,`faculty_subject`,`faculty_contact`,`operator_mail_id`,`address`,`DOB`) values ('acgcgg','rarararara','ABC123','kh','ghj','gj','gj','jhjhgjhjhjgjg','11 2 2021'),('rah','rah','rah','rah','rah','rah','rah','rah','rah');

/*Table structure for table `feedbacktable` */

DROP TABLE IF EXISTS `feedbacktable`;

CREATE TABLE `feedbacktable` (
  `id` varchar(30) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `feedback` varchar(1000) DEFAULT NULL,
  `mailid` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `feedbacktable` */

insert  into `feedbacktable`(`id`,`type`,`feedback`,`mailid`) values ('achint','yo','yo','yo'),('yo','yoyo','yo','yo'),('vbvjhv','jggfjgf','jfj','gfj'),('jhg','jhg','jhhg','jhg'),('jhg','jh','gjh','gjh'),('gjh','gj','hg','jhg'),('jhg','jhg','jh','gjkh'),('gj','hg','jhg','jhg'),('jhg','jhg','jh','jh'),('gjh','g','jhg','jh'),('jhgj','jhggjhg','gj','jhg');

/*Table structure for table `newstab` */

DROP TABLE IF EXISTS `newstab`;

CREATE TABLE `newstab` (
  `serialNo` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `caption` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `postDate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`serialNo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `newstab` */

insert  into `newstab`(`serialNo`,`name`,`caption`,`description`,`postDate`) values (1,'rah','akkad bakkad','bambe bo','13/3/21'),(2,'rah','yo yo ','honey singh ','13/3/21'),(3,'rah','dheere dheere ','zindagi me aana','13/3/21');

/*Table structure for table `operatorlogintable` */

DROP TABLE IF EXISTS `operatorlogintable`;

CREATE TABLE `operatorlogintable` (
  `empid` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `empname` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `mobileNo` bigint(50) NOT NULL,
  `emailid` varchar(50) NOT NULL,
  `question` varchar(50) DEFAULT NULL,
  `answers` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`empid`,`mobileNo`,`emailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `operatorlogintable` */

insert  into `operatorlogintable`(`empid`,`password`,`empname`,`gender`,`address`,`mobileNo`,`emailid`,`question`,`answers`) values ('achint','achii','achint','achint','achint',3412235,'achint','achint','achint');

/*Table structure for table `optab` */

DROP TABLE IF EXISTS `optab`;

CREATE TABLE `optab` (
  `operator_Id` varchar(255) NOT NULL,
  `operator_name` varchar(255) DEFAULT NULL,
  `operator_pass` varchar(255) DEFAULT NULL,
  `operator_Contact` varchar(255) DEFAULT NULL,
  `operator_mail_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`operator_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `optab` */

insert  into `optab`(`operator_Id`,`operator_name`,`operator_pass`,`operator_Contact`,`operator_mail_id`) values ('achint0610','achint','ACHINT','0987653748','achint.rawal@gmail.com'),('rah','rah','rah','9387492383','achint.rawal@gmail.com');

/*Table structure for table `ordertable` */

DROP TABLE IF EXISTS `ordertable`;

CREATE TABLE `ordertable` (
  `userId` varchar(100) DEFAULT NULL,
  `prodId` varchar(100) DEFAULT NULL,
  `totalAmount` varchar(100) DEFAULT NULL,
  `quatity` varchar(100) DEFAULT NULL,
  `price` varchar(100) DEFAULT NULL,
  `destinationAddress` varchar(100) DEFAULT NULL,
  `payment` varchar(100) DEFAULT NULL,
  `orderDate` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ordertable` */

insert  into `ordertable`(`userId`,`prodId`,`totalAmount`,`quatity`,`price`,`destinationAddress`,`payment`,`orderDate`) values ('achint ','GBZQTNCHMH','as','3000','3000','asas','COD','22/2/21'),('achint','WBYAQQUXNM','1','3000','3000','sakfgakhsfg','Paytm','22/2/21'),('achint','RWGPVSVWWJ','3000','1','3000','rfrgt','Debit/Credit Card','22/2/21');

/*Table structure for table `producttable` */

DROP TABLE IF EXISTS `producttable`;

CREATE TABLE `producttable` (
  `sellerid` varchar(30) DEFAULT NULL,
  `prodId` varchar(30) NOT NULL,
  `prodName` varchar(30) DEFAULT NULL,
  `quantityLeft` varchar(30) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `category` varchar(30) DEFAULT NULL,
  `offer` varchar(30) DEFAULT NULL,
  `price` varchar(30) DEFAULT NULL,
  `updatedate` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`prodId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `producttable` */

insert  into `producttable`(`sellerid`,`prodId`,`prodName`,`quantityLeft`,`description`,`category`,`offer`,`price`,`updatedate`) values ('achii','achint','achint','200','achint','achint','achint','4000','achint'),('achii','achintt','rawal','300','achint','rawal','achint','400','achint '),('achii','aparna','aparna','100','aparna','aparna','aparna','23333','aparna'),('achint0610','TTVCTGDGUD','Facewash','20','Lemon Extract Face Wash','Pottery','0%','150','9/2/21'),('achii','XHZVLPE','Pot','20','It is a pot with nice design on it.','Pottery','5%','200','9/2/21');

/*Table structure for table `qtab` */

DROP TABLE IF EXISTS `qtab`;

CREATE TABLE `qtab` (
  `SerialNo` int(255) NOT NULL,
  `StuName` varchar(767) DEFAULT NULL,
  `FaName` varchar(767) DEFAULT NULL,
  `query` varchar(767) DEFAULT NULL,
  `requestDate` varchar(767) DEFAULT NULL,
  `to1` varchar(767) DEFAULT NULL,
  `from1` varchar(767) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SerialNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `qtab` */

insert  into `qtab`(`SerialNo`,`StuName`,`FaName`,`query`,`requestDate`,`to1`,`from1`,`status`) values (1,'achint','achint','doubthai','ksajhsf','kjh','kjh',NULL),(2,'kshf`khj','kjh','kjh','kjh','kjh','kjh',NULL),(3,'achint','kj','kj','kj','kjh','kadadjlh',NULL),(4,'achint','rawal','aparna','212121','llaja','ooaoalk',NULL),(5,'achint','rah','rah','rah','rah','rah',NULL),(6,'gupta','rah','rah','rah','rah','rah',NULL);

/*Table structure for table `qtab1` */

DROP TABLE IF EXISTS `qtab1`;

CREATE TABLE `qtab1` (
  `serialNo` int(11) NOT NULL AUTO_INCREMENT,
  `stuName` varchar(255) DEFAULT NULL,
  `FaName` varchar(255) DEFAULT NULL,
  `query` varchar(255) DEFAULT NULL,
  `requestDate` varchar(255) DEFAULT NULL,
  `to1` varchar(255) DEFAULT NULL,
  `from1` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`serialNo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `qtab1` */

insert  into `qtab1`(`serialNo`,`stuName`,`FaName`,`query`,`requestDate`,`to1`,`from1`,`status`) values (1,'achint','rah','jkhsa','13/3/21','18 2 2021','11 2 2021','accepted'),(2,'achint','achint','jkhsa','13/3/21','18 2 2021','11 2 2021','not processed');

/*Table structure for table `returntable` */

DROP TABLE IF EXISTS `returntable`;

CREATE TABLE `returntable` (
  `id` varchar(20) DEFAULT NULL,
  `returnDate` varchar(10) DEFAULT NULL,
  `returnReason` varchar(50) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `paymentRefund` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `returntable` */

/*Table structure for table `sellerlogintable` */

DROP TABLE IF EXISTS `sellerlogintable`;

CREATE TABLE `sellerlogintable` (
  `sellerName` varchar(30) DEFAULT NULL,
  `sellerid` varchar(30) NOT NULL,
  `password` varchar(30) DEFAULT NULL,
  `contactNo` varchar(30) NOT NULL,
  `emailId` varchar(30) NOT NULL,
  `address` varchar(30) DEFAULT NULL,
  `dateOfBirth` varchar(10) DEFAULT NULL,
  `Aadhar No.` varchar(16) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `question` varchar(50) DEFAULT NULL,
  `answers` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sellerid`,`contactNo`,`emailId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sellerlogintable` */

insert  into `sellerlogintable`(`sellerName`,`sellerid`,`password`,`contactNo`,`emailId`,`address`,`dateOfBirth`,`Aadhar No.`,`gender`,`question`,`answers`) values ('Achint Rawal','','',' 1132171','achint.rawal@gmail.com','dama nagar','','','Select Gender','Select Question',''),('Achint Rawal','','','08871132171','achint.rawal@gmail.com','264-A Sudama nagar','','','Select Gender','Select Question',''),('Achint Rawal','','','123213','achint.rawal@gmail.com','264-A Sudama nagar','','','Select Gender','Select Question',''),('Achint Rawal','acac','acac',' 1132171','achint.rawal@gmail.com','dama nagar','','','Select Gender','Select Question',''),('Achint Rawal','achint','achii','08871132171','achint.rawal@gmail.com','264-A Sudama nagar','1999-10-06','','Select Gender','Select Question',''),('asfaf','sdsdfdsfsdfds','Achint Rawal','8871132171','achint.rawal@gmail.com','264-A Sudama nagar','1999-10-06','186481646864','Male','Name of your pet?','coco');

/*Table structure for table `sttab` */

DROP TABLE IF EXISTS `sttab`;

CREATE TABLE `sttab` (
  `student_Id` varchar(255) NOT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `student_pass` varchar(255) DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `student_course` varchar(255) DEFAULT NULL,
  `student_section` varchar(255) DEFAULT NULL,
  `student_year` varchar(255) DEFAULT NULL,
  `student_contact` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sttab` */

insert  into `sttab`(`student_Id`,`student_name`,`student_pass`,`dob`,`student_course`,`student_section`,`student_year`,`student_contact`) values ('abc','rah','rah','rah','rah','rah','rah','rah'),('achint','achint0610','rah','06/10/1999','ComputerScience','CS1','third year','8871132171'),('achint0610','Achint','ACHINT','06/10/1999','ComputerScience','CS1','third year','8871132171'),('achintassa','demo','ABC123','4 2 2021','jashd','jghjg','jh','gjh'),('aparna','demo','ABC123','13 2 2021','k','hk','jhk','h'),('jhgj','acgcgg','ABC123','4 2 2021','jhg','jhg','jh','jhg'),('rah','demo','ABC123','9 2 2021','cs','abc','2121','987654321');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `regNo` varchar(100) DEFAULT NULL,
  `raNo` varchar(100) NOT NULL,
  `studentName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`raNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student` */

insert  into `student`(`regNo`,`raNo`,`studentName`) values ('121212','11','jack Sparrow'),('121212','12','Aparna Gupta');

/*Table structure for table `userlogintable` */

DROP TABLE IF EXISTS `userlogintable`;

CREATE TABLE `userlogintable` (
  `userId` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `contactNo` varchar(10) NOT NULL,
  `emailId` varchar(30) NOT NULL,
  `address` varchar(30) DEFAULT NULL,
  `dateOfBirth` varchar(10) DEFAULT NULL,
  `question` varchar(40) DEFAULT NULL,
  `answer` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`userId`,`contactNo`,`emailId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `userlogintable` */

insert  into `userlogintable`(`userId`,`password`,`userName`,`contactNo`,`emailId`,`address`,`dateOfBirth`,`question`,`answer`) values ('Achint','achii1','achint rawal','10830194','achint.rawal@gmail.com','264-A Sudama nagar','06/10/1999','Name of your pet?','coco'),('achint','achii','achint','1234567890','achint.rawal@gmail.com','264-A Sudama Nagar','06/10/1999','dog name?','coco'),('ACHINT','achint','Achint','8888888888','achint@gmail.com','adsas','1999-10-06','Name of your pet?','coco'),('achint','achii1','asdasdf','dasfda','dafadf@gmail.com','dfdf\r\n','1212-12-12','Name of your pet?','coco'),('achint0610','achint0610','kjdsdkj','kjb','khg@gmail.com','jhg','','Select Question',''),('achint1111','1111','','','','','','Select Question',''),('aeeqg','ug','jhg','g','ig@gmail.com','jhg','','Select Question','jhg'),('kjk','jhk','jkj','','hjjkkjh@gmail.com','jk','1212-12-12','What is your favourite colour?','122122');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
