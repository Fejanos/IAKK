-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Gép: localhost:3306
-- Létrehozás ideje: 2025. Feb 18. 12:43
-- Kiszolgáló verziója: 5.7.24
-- PHP verzió: 8.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `tesztdb`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `szemely`
--

CREATE TABLE `szemely` (
  `id` int(11) NOT NULL,
  `nev` varchar(50) COLLATE utf8_hungarian_ci NOT NULL,
  `szulhely` varchar(30) COLLATE utf8_hungarian_ci NOT NULL,
  `neme` enum('Férfi','Nő','Egyéb','') COLLATE utf8_hungarian_ci DEFAULT 'Egyéb',
  `tajszam` char(9) COLLATE utf8_hungarian_ci NOT NULL,
  `szuldatum` date NOT NULL,
  `adoszam` char(11) COLLATE utf8_hungarian_ci NOT NULL,
  `szamlaszam` char(24) COLLATE utf8_hungarian_ci NOT NULL,
  `email` varchar(256) COLLATE utf8_hungarian_ci NOT NULL,
  `telefonszam` char(11) COLLATE utf8_hungarian_ci NOT NULL,
  `lakcim` varchar(120) COLLATE utf8_hungarian_ci NOT NULL,
  `suly` float NOT NULL,
  `magassag` float NOT NULL,
  `cipomeret` float DEFAULT NULL,
  `vercsoport` enum('A,B,AB,A-,B-,A+,B+,0,0+,0-') COLLATE utf8_hungarian_ci NOT NULL,
  `szemelyiszam` char(8) COLLATE utf8_hungarian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `szemely`
--
ALTER TABLE `szemely`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `tajszam` (`tajszam`),
  ADD UNIQUE KEY `adoszam` (`adoszam`),
  ADD UNIQUE KEY `szamlaszam` (`szamlaszam`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `telefonszam` (`telefonszam`),
  ADD UNIQUE KEY `szemelyiszam` (`szemelyiszam`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `szemely`
--
ALTER TABLE `szemely`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
