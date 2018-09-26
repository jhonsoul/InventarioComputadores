-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-09-2018 a las 23:51:25
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `computadores`
--

CREATE TABLE `computadores` (
  `id_placa` varchar(50) NOT NULL,
  `fk_id_marca_modelo` int(11) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `fk_id_procesador` int(11) NOT NULL,
  `serial_placa` varchar(50) NOT NULL,
  `memoria_ram` varchar(20) DEFAULT NULL,
  `disco_duro` varchar(10) DEFAULT NULL,
  `fk_id_sistema_operativo` int(11) NOT NULL,
  `tipo_office` varchar(50) NOT NULL,
  `antivirus` varchar(50) DEFAULT NULL,
  `responsable` varchar(50) NOT NULL,
  `ubicacion` varchar(50) NOT NULL,
  `observaciones` text,
  `activo_pc` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `computadores`
--

INSERT INTO `computadores` (`id_placa`, `fk_id_marca_modelo`, `tipo`, `fk_id_procesador`, `serial_placa`, `memoria_ram`, `disco_duro`, `fk_id_sistema_operativo`, `tipo_office`, `antivirus`, `responsable`, `ubicacion`, `observaciones`, `activo_pc`) VALUES
('B05', 7, 'Escritorio', 7, 'PC 60X70VPro', '16GB', '1TB', 7, 'Open office 2018', '360 Total defender', 'Jhon Alexander', 'Cuarto 5 - Lugar 2', 'Teclado defectuoso', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca_modelos`
--

CREATE TABLE `marca_modelos` (
  `id_marca_modelo` int(11) NOT NULL,
  `marca_modelo` varchar(50) NOT NULL,
  `activo_marca_modelo` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `marca_modelos`
--

INSERT INTO `marca_modelos` (`id_marca_modelo`, `marca_modelo`, `activo_marca_modelo`) VALUES
(6, 'Lenovo ThinkCentre Edge 91z', 1),
(5, 'HP Omni 220 Quad', 1),
(7, 'Sony Vaio VPCJ114FX/B C', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `procesadores`
--

CREATE TABLE `procesadores` (
  `id_procesador` int(11) NOT NULL,
  `procesador` varchar(50) NOT NULL,
  `activo_procesador` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `procesadores`
--

INSERT INTO `procesadores` (`id_procesador`, `procesador`, `activo_procesador`) VALUES
(9, 'Pentium Gold G5400', 1),
(8, 'Ryzen Threadripper 2950X', 1),
(7, 'Ryzen 7 2700X', 1),
(6, 'Core i7-8700', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sistemas_operativos`
--

CREATE TABLE `sistemas_operativos` (
  `id_sistema_operativo` int(11) NOT NULL,
  `sistema_operativo` varchar(50) NOT NULL,
  `activo_sistema_operativo` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `sistemas_operativos`
--

INSERT INTO `sistemas_operativos` (`id_sistema_operativo`, `sistema_operativo`, `activo_sistema_operativo`) VALUES
(4, 'Windows Vista', 1),
(3, 'Windows XP', 1),
(5, 'Windows 7', 1),
(6, 'Windows 8.1', 1),
(7, 'Windows 10', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `computadores`
--
ALTER TABLE `computadores`
  ADD PRIMARY KEY (`id_placa`);

--
-- Indices de la tabla `marca_modelos`
--
ALTER TABLE `marca_modelos`
  ADD PRIMARY KEY (`id_marca_modelo`);

--
-- Indices de la tabla `procesadores`
--
ALTER TABLE `procesadores`
  ADD PRIMARY KEY (`id_procesador`);

--
-- Indices de la tabla `sistemas_operativos`
--
ALTER TABLE `sistemas_operativos`
  ADD PRIMARY KEY (`id_sistema_operativo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `marca_modelos`
--
ALTER TABLE `marca_modelos`
  MODIFY `id_marca_modelo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `procesadores`
--
ALTER TABLE `procesadores`
  MODIFY `id_procesador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `sistemas_operativos`
--
ALTER TABLE `sistemas_operativos`
  MODIFY `id_sistema_operativo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
