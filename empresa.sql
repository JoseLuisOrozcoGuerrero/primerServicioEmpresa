-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-09-2020 a las 17:27:20
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tst_cita`
--

CREATE TABLE `tst_cita` (
  `idcita` bigint(20) NOT NULL,
  `fecha_cita` varchar(255) DEFAULT NULL,
  `id_empresa` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tst_cita`
--

INSERT INTO `tst_cita` (`idcita`, `fecha_cita`, `id_empresa`) VALUES
(6, '10092020', 4),
(7, '10092020', 4),
(8, '10092020', 5),
(9, '10092020', 5),
(10, '10092020', 6),
(11, '10092020', 6),
(22, '10092020', 26),
(23, '10092020', 26),
(26, '11092020', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tst_empresa`
--

CREATE TABLE `tst_empresa` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `iddepartment` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tst_empresa`
--

INSERT INTO `tst_empresa` (`id`, `nombre`, `iddepartment`) VALUES
(2, 'Constructora', 2),
(3, 'Empresa 1', NULL),
(4, 'Empresa 1', NULL),
(5, 'Empresa 1', NULL),
(6, 'MercaEconomico', NULL),
(7, 'Constructora Jimenez', NULL),
(26, 'Alkosto', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tst_sectoreconomico`
--

CREATE TABLE `tst_sectoreconomico` (
  `iddepartment` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tst_sectoreconomico`
--

INSERT INTO `tst_sectoreconomico` (`iddepartment`, `name`) VALUES
(1, 'Comercio'),
(2, 'Construccion Nacional');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tst_cita`
--
ALTER TABLE `tst_cita`
  ADD PRIMARY KEY (`idcita`),
  ADD KEY `FK6ryci9dy7vbpopkn8rh1pct56` (`id_empresa`);

--
-- Indices de la tabla `tst_empresa`
--
ALTER TABLE `tst_empresa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKqodu5wrbysdlb4up1as0hveys` (`iddepartment`);

--
-- Indices de la tabla `tst_sectoreconomico`
--
ALTER TABLE `tst_sectoreconomico`
  ADD PRIMARY KEY (`iddepartment`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tst_cita`
--
ALTER TABLE `tst_cita`
  MODIFY `idcita` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `tst_empresa`
--
ALTER TABLE `tst_empresa`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
