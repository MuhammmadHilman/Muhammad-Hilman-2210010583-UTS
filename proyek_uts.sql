-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Nov 2024 pada 05.50
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyek_uts`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_barang`
--

CREATE TABLE `data_barang` (
  `id` int(11) NOT NULL,
  `kode_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `kategori_barang` varchar(100) NOT NULL,
  `jumlah_masuk` int(11) NOT NULL,
  `jumlah_keluar` int(11) NOT NULL,
  `sisa_stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_barang`
--

INSERT INTO `data_barang` (`id`, `kode_barang`, `nama_barang`, `kategori_barang`, `jumlah_masuk`, `jumlah_keluar`, `sisa_stok`) VALUES
(0, '005', 'Laptop', 'Elektronik', 20, 10, 20),
(1, '001', 'Laptop', 'Elektronik', 11, 49, 11),
(3, '002', 'Laptop', 'Elektronik', 50, 50, 50);

-- --------------------------------------------------------

--
-- Struktur dari tabel `inventaris_keluar`
--

CREATE TABLE `inventaris_keluar` (
  `id_keluar` int(11) NOT NULL,
  `kode_barang` varchar(10) DEFAULT NULL,
  `tanggal_keluar` date DEFAULT NULL,
  `jumlah_keluar` int(11) DEFAULT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `inventaris_keluar`
--

INSERT INTO `inventaris_keluar` (`id_keluar`, `kode_barang`, `tanggal_keluar`, `jumlah_keluar`, `keterangan`) VALUES
(1, '001', '2024-11-08', 49, 'Bagus'),
(3, '002', '2024-11-09', 50, 'Bagus'),
(6, '005', '2024-11-10', 10, 'Bagus');

--
-- Trigger `inventaris_keluar`
--
DELIMITER $$
CREATE TRIGGER `delete_data_barang_keluar` AFTER DELETE ON `inventaris_keluar` FOR EACH ROW BEGIN
    DELETE FROM data_barang WHERE kode_barang = OLD.kode_barang;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_data_barang_keluar` AFTER INSERT ON `inventaris_keluar` FOR EACH ROW BEGIN
    -- Memeriksa apakah barang dengan kode_barang sudah ada di data_barang
    IF EXISTS (SELECT 1 FROM data_barang WHERE kode_barang = NEW.kode_barang) THEN
        -- Jika ada, update jumlah_keluar
        UPDATE data_barang 
        SET jumlah_keluar = NEW.jumlah_keluar
        WHERE kode_barang = NEW.kode_barang;
    ELSE
        -- Jika tidak ada, insert data baru ke data_barang
        INSERT INTO data_barang (kode_barang, nama_barang, kategori_barang, jumlah_masuk, jumlah_keluar, sisa_stok)
        SELECT NEW.kode_barang, im.nama_barang, im.kategori_barang, im.jumlah, NEW.jumlah_keluar, im.jumlah
        FROM inventaris_masuk im
        WHERE im.kode_barang = NEW.kode_barang;
    END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_data_barang_keluar_update` AFTER UPDATE ON `inventaris_keluar` FOR EACH ROW BEGIN
    UPDATE data_barang
    SET jumlah_keluar = NEW.jumlah_keluar
    WHERE kode_barang = NEW.kode_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `inventaris_masuk`
--

CREATE TABLE `inventaris_masuk` (
  `kode_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(50) DEFAULT NULL,
  `kategori_barang` varchar(30) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `nilai_barang` decimal(10,2) DEFAULT NULL,
  `merek` varchar(50) DEFAULT NULL,
  `ukuran` varchar(20) DEFAULT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `inventaris_masuk`
--

INSERT INTO `inventaris_masuk` (`kode_barang`, `nama_barang`, `kategori_barang`, `jumlah`, `nilai_barang`, `merek`, `ukuran`, `keterangan`) VALUES
('001', 'Laptop', 'Elektronik', 11, '100000.00', 'Asus', '10 CM', 'Bagus'),
('002', 'Laptop', 'Elektronik', 50, '100023.00', 'Acer', '10 cm', 'bagus'),
('003', 'Meja', 'Kayu', 50, '20000.00', 'Jati', '10 cm', 'Bagus'),
('005', 'Laptop', 'Elektronik', 20, '10000.00', 'Acer', '10 Cm', 'Bagus');

--
-- Trigger `inventaris_masuk`
--
DELIMITER $$
CREATE TRIGGER `delete_data_barang_masuk` AFTER DELETE ON `inventaris_masuk` FOR EACH ROW BEGIN
    DELETE FROM data_barang WHERE kode_barang = OLD.kode_barang;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_data_barang_masuk` AFTER INSERT ON `inventaris_masuk` FOR EACH ROW BEGIN
    -- Memeriksa apakah barang dengan kode_barang sudah ada di data_barang
    IF EXISTS (SELECT 1 FROM data_barang WHERE kode_barang = NEW.kode_barang) THEN
        -- Jika ada, update jumlah_masuk dan sisa_stok
        UPDATE data_barang 
        SET jumlah_masuk = NEW.jumlah, 
            sisa_stok = NEW.jumlah 
        WHERE kode_barang = NEW.kode_barang;
    ELSE
        -- Jika tidak ada, insert data baru ke data_barang
        INSERT INTO data_barang (kode_barang, nama_barang, kategori_barang, jumlah_masuk, jumlah_keluar, sisa_stok)
        VALUES (NEW.kode_barang, NEW.nama_barang, NEW.kategori_barang, NEW.jumlah, 0, NEW.jumlah);
    END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_data_barang_masuk_update` AFTER UPDATE ON `inventaris_masuk` FOR EACH ROW BEGIN
    UPDATE data_barang
    SET jumlah_masuk = NEW.jumlah, sisa_stok = NEW.jumlah
    WHERE kode_barang = NEW.kode_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `mst_user`
--

CREATE TABLE `mst_user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mst_user`
--

INSERT INTO `mst_user` (`id_user`, `username`, `password`) VALUES
(1, 'Hilman', 'admin'),
(2, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_barang`
--
ALTER TABLE `data_barang`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `inventaris_keluar`
--
ALTER TABLE `inventaris_keluar`
  ADD PRIMARY KEY (`id_keluar`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indeks untuk tabel `inventaris_masuk`
--
ALTER TABLE `inventaris_masuk`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indeks untuk tabel `mst_user`
--
ALTER TABLE `mst_user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `inventaris_keluar`
--
ALTER TABLE `inventaris_keluar`
  MODIFY `id_keluar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `mst_user`
--
ALTER TABLE `mst_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `inventaris_keluar`
--
ALTER TABLE `inventaris_keluar`
  ADD CONSTRAINT `inventaris_keluar_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `inventaris_masuk` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
