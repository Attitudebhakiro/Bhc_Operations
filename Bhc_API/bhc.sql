-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 11, 2023 at 09:32 PM
-- Server version: 8.0.33-0ubuntu0.20.04.2
-- PHP Version: 7.4.3-4ubuntu2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bhc`
--

-- --------------------------------------------------------

--
-- Table structure for table `bale`
--

CREATE TABLE `bale` (
  `id` bigint NOT NULL,
  `barcode` varchar(255) NOT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `growerNumber` varchar(255) DEFAULT NULL,
  `mass` float NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `bale`
--

INSERT INTO `bale` (`id`, `barcode`, `grade`, `growerNumber`, `mass`, `price`) VALUES
(2, '110000032', 'TMOS', NULL, 120, 4.5),
(3, '110000033', 'TMOS', NULL, 120, 4.5),
(4, '110000034', 'TMOS', NULL, 120, 4.5),
(5, '110000035', 'TMOS', NULL, 120, 4.5),
(9, '110000010', 'TMOS', NULL, 120, 4.5),
(10, '110000011', 'TLOS', NULL, 110, 5.5),
(11, '110000012', 'TXLF', NULL, 130, 3.5),
(12, '110000013', 'TMOX', NULL, 90, 0.5),
(13, '110000014', 'TM1L', NULL, 80, 1.5);

-- --------------------------------------------------------

--
-- Table structure for table `pallet`
--

CREATE TABLE `pallet` (
  `id` bigint NOT NULL,
  `palletNumber` varchar(5) NOT NULL,
  `warehouse` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pallet`
--

INSERT INTO `pallet` (`id`, `palletNumber`, `warehouse`) VALUES
(2, '11145', 'main'),
(4, '12245', 'main'),
(9, '12555', 'main');

-- --------------------------------------------------------

--
-- Table structure for table `pallet_bale`
--

CREATE TABLE `pallet_bale` (
  `pallet_id` bigint NOT NULL,
  `bales_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pallet_bale`
--

INSERT INTO `pallet_bale` (`pallet_id`, `bales_id`) VALUES
(2, 2),
(2, 3),
(4, 4),
(4, 5),
(9, 9),
(9, 10),
(9, 11),
(9, 12),
(9, 13);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bale`
--
ALTER TABLE `bale`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_62wiquf1xpvr1iii7v8gswqjw` (`barcode`);

--
-- Indexes for table `pallet`
--
ALTER TABLE `pallet`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_rhah26e6tu3exn2em5x20tx8v` (`palletNumber`);

--
-- Indexes for table `pallet_bale`
--
ALTER TABLE `pallet_bale`
  ADD UNIQUE KEY `UK_rnnb42i6o3cju0gas65eyk5he` (`bales_id`),
  ADD KEY `FKgwo18d89w9fu8mjx30cjhla8a` (`pallet_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bale`
--
ALTER TABLE `bale`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `pallet`
--
ALTER TABLE `pallet`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pallet_bale`
--
ALTER TABLE `pallet_bale`
  ADD CONSTRAINT `FKb9aivia1iklv10f0djnky291u` FOREIGN KEY (`bales_id`) REFERENCES `bale` (`id`),
  ADD CONSTRAINT `FKgwo18d89w9fu8mjx30cjhla8a` FOREIGN KEY (`pallet_id`) REFERENCES `pallet` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
