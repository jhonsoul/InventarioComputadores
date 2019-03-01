-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 26-10-2018 a las 17:33:14
-- Versión del servidor: 5.7.23
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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

DROP TABLE IF EXISTS `computadores`;
CREATE TABLE IF NOT EXISTS `computadores` (
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
  `activo_pc` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `computadores`
--

INSERT INTO `computadores` (`id_placa`, `fk_id_marca_modelo`, `tipo`, `fk_id_procesador`, `serial_placa`, `memoria_ram`, `disco_duro`, `fk_id_sistema_operativo`, `tipo_office`, `antivirus`, `responsable`, `ubicacion`, `observaciones`, `activo_pc`) VALUES
('A01', 3, 'Escritorio', 5, 'Msi X470', 'DDR3 8 GB', '1 TB', 1, 'OpenOffice, 7zip', 'Kaspersky 2018', 'Carlos Perez', 'Sala A lugar 20', 'Monitor con una mancha de pintura.', 1),
('A12', 2, 'Escritorio', 3, 'Gigabyte H110m-h', 'DDR3 16 GB', '1 TB', 3, 'OpenOffice, 7zip', '360 TotalDefender', 'Carlos Perez', 'Sala A lugar 4', 'El raton tiene el tercer boton defectuoso', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca_modelos`
--

DROP TABLE IF EXISTS `marca_modelos`;
CREATE TABLE IF NOT EXISTS `marca_modelos` (
  `id_marca_modelo` int(11) NOT NULL AUTO_INCREMENT,
  `marca_modelo` varchar(50) NOT NULL,
  `activo_marca_modelo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_marca_modelo`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `marca_modelos`
--

INSERT INTO `marca_modelos` (`id_marca_modelo`, `marca_modelo`, `activo_marca_modelo`) VALUES
(1, 'DELL OptiPlex 5250', 1),
(2, 'Sony Vaio VPCJ114FX/B C', 1),
(3, 'Medion Erazer X7748 D', 1),
(4, 'SMX SMX079-A', 1),
(5, 'HP Omni 27', 1),
(6, 'Lenovo IdeaCentre A720', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `procesadores`
--

DROP TABLE IF EXISTS `procesadores`;
CREATE TABLE IF NOT EXISTS `procesadores` (
  `id_procesador` int(11) NOT NULL AUTO_INCREMENT,
  `procesador` varchar(50) NOT NULL,
  `activo_procesador` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_procesador`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `procesadores`
--

INSERT INTO `procesadores` (`id_procesador`, `procesador`, `activo_procesador`) VALUES
(1, 'Intel Core i3-8100', 1),
(2, 'AMD Ryzen 3 2200G', 1),
(3, 'Intel Core i5-8600K', 1),
(4, 'Intel Core i7-8700', 1),
(5, 'AMD Ryzen ThreadRipper', 1),
(6, 'Intel Core i9-7900X', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sistemas_operativos`
--

DROP TABLE IF EXISTS `sistemas_operativos`;
CREATE TABLE IF NOT EXISTS `sistemas_operativos` (
  `id_sistema_operativo` int(11) NOT NULL AUTO_INCREMENT,
  `sistema_operativo` varchar(50) NOT NULL,
  `activo_sistema_operativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_sistema_operativo`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `sistemas_operativos`
--

INSERT INTO `sistemas_operativos` (`id_sistema_operativo`, `sistema_operativo`, `activo_sistema_operativo`) VALUES
(1, 'Windows 7', 1),
(2, 'Windows 8', 1),
(3, 'Windows 10', 1),
(4, 'Ubuntu 18.10', 1),
(5, 'Kali Linux 2018.3a', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
