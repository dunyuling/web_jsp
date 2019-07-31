 -- Not Work 不能自动建表
 CREATE TABLE `teacher` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(1000) DEFAULT NULL,
  `address` varchar(2000) DEFAULT NULL,
  `grade_id` int(11) NOT NULL,
  constraint `teacher_grade_fk` FOREIGN KEY(`grade_id`) REFERENCES `grade`(`id`),
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


create TABLE `grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;