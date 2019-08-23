
SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


CREATE TABLE IF NOT EXISTS `issuedbooks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  
  `studentid` int(11) NOT NULL,
  `studentname` varchar(50) NOT NULL,
  `studentcontact` varchar(20) NOT NULL,
  `issueddate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `issuedbooks`
--

INSERT INTO `issuedbooks` (`id`, `studentid`, `studentname`, `studentcontact`, `issueddate`) VALUES
(4, 23, 'abhi', '932992932', '2016-07-19 18:43:16'),
(6, 335, 'rahul', '95676565756', '2016-07-19 18:44:34'),
(7, 87, 'abhishek', '9329882382', '2016-07-19 18:46:12');
