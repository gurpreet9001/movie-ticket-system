-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 16, 2018 at 01:01 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 5.6.36

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ticketdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `name` varchar(100) NOT NULL,
  `age` int(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone_no` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`name`, `age`, `email`, `phone_no`, `gender`, `image`) VALUES
('eagle', 14, 'eagle@gmail.com', '8214174118', 'Female', '153163357314901 EAGLE_01.jpg'),
('shubham', 23, 'shubham@gmail.com', '9768451845', 'Male', '153159502339542.jpg'),
('mohan', 32, 'mohan@hotmail.com', '9854254763', 'Male', '');

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `theatername` varchar(100) NOT NULL,
  `movie` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `price` int(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `time` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`theatername`, `movie`, `city`, `price`, `Date`, `time`) VALUES
('PVR', '3 Idiots', 'Amritsar', 300, '2018-06-23', '3:00 PM'),
('Fun_Cinemas', 'avengers', 'Jalandhar', 200, '2018-06-22', '4:00 PM'),
('PVR_MBD', 'Black Panther', 'Jalandhar', 300, '2018-06-29', '3:00 PM'),
('PVR_MBD', 'Chaar Sahibzaade', 'Jalandhar', 300, '2018-06-02', '3:30 PM'),
('Movie Hall', 'DDLJ', 'Ludhiana', 150, '2018-07-03', '7:00 PM'),
('PVR', 'Dhoom', 'Amritsar', 300, '2018-06-15', '10:00 PM'),
('PVR_Curo', 'Dr Strange ', 'Jalandhar', 250, '2018-05-12', '7:00 AM'),
('PVR_MBD', 'Goreya Nu Daffa Karo', 'Jalandhar', 300, '2018-07-02', '8:00 PM'),
('Fun_Cinemas', 'ironman', 'Jalandhar', 300, '2018-07-02', '3:00 PM'),
('Movie Hall', 'Sanju', 'Ludhiana', 250, '2018-07-02', '1:00 PM'),
('PVR_chan', 'Sanju_chan', 'Chandigarh', 210, '2018-07-17', '5:00 PM'),
('PVR_Curo', 'sholay', 'Jalandhar', 100, '2018-07-01', '5:50 PM'),
('Elante Show', 'Tanu Weds Manu ', 'Chandigarh', 350, '2018-07-18', '12:30 PM'),
('PVR_Curo', 'Thor', 'Jalandhar', 300, '2018-06-06', '6:30 PM'),
('PVR', 'X Men', 'Amritsar', 300, '2018-06-11', '2:15 PM');

-- --------------------------------------------------------

--
-- Table structure for table `mycity`
--

CREATE TABLE `mycity` (
  `city` varchar(100) NOT NULL,
  `theater` varchar(100) NOT NULL,
  `movie` varchar(100) NOT NULL,
  `price` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mycity`
--

INSERT INTO `mycity` (`city`, `theater`, `movie`, `price`) VALUES
('Jalandhar', 'PVR', 'Black Panther', 250),
('Jalandhar', 'PVR', 'ddlj', 150),
('Jalandhar', 'PVR_Curo', 'Thor', 250),
('Jalandhar', 'PVR', 'Avengers', 280),
('Amritsar', 'PVR', 'Dr Strange', 220),
('Amritsar', 'PVR', 'Ironman', 230),
('Ludiana', 'Fun_Cinemas', 'X Men', 250),
('Ludiana', 'Fun_Cinemas', 'Superman', 210);

-- --------------------------------------------------------

--
-- Table structure for table `theaterlist`
--

CREATE TABLE `theaterlist` (
  `Name` varchar(100) NOT NULL,
  `City` varchar(100) NOT NULL,
  `seats` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `theaterlist`
--

INSERT INTO `theaterlist` (`Name`, `City`, `seats`) VALUES
('Elante Show', 'Chandigarh', 200),
('Fun_Cinemas', 'Jalandhar', 120),
('Movie Hall', 'Ludhiana', 100),
('PVR', 'Amritsar', 150),
('PVR_chan', 'Chandigarh', 200),
('PVR_Curo', 'Jalandhar', 130),
('PVR_MBD', 'Jalandhar', 140);

-- --------------------------------------------------------

--
-- Table structure for table `ticket_booked`
--

CREATE TABLE `ticket_booked` (
  `city` varchar(100) NOT NULL,
  `theater` varchar(100) NOT NULL,
  `movie` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `no_of_tickets` int(100) NOT NULL,
  `date` date DEFAULT NULL,
  `price` int(100) NOT NULL,
  `total` int(100) NOT NULL,
  `showdate` varchar(100) NOT NULL DEFAULT '2018-07-02',
  `time` varchar(100) NOT NULL DEFAULT '3:00 PM'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ticket_booked`
--

INSERT INTO `ticket_booked` (`city`, `theater`, `movie`, `username`, `no_of_tickets`, `date`, `price`, `total`, `showdate`, `time`) VALUES
('Jalandhar', 'PVR_MBD', 'Black Panther', '101panther', 3, '2018-07-12', 300, 900, '2018-07-12', '4:00 PM'),
('Amritsar', 'PVR', '3 Idiots', '3102', 3, '2018-07-15', 300, 300, '2018-07-02', '3:30 PM'),
('Jalandhar', 'PVR_Curo', 'avengers', 'aven101', 7, '2018-07-09', 200, 1400, '2018-07-02', '11:00 PM'),
('Jalandhar', 'Fun_Cinemas', 'avengers', 'avengers101', 4, '2018-07-29', 200, 800, '2018-07-02', '11:00 AM'),
('Jalandhar', 'PVR_MBD', 'Black Panther', 'black102', 2, '2018-07-13', 300, 600, '2018-07-02', '3:00 PM'),
('Ludhiana', 'Movie Hall', 'DDLJ', 'ddlj101', 4, '2018-07-14', 150, 600, '2018-07-02', '3:00 PM'),
('Jalandhar', 'PVR', 'ddlj', 'ddlj102', 1, '1993-11-23', 150, 150, '2018-06-23', '3:00 PM'),
('Ludhiana', 'Movie Hall', 'DDLJ', 'ddlj103', 2, '2018-07-05', 150, 300, '2018-06-05', '3:00 PM'),
('Amritsar', 'PVR', 'Dhoom', 'dhoom101', 3, '2018-07-13', 300, 900, '2018-07-02', '3:00 PM'),
('Jalandhar', 'Fun Cinemas', 'dr strange', 'dr101', 2, '2018-07-09', 250, 500, '2018-07-02', '3:00 PM'),
('Jalandhar', 'PVR_MBD', 'Goreya Nu Daffa Karo', 'g101', 4, '2018-07-13', 300, 1200, '2018-07-02', '3:00 PM'),
('Jalandhar', 'PVR_Curo', 'ironman', 'iron101', 5, '2018-07-04', 300, 1500, '2018-07-02', '3:00 PM'),
('Amritsar', 'PVR', 'rsvp', 'rsvp102', 2, '2018-07-10', 150, 300, '2018-06-12', '3:00 PM'),
('Ludhiana', 'Movie Hall', 'DDLJ', 'sanju101', 3, '2018-07-14', 150, 450, '2018-07-03', '7:00 PM'),
('Chandigarh', 'PVR_chan', 'Sanju_chan', 'sanju201', 4, '2018-07-16', 210, 840, '2018-07-17', '5:00 PM'),
('Jalandhar', 'PVR_Curo', 'sholay', 'sholay101', 5, '2018-07-13', 100, 500, '2018-07-02', '3:00 PM'),
('Jalandhar', 'Fun Cinemas', 'dr strange', 'strange101', 1, '2018-07-06', 250, 250, '2018-06-11', '3:00 PM'),
('Jalandhar', 'PVR_Curo', 'Dr Strange ', 'strange103', 1, '2018-07-13', 300, 300, '2018-07-02', '3:00 PM'),
('Chandigarh', 'Elante Show', 'Tanu Weds Manu ', 'tanu101', 5, '2018-07-15', 350, 1750, '2018-07-18', '12:30 PM'),
('Jalandhar', 'Fun Cinemas', 'thor', 'thor101', 3, '2018-07-02', 300, 900, '2018-07-01', '3:00 PM'),
('Amritsar', 'PVR', 'X Men', 'x101', 2, '2018-07-13', 300, 600, '2018-06-19', '3:00 PM');

-- --------------------------------------------------------

--
-- Table structure for table `usertable`
--

CREATE TABLE `usertable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `access` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usertable`
--

INSERT INTO `usertable` (`username`, `password`, `access`) VALUES
('admin', 'admin', 'admin'),
('emp', 'emp', 'employee'),
('guru', 'emp', 'employee');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `details`
--
ALTER TABLE `details`
  ADD PRIMARY KEY (`phone_no`,`email`);

--
-- Indexes for table `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`movie`);

--
-- Indexes for table `mycity`
--
ALTER TABLE `mycity`
  ADD KEY `theaterindex` (`theater`),
  ADD KEY `movieindex` (`movie`);

--
-- Indexes for table `theaterlist`
--
ALTER TABLE `theaterlist`
  ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `ticket_booked`
--
ALTER TABLE `ticket_booked`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `usertable`
--
ALTER TABLE `usertable`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
