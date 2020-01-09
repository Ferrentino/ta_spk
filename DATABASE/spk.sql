-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2020 at 06:12 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `spk`
--

-- --------------------------------------------------------

--
-- Table structure for table `bobot`
--

CREATE TABLE `bobot` (
  `KODEBOBOT` varchar(30) NOT NULL,
  `KRITERIA` varchar(100) DEFAULT NULL,
  `BOBOT` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bobot`
--

INSERT INTO `bobot` (`KODEBOBOT`, `KRITERIA`, `BOBOT`) VALUES
('bobot1', 'Bobot Tanah', 20),
('bobot2', 'Bobot Lantai', 20),
('bobot3', 'Bobot Dinding', 20),
('bobot4', 'Bobot Pekerjaan', 20),
('bobot5', 'Bobot Penghasilan', 20);

-- --------------------------------------------------------

--
-- Table structure for table `calon`
--

CREATE TABLE `calon` (
  `ID_CALON` varchar(50) NOT NULL,
  `NOKTP` bigint(50) DEFAULT NULL,
  `NAMA` varchar(50) DEFAULT NULL,
  `TANAH` int(11) DEFAULT NULL,
  `LANTAI` varchar(50) DEFAULT NULL,
  `DINDING` varchar(50) DEFAULT NULL,
  `PEKERJAAN` varchar(50) DEFAULT NULL,
  `PENGHASILAN` int(11) DEFAULT NULL,
  `NTANAH` int(11) DEFAULT NULL,
  `NLANTAI` int(11) DEFAULT NULL,
  `NDINDING` int(11) DEFAULT NULL,
  `NPEKERJAAN` int(11) DEFAULT NULL,
  `NPENGHASILAN` int(11) DEFAULT NULL,
  `NBTANAH` decimal(65,9) DEFAULT NULL,
  `NBLANTAI` decimal(65,9) DEFAULT NULL,
  `NBDINDING` decimal(65,9) DEFAULT NULL,
  `NBPEKERJAAN` decimal(65,9) DEFAULT NULL,
  `NBPENGHASILAN` decimal(65,9) DEFAULT NULL,
  `JSIP` decimal(65,9) DEFAULT NULL,
  `JSIN` decimal(65,9) DEFAULT NULL,
  `PREFERENSI` decimal(65,9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `calon`
--

INSERT INTO `calon` (`ID_CALON`, `NOKTP`, `NAMA`, `TANAH`, `LANTAI`, `DINDING`, `PEKERJAAN`, `PENGHASILAN`, `NTANAH`, `NLANTAI`, `NDINDING`, `NPEKERJAAN`, `NPENGHASILAN`, `NBTANAH`, `NBLANTAI`, `NBDINDING`, `NBPEKERJAAN`, `NBPENGHASILAN`, `JSIP`, `JSIN`, `PREFERENSI`) VALUES
('calon01', 350725701020301, 'Supali', 50, 'Plester', 'Kayu Sengon', 'Petani', 750000, 1, 2, 2, 3, 3, '0.063245553', '0.141421356', '0.141421356', '0.141421356', '0.141421356', '0.126491107', '0.000000000', '0.000000000'),
('calon02', 350725701020302, 'Supeno', 20, 'Plester', 'Kayu Sengon', 'Petani', 650000, 3, 2, 2, 3, 3, '0.189736660', '0.141421356', '0.141421356', '0.141421356', '0.141421356', '0.000000000', '0.126491107', '1.000000000'),
('calon03', 350725701020303, 'Janoko', 13, 'Plester', 'Bambu', 'PNS', 1200000, 4, 2, 4, 2, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.000000000'),
('calon04', 350725701020304, 'Parno', 50, 'Bambu', 'Kayu Sengon', 'PNS', 1200000, 1, 3, 2, 2, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.000000000'),
('calon05', 350725701020305, 'Sutisno', 12, 'Keramik', 'Rumbia', 'Buruh', 1500000, 4, 1, 3, 4, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.000000000'),
('calon06', 350725701020306, 'Dadang', 25, 'Plester', 'Rumbia', 'Wirausaha', 3300000, 3, 2, 3, 1, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.000000000'),
('calon07', 350725701020307, 'Sucipto', 24, 'Keramik', 'Kayu Sengon', 'Buruh', 1100000, 3, 1, 2, 4, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.000000000'),
('calon08', 350725701020308, 'Hambali', 39, 'Keramik', 'Bambu', 'PNS', 1100000, 2, 1, 4, 2, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.000000000'),
('calon09', 350725701020309, 'Gaguk', 24, 'Bambu', 'Tembok tanpa diplester', 'PNS', 1000000, 3, 3, 1, 2, 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.000000000'),
('calon10', 350725701020310, 'Sukir', 43, 'Bambu', 'Rumbia', 'Wirausaha', 3000000, 1, 3, 3, 1, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.000000000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bobot`
--
ALTER TABLE `bobot`
  ADD PRIMARY KEY (`KODEBOBOT`);

--
-- Indexes for table `calon`
--
ALTER TABLE `calon`
  ADD PRIMARY KEY (`ID_CALON`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
