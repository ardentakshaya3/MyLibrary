
SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

CREATE TABLE IF NOT EXISTS `Books`(
	  `id` int(10) NOT NULL AUTO_INCREMENT,
	  `name` varchar(100) NOT NULL,
	  `author` varchar(100) NOT NULL,
	  `publisher` varchar(100) NOT NULL,
	  `quantity` int(10) NOT NULL,
	  `issued` int(10) NOT NULL,
	  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;
		
		
INSERT INTO `books` (`id`, `name`, `author`, `publisher`, `quantity`, `issued`, `added_date`) VALUES
(1, 'C In Depth', 'Shrivastav', 'BPB', 2, 2, '2016-07-19 19:37:56'),
(2, 'DBMS', 'Korth', 'Pearson', 3, 0, '2016-07-18 18:39:52'),
(3, 'Mrs. FunnyBones', 'Twinkle Khanna', 'BPB', 80, 0, '2016-07-18 23:02:14');
		