-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2025 at 06:41 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tech`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `appointment_time` time NOT NULL,
  `appointment_date` date NOT NULL,
  `technician_id` int(11) NOT NULL,
  `device_type` varchar(255) NOT NULL,
  `issue_description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`id`, `username`, `phone`, `appointment_time`, `appointment_date`, `technician_id`, `device_type`, `issue_description`) VALUES
(1, 'Maharajan', '9025644156', '11:00:00', '2025-04-04', 1, 'Laptop', 'motherboard isssues');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(11) NOT NULL,
  `technician_id` int(11) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `user_email` varchar(100) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `comments` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `technician_id`, `user_name`, `user_email`, `rating`, `comments`) VALUES
(1, 3, 'James', 'James844@gmail.com', 3, 'very nice service'),
(2, 4, 'Iniyal', 'iniyalnatarajan30@gmail.com', 4, 'The installation was very clear and there is no fault after installation i will reccomend to my friends');

-- --------------------------------------------------------

--
-- Table structure for table `technician`
--

CREATE TABLE `technician` (
  `id` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `techtype` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `mobile` varchar(10) DEFAULT NULL,
  `profile_pic` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `technician`
--

INSERT INTO `technician` (`id`, `username`, `password`, `techtype`, `email`, `gender`, `address`, `mobile`, `profile_pic`) VALUES
(1, 'Logesh', 'Loki_443', 'Laptop', 'logeshseenivasan844@gmail.com', 'Male', 'Saibaba colony,Coimbatore-646114', '8778396103', 'technician.png'),
(2, 'Ajay Kumar', 'Ajay_007', 'Mobile', 'ajaykmr0308@gmail.com', 'Male', 'peelamedu,Coimbatore-646413', '7010063995', 'technician_1.png'),
(3, 'Balaji', 'Balaji_47', 'AC', 'rbalajiramamoorthy@gmail.com', 'Male', 'Gandhipuram,Coimbatore-646412', '8754719258', 'technician.png'),
(4, 'Karthik', 'Karthik_40', 'Water Purifier', 'karthikvka007@gmail.com', 'Male', 'Ukkadam,Coimbatore-646417', '9952470844', 'technician_1.png'),
(5, 'Rajkumar', 'Raj_87', 'Washing Machine', 'j.rajkumar2881@gmail.com', 'Male', 'saravanampatti,Coimbatore-646414', '8072172052', 'technician.png');

-- --------------------------------------------------------

--
-- Table structure for table `user_reg`
--

CREATE TABLE `user_reg` (
  `id` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `mobile` varchar(10) DEFAULT NULL,
  `profile_pic` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_reg`
--

INSERT INTO `user_reg` (`id`, `username`, `password`, `email`, `gender`, `address`, `mobile`, `profile_pic`) VALUES
(1, 'James', 'James@443', 'James844@gmail.com', 'Male', 'Saibaba Colony,Coimbatore-646114', '8765432198', 'user_1.jpg'),
(2, 'Iniyal', 'Iniya_47', 'iniyalnatarajan30@gmail.com', 'Female', 'Gandhipuram,Coimbatore-646412', '9025283202', 'user_2.png'),
(4, 'Maharajan', 'Raja@2003', 'maharajans2003@gmail.com', 'Male', 'saravanampatti,Coimbatore-646414', '9025644156', 'user_1.jpg'),
(5, 'Loki', 'Loki@170', 'logeshseenivasan170@gmail.com', 'Male', 'Ukkadam,Coimbatore-646417', '9345523458', 'user_1.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `technician_id` (`technician_id`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`),
  ADD KEY `technician_id` (`technician_id`);

--
-- Indexes for table `technician`
--
ALTER TABLE `technician`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_reg`
--
ALTER TABLE `user_reg`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `technician`
--
ALTER TABLE `technician`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user_reg`
--
ALTER TABLE `user_reg`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`technician_id`) REFERENCES `technician` (`id`);

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`technician_id`) REFERENCES `technician` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
