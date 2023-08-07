-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-08-2023 a las 19:45:00
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `apellido`, `dni`, `direccion`, `telefono`, `estado`) VALUES
(1, 'Jose', 'Flores', '74332890', 'Los Olivos', '990784456', 1),
(2, 'Andy', 'Leon', '72696969', 'los olivos, casa sideral', '970479585', 1),
(3, 'Cris', 'manrique', '3535353', 'Lima-san juan', '99911111', 1),
(4, 'Valentín', 'Briseño', '87654123', 'Cl. José Nava', '934554321', 1),
(5, 'Emmanuel', 'Soria', '79354321', 'Urb. Rafael Pulido', '987764321', 1),
(6, 'Ashley', 'Leyva', '56654321', 'Av. Julián Duarte', '987608001', 0),
(8, 'Ferando', 'Castilla', '74332534', 'Av. Pirua', '990784123', 1),
(9, 'Sideral', 'Carrion', '12345', 'Av Lurin', '123465', 0),
(11, 'Luciana', 'Yanes', '23456789', 'Jr. Horacio Narváez', '958688976', 1),
(12, 'Rafaela', 'Ulibarri Carrera', '23456790', 'Cl. María Paula Sosa', '1176230', 1),
(13, 'Maite Victoria', 'Hernandes', '23456889', 'Jr. Santiago Roybal', '973495212', 1),
(14, 'Juan', 'Lopez', '52521414', 'San juan de lurigancho', '970444222', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE `detalle` (
  `id` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `precio_ser` decimal(10,2) NOT NULL,
  `id_factura` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`id`, `id_servicio`, `precio_ser`, `id_factura`) VALUES
(1, 1, '87.90', 1),
(2, 3, '87.90', 1),
(3, 1, '87.90', 1),
(4, 4, '70.90', 2),
(5, 3, '50.90', 3),
(6, 1, '87.90', 3),
(7, 3, '50.90', 3),
(8, 5, '68.90', 4),
(9, 5, '68.90', 4),
(10, 5, '68.90', 4),
(11, 1, '87.90', 5),
(12, 4, '70.90', 5),
(13, 5, '68.90', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id` int(11) NOT NULL,
  `nombre_empleado` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
  `apellido_empleado` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
  `dni_empleado` varchar(8) CHARACTER SET utf8mb4 NOT NULL,
  `telefono_empleado` varchar(9) CHARACTER SET utf8mb4 NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id`, `nombre_empleado`, `apellido_empleado`, `dni_empleado`, `telefono_empleado`, `estado`) VALUES
(1, 'Carlos', 'Quispes', '74234569', '98765421', 1),
(2, 'Maria', 'Castillo', '123214', '242421', 1),
(4, 'Andy', 'Leon', '79517422', '988248555', 1),
(5, 'Maria', 'Perz', '99654123', '922554321', 1),
(6, 'Raul', 'Lop', '66354321', '944764321', 1),
(7, 'Juan', 'Sobe', '76654321', '955608001', 1),
(8, 'Lucas', 'Mia', '67554321', '966658561', 1),
(9, 'pedro', 'sanchez', '77416158', '955144756', 0),
(10, 'Christopher', 'Ramos', '7436124', '998309987', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `id` int(11) NOT NULL,
  `Nombre_cliente` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Nombre_empleado` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Monto` decimal(10,2) NOT NULL,
  `fecha` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`id`, `Nombre_cliente`, `Nombre_empleado`, `Monto`, `fecha`) VALUES
(1, 'Leon', 'Andy Leon', '263.70', '2022-6-26'),
(2, 'Andy Leon', '-------------------', '70.90', '2022-6-28'),
(3, 'Andy Leon', '-------------------', '189.70', '2022-6-28'),
(4, 'Valentín Briseño', 'Andy Leon', '206.70', '2022-7-19'),
(5, 'Jose Flores', 'Carlos Quispes', '227.70', '2022-7-19');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `id` int(11) NOT NULL,
  `numero_ha` varchar(255) NOT NULL,
  `tipo_habitacion` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL,
  `precio_hab` double NOT NULL,
  `estado2` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`id`, `numero_ha`, `tipo_habitacion`, `descripcion`, `estado`, `precio_hab`, `estado2`) VALUES
(1, '2004', 'VIP', 'Mejores condiciones', 'Libre', 500, 1),
(2, '2005', 'VIP', 'Mejores condiciones', 'Libre', 500, 1),
(3, '2006', 'VIP', 'Mejores condiciones', 'Libre', 500, 1),
(4, '2007', 'Normal', 'Mejores condiciones', 'Libre', 200, 1),
(5, '2008', 'Normal', 'Mejores condiciones', 'Libre', 200, 1),
(6, '2009', 'Normal', 'Mejores condiciones', 'Libre', 200, 1),
(7, '2010', 'FAMILIAR', 'Mejores condiciones', 'Libre', 200, 1),
(8, '2011', 'VIP', 'Mejores condiciones', 'Ocupado', 200, 0),
(10, '2002', 'PREMIUM', 'Mejores condiciones', 'Libre', 900, 1),
(11, '2000', 'FAMILIAR', 'Mejores condiciones', 'Libre', 1000, 1),
(12, '2020', 'SOLO', 'Mejores condiciones', 'Libre', 50, 1),
(13, '2021', 'FAMILIAR', 'Mejores condiciones', 'Libre', 500, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id` int(11) NOT NULL,
  `habitacion` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `empleado` int(11) NOT NULL,
  `cantidad_reserva` varchar(255) NOT NULL,
  `observacion` varchar(255) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`id`, `habitacion`, `cliente`, `empleado`, `cantidad_reserva`, `observacion`, `estado`) VALUES
(1, 1, 1, 1, '1', '1', 1),
(2, 1, 1, 1, '50', 'asd', 1),
(3, 1, 1, 1, '50', 'Ninguna', 1),
(4, 1, 1, 1, '5', 'ninguna', 1),
(5, 6, 2, 1, '15', 'Ninguna', 1),
(8, 4, 4, 1, '1', '-', 1),
(9, 2, 3, 1, '1', '-', 1),
(10, 6, 4, 1, '2', '-', 1),
(11, 4, 8, 1, '3', '-', 0),
(12, 2, 5, 1, '2', '-', 1),
(13, 2, 5, 1, '4', '-', 1),
(14, 4, 3, 1, '12', 'Dudoso', 1),
(15, 7, 6, 1, '3', 'Po', 1),
(16, 2, 13, 10, '4', 'Ninguna', 1),
(17, 13, 12, 10, '1', '-', 1),
(18, 6, 6, 10, '2', 'Joven', 1),
(19, 1, 8, 10, '5', 'Mayor de edad', 1);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `reserva_view`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `reserva_view` (
`id` int(11)
,`Habitacion` varchar(255)
,`Cliente` varchar(255)
,`Empleado` varchar(255)
,`Dias` varchar(255)
,`observacion` varchar(255)
,`estado` int(1)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id` int(11) NOT NULL,
  `roles` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `roles`) VALUES
(1, 'recepcion'),
(2, 'administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id` int(11) NOT NULL,
  `ruc` varchar(11) NOT NULL,
  `nom_serv` varchar(255) NOT NULL,
  `precio` double NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`id`, `ruc`, `nom_serv`, `precio`, `estado`) VALUES
(1, '21234567891', 'Pisco', 87.9, 1),
(3, '21234567876', 'almuerzo', 50.9, 1),
(4, '42142233121', 'masajes', 70.9, 1),
(5, '21299967891', 'Helado', 68.9, 1),
(7, '21234897322', 'Toalla', 5.9, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `usuario` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `password` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `IDempleado` int(11) NOT NULL,
  `id_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `usuario`, `password`, `IDempleado`, `id_rol`) VALUES
(1, 'Carl10', '12345', 1, 1),
(2, 'and02', '12345', 4, 2),
(4, 'chris', '12345', 10, 2);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `usuarioview`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `usuarioview` (
`id` int(11)
,`usuario` varchar(40)
,`password` varchar(40)
,`nombre_empleado` varchar(512)
,`roles` varchar(30)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `usuario_vista`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `usuario_vista` (
`id` int(11)
,`usuario` varchar(40)
,`password` varchar(40)
,`nombre_empleado` varchar(511)
,`dni_empleado` varchar(8)
,`telefono_empleado` varchar(9)
,`roles` varchar(30)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `reserva_view`
--
DROP TABLE IF EXISTS `reserva_view`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `reserva_view`  AS SELECT `a`.`id` AS `id`, `p`.`numero_ha` AS `Habitacion`, `m`.`nombre` AS `Cliente`, `r`.`nombre_empleado` AS `Empleado`, `a`.`cantidad_reserva` AS `Dias`, `a`.`observacion` AS `observacion`, `a`.`estado` AS `estado` FROM (((`reserva` `a` join `habitacion` `p` on(`a`.`habitacion` = `p`.`id`)) join `cliente` `m` on(`a`.`cliente` = `m`.`id`)) join `empleado` `r` on(`a`.`empleado` = `r`.`id`))  ;

-- --------------------------------------------------------

--
-- Estructura para la vista `usuarioview`
--
DROP TABLE IF EXISTS `usuarioview`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `usuarioview`  AS SELECT `u`.`id` AS `id`, `u`.`usuario` AS `usuario`, `u`.`password` AS `password`, concat(`e`.`nombre_empleado`,' ,',`e`.`apellido_empleado`) AS `nombre_empleado`, `r`.`roles` AS `roles` FROM ((`usuario` `u` join `empleado` `e` on(`e`.`id` = `u`.`IDempleado`)) join `rol` `r` on(`r`.`id` = `u`.`id_rol`))  ;

-- --------------------------------------------------------

--
-- Estructura para la vista `usuario_vista`
--
DROP TABLE IF EXISTS `usuario_vista`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `usuario_vista`  AS SELECT `u`.`id` AS `id`, `u`.`usuario` AS `usuario`, `u`.`password` AS `password`, concat(`e`.`nombre_empleado`,' ',`e`.`apellido_empleado`) AS `nombre_empleado`, `e`.`dni_empleado` AS `dni_empleado`, `e`.`telefono_empleado` AS `telefono_empleado`, `r`.`roles` AS `roles` FROM ((`usuario` `u` join `empleado` `e` on(`e`.`id` = `u`.`IDempleado`)) join `rol` `r` on(`r`.`id` = `u`.`id_rol`))  ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_id_servicios` (`id_servicio`),
  ADD KEY `fk_id_factura` (`id_factura`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `numero_ha` (`numero_ha`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_reser_habi` (`habitacion`),
  ADD KEY `fk_reser_client` (`cliente`),
  ADD KEY `fk_reser_emplea` (`empleado`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `IDempleado` (`IDempleado`,`id_rol`),
  ADD KEY `id_rol` (`id_rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `detalle`
--
ALTER TABLE `detalle`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD CONSTRAINT `fk_id_factura` FOREIGN KEY (`id_factura`) REFERENCES `factura` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_id_servicios` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `fk_reser_client` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `fk_reser_emplea` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`id`),
  ADD CONSTRAINT `fk_reser_habi` FOREIGN KEY (`habitacion`) REFERENCES `habitacion` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`id`) REFERENCES `empleado` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
