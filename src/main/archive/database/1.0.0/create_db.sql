CREATE DATABASE one_adx;

USE one_adx;
SET names utf8;

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
	`id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'blog auto increment primary key',
	`title` varchar(255) NOT NULL COMMENT 'blog title',
	`subtitle` varchar(255) NOT NULL COMMENT 'blog subtitle',
	`author` varchar(255) NOT NULL COMMENT 'blog author',
	`createtime` datetime NOT NULL COMMENT 'blog create time',
	`modtime` datetime NOT NULL COMMENT 'blog last update time',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='blog contents';

insert into blog(title,subtitle,author,createtime,modtime) values('Man must explore, and this is exploration at its greatest','Problems look mighty small from 150 miles up','Jinkun Huang','2016-02-19 00:00:00','2016-02-20 00:00:00');
insert into blog(title,subtitle,author,createtime,modtime) values('I believe every human has a finite number of heartbeats. I don\'t intend to waste any of mine.','','Jinkun Huang','2016-02-23 19:48:00','2016-02-23 19:49:00');
insert into blog(title,subtitle,author,createtime,modtime) values('Science has not yet mastered prophecy','We predict too much for the next year and yet far too little for the next ten.','Jinkun Huang','2016-02-19 00:00:00','2016-02-20 00:00:00');
insert into blog(title,subtitle,author,createtime,modtime) values('Failure is not an option','Many say exploration is part of our destiny, but it’s actually our duty to future generations.','Jinkun Huang','2016-02-19 00:00:00','2016-02-20 00:00:00');