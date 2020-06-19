-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2018 at 09:19 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_buku`
--

CREATE TABLE `tb_buku` (
  `kode_buku` varchar(10) NOT NULL,
  `judul_buku` varchar(20) NOT NULL,
  `pengarang` varchar(20) NOT NULL,
  `penerbit` varchar(20) NOT NULL,
  `tahun_terbit` varchar(5) NOT NULL,
  `tempat_terbit` varchar(20) NOT NULL,
  `jumlah` varchar(20) NOT NULL,
  `tanggal` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_buku`
--

INSERT INTO `tb_buku` (`kode_buku`, `judul_buku`, `pengarang`, `penerbit`, `tahun_terbit`, `tempat_terbit`, `jumlah`, `tanggal`) VALUES
('001', 'Pemrograman', 'Anggi', 'Anggara', '2017', 'Palembang', '20', '18/10/2018'),
('002', 'Pemrograman', 'Shella', 'Lembongasa', '2018', 'Manado', '20', '24/03/2018');

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_pinjam`
--

CREATE TABLE `tb_detail_pinjam` (
  `no_pinjam` varchar(10) NOT NULL,
  `kode_buku` int(10) NOT NULL,
  `jumlah_pinjam` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_lapor`
--

CREATE TABLE `tb_lapor` (
  `nim` varchar(15) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `keluhan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_lapor`
--

INSERT INTO `tb_lapor` (`nim`, `nama`, `keluhan`) VALUES
('672017287', 'Anggi Anggara', 'tambah buku dong masbrowww');

-- --------------------------------------------------------

--
-- Table structure for table `tb_mahasiswa`
--

CREATE TABLE `tb_mahasiswa` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `fakultas` varchar(20) NOT NULL,
  `program_studi` varchar(20) NOT NULL,
  `tahun_angkatan` varchar(5) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_mahasiswa`
--

INSERT INTO `tb_mahasiswa` (`nim`, `nama`, `fakultas`, `program_studi`, `tahun_angkatan`, `jenis_kelamin`, `alamat`, `no_telp`) VALUES
('672017287', 'Anggi Anggara', 'FTI', 'TI', '2017', 'Laki-laki', 'Jl.Sehati Gitu Loh', '082278017187'),
('672017307', 'Marshella Nasarani Lembong', 'FTI', 'TI', '2017', 'Laki-laki', 'Jl.seruni bbb', '08319874566');

-- --------------------------------------------------------

--
-- Table structure for table `tb_peminjaman`
--

CREATE TABLE `tb_peminjaman` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `program_studi` varchar(20) NOT NULL,
  `kode_buku` varchar(10) NOT NULL,
  `judul_buku` varchar(20) NOT NULL,
  `pengarang` varchar(20) NOT NULL,
  `tanggal_pinjam` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_peminjaman`
--

INSERT INTO `tb_peminjaman` (`nim`, `nama`, `program_studi`, `kode_buku`, `judul_buku`, `pengarang`, `tanggal_pinjam`) VALUES
('672017287', 'Anggi Anggara', 'TI', '001', 'Pemrograman', 'Anggi', '31/03/2018');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pengembalian`
--

CREATE TABLE `tb_pengembalian` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `program_studi` varchar(20) NOT NULL,
  `kode_buku` varchar(10) NOT NULL,
  `tanggal_pinjam` varchar(10) NOT NULL,
  `tanggal_kembali` varchar(10) NOT NULL,
  `keterlambatan` varchar(10) NOT NULL,
  `denda` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_pengembalian`
--

INSERT INTO `tb_pengembalian` (`nim`, `nama`, `program_studi`, `kode_buku`, `tanggal_pinjam`, `tanggal_kembali`, `keterlambatan`, `denda`) VALUES
('212', 'qwqw', 'wqw', 'qwqw', 'qwqw', 'qwqw', 'qwqw', 'qwq');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `user_id` varchar(15) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `option` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(25) NOT NULL,
  `confirm_password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`user_id`, `full_name`, `option`, `email`, `password`, `confirm_password`) VALUES
('', '', 'Select', '', '', ''),
('121212', 'sasas8888', 'Admin', 'asasas', 'asasasas', 'asasasas'),
('2323', 'asas', 'Admin', 'asas', 'sasas', 'asasa'),
('287', 'Anggi Anggara', 'Admin', 'anggianggarajr@gmail.com', 'anggara', 'anggara'),
('307', 'Marshella Nasarani Lembong', 'Student', 'Marshella@gmail.com', 'marshella', 'marshella'),
('672017307', 'Marsh Lembong', 'Student', 'marshellawekewek@gmail.cuom', 'password', 'password'),
('oti', 'oti', 'Admin', 'oti', 'oti', 'oti');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_buku`
--
ALTER TABLE `tb_buku`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indexes for table `tb_lapor`
--
ALTER TABLE `tb_lapor`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tb_mahasiswa`
--
ALTER TABLE `tb_mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tb_peminjaman`
--
ALTER TABLE `tb_peminjaman`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tb_pengembalian`
--
ALTER TABLE `tb_pengembalian`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
