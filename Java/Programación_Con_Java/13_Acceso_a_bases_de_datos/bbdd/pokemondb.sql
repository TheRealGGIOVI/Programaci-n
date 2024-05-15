CREATE DATABASE pokemondb;
USE pokemondb;
-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2024 a las 16:21:06
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pokemondb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon`
--

CREATE TABLE `pokemon` (
  `numero_pokedex` int(11) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `peso` double NOT NULL,
  `altura` double NOT NULL,
  `sprite` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `pokemon`
--

INSERT INTO `pokemon` (`numero_pokedex`, `nombre`, `peso`, `altura`, `sprite`) VALUES
(1, 'Bulbasaur', 6.9, 0.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png'),
(2, 'Ivysaur', 13, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png'),
(3, 'Venasaur', 100, 2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png'),
(4, 'Charmander', 8.5, 0.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png'),
(5, 'Charmeleon', 19, 1.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png'),
(6, 'Charizard', 90.5, 1.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png'),
(7, 'Squirtle', 9, 0.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png'),
(8, 'Wartortle', 22.5, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png'),
(9, 'Blastoise', 85.5, 1.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png'),
(10, 'Caperpie', 2.9, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png'),
(11, 'Metapod', 9.9, 0.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png'),
(12, 'Butterfree', 32, 1.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png'),
(13, 'Weedle', 3.2, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png'),
(14, 'Kakuna', 10, 0.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png'),
(15, 'Beedrill', 29.5, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png'),
(16, 'Pidgey', 1.8, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png'),
(17, 'Pidgeotto', 30, 1.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png'),
(18, 'Pidgeot', 39.5, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png'),
(19, 'Rattata', 3.5, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png'),
(20, 'Raticate', 18.5, 0.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png'),
(21, 'Spearow', 2, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/21.png'),
(22, 'Fearow', 38, 1.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/22.png'),
(23, 'Ekans', 6.9, 2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/23.png'),
(24, 'Arbok', 65, 3.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/24.png'),
(25, 'Pikachu', 6, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png'),
(26, 'Raichu', 30, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/26.png'),
(27, 'Sandshrew', 12, 0.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/27.png'),
(28, 'Sandslash', 29.5, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/28.png'),
(29, 'Nidoran♀', 7, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/29.png'),
(30, 'Nidorina', 20, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/30.png'),
(31, 'Nidoqueen', 60, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/31.png'),
(32, 'Nidoran♂', 9, 0.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/32.png'),
(33, 'Nidorino', 19.5, 0.9, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/33.png'),
(34, 'Nidoking', 62, 1.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/34.png'),
(35, 'Clefairy', 7.5, 0.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/35.png'),
(36, 'Clefable', 40, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/36.png'),
(37, 'Vulpix', 9.9, 0.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/37.png'),
(38, 'Ninetales', 19.9, 1.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/38.png'),
(39, 'Jigglypuff', 5.5, 0.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/39.png'),
(40, 'Wigglytuff', 12, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/40.png'),
(41, 'Zubat', 7.5, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/41.png'),
(42, 'Golbat', 55, 1.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/42.png'),
(43, 'Oddish', 5.4, 0.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/43.png'),
(44, 'Gloom', 8.6, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/44.png'),
(45, 'Vileplume', 18.6, 1.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/45.png'),
(46, 'Paras', 5.4, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/46.png'),
(47, 'Parasect', 29.5, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/47.png'),
(48, 'Venonat', 30, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/48.png'),
(49, 'Venomoth', 12.5, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/49.png'),
(50, 'Digglet', 0.8, 0.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/50.png'),
(51, 'Dugtrio', 33.3, 0.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/51.png'),
(52, 'Meowth', 4.2, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/52.png'),
(53, 'Persian', 32, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/53.png'),
(54, 'Psyduck', 19.6, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/54.png'),
(55, 'Golduck', 76.6, 1.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/55.png'),
(56, 'Mankey', 28, 0.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/56.png'),
(57, 'Primeape', 32, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/57.png'),
(58, 'Growlithe', 19, 0.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/58.png'),
(59, 'Arcanine', 155, 1.9, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/59.png'),
(60, 'Poliwag', 12.4, 0.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/60.png'),
(61, 'Poliwhirl', 20, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/61.png'),
(62, 'Poliwrath', 54, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/62.png'),
(63, 'Abra', 19.5, 0.9, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/63.png'),
(64, 'Kadabra', 56.5, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/64.png'),
(65, 'Alakazam', 48, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/65.png'),
(66, 'Machop', 19.5, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/66.png'),
(67, 'Mackoke', 70.5, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/67.png'),
(68, 'Machamp', 130, 1.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/68.png'),
(69, 'Bellsprout', 4, 0.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/69.png'),
(70, 'Weepinbell', 6.4, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/70.png'),
(71, 'Victreebel', 15.5, 1.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/71.png'),
(72, 'Tentacool', 45.5, 0.9, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/72.png'),
(73, 'Tentacruel', 55, 1.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/73.png'),
(74, 'Geodude', 20, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/74.png'),
(75, 'Graveler', 105, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/75.png'),
(76, 'Golem', 300, 1.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/76.png'),
(77, 'Ponyta', 30, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/77.png'),
(78, 'Rapidash', 95, 1.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/78.png'),
(79, 'Slowpoke', 36, 1.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/79.png'),
(80, 'Slowbro', 78.5, 1.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/80.png'),
(81, 'Magnemite', 6, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/81.png'),
(82, 'Magneton', 60, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/82.png'),
(83, 'Farfetchd', 15, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/83.png'),
(84, 'Doduo', 39.2, 1.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/84.png'),
(85, 'Dodrio', 85.2, 1.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/85.png'),
(86, 'Seel', 90, 1.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/86.png'),
(87, 'Dewgong', 120, 1.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/87.png'),
(88, 'Grimer', 30, 0.9, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/88.png'),
(89, 'Muk', 30, 1.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/89.png'),
(90, 'Shellder', 4, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/90.png'),
(91, 'Cloyster', 132.5, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/91.png'),
(92, 'Gastly', 0.1, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/92.png'),
(93, 'Haunter', 0.1, 1.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/93.png'),
(94, 'Gengar', 40.5, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/94.png'),
(95, 'Onix', 210, 8.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/95.png'),
(96, 'Drowzee', 32.4, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/96.png'),
(97, 'Hypno', 75.6, 1.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/97.png'),
(98, 'Krabby', 6.5, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/98.png'),
(99, 'Kingler', 60, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/99.png'),
(100, 'Voltorb', 10.4, 0.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/100.png'),
(101, 'Electrode', 66.6, 1.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/101.png'),
(102, 'Exeggcute', 2.5, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/102.png'),
(103, 'Exeggutor', 120, 2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/103.png'),
(104, 'Cubone', 6.5, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/104.png'),
(105, 'Marowak', 45, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/105.png'),
(106, 'Hitmonlee', 49.8, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/106.png'),
(107, 'Hitmonchan', 50.2, 1.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/107.png'),
(108, 'Lickitung', 65, 1.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/108.png'),
(109, 'Koffing', 1, 0.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/109.png'),
(110, 'Weezing', 9.5, 1.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/110.png'),
(111, 'Rhyhorn', 115, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/111.png'),
(112, 'Rhydon', 120, 1.9, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/112.png'),
(113, 'Chansey', 34.6, 1.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/113.png'),
(114, 'Tangela', 35, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/114.png'),
(115, 'Kangaskhan', 80, 2.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/115.png'),
(116, 'Horsea', 8, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/116.png'),
(117, 'Seadra', 25, 1.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/117.png'),
(118, 'Goldeen', 15, 0.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/118.png'),
(119, 'Seaking', 39, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/119.png'),
(120, 'Staryu', 34.5, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/120.png'),
(121, 'Starmie', 80, 1.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/121.png'),
(122, 'Mr. Mime', 54.5, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/122.png'),
(123, 'Scyther', 56, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/123.png'),
(124, 'Jynx', 40.6, 1.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/124.png'),
(125, 'Electabuzz', 30, 1.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/125.png'),
(126, 'Magmar', 44.5, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/126.png'),
(127, 'Pinsir', 55, 1.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/127.png'),
(128, 'Tauros', 88.4, 1.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/128.png'),
(129, 'Magikarp', 10, 0.9, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/129.png'),
(130, 'Gyarados', 235, 6.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/130.png'),
(131, 'Lapras', 220, 2.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/131.png'),
(132, 'Ditto', 4, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png'),
(133, 'Eevee', 6.5, 0.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/133.png'),
(134, 'Vaporeon', 29, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/134.png'),
(135, 'Jolteon', 24.5, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/135.png'),
(136, 'Flareon', 25, 0.9, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/136.png'),
(137, 'Porygon', 36.5, 0.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/137.png'),
(138, 'Omanyte', 7.5, 4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/138.png'),
(139, 'Omastar', 35, 1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/139.png'),
(140, 'Kabuto', 11.5, 0.5, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/140.png'),
(141, 'Kabutops', 40.5, 1.3, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/141.png'),
(142, 'Aerodactyl', 59, 1.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/142.png'),
(143, 'Snorlax', 460, 2.1, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/143.png'),
(144, 'Articuno', 55.4, 1.7, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/144.png'),
(145, 'Zapdos', 52.6, 1.6, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/145.png'),
(146, 'Moltres', 60, 2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/146.png'),
(147, 'Dratini', 3.3, 1.8, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/147.png'),
(148, 'Dragonair', 16.5, 4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/148.png'),
(149, 'Dragonite', 210, 2.2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/149.png'),
(150, 'Mewtwo', 122, 2, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/150.png'),
(151, 'Mew', 4, 0.4, 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/151.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon_tipo`
--

CREATE TABLE `pokemon_tipo` (
  `numero_pokedex` int(11) NOT NULL,
  `id_tipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `pokemon_tipo`
--

INSERT INTO `pokemon_tipo` (`numero_pokedex`, `id_tipo`) VALUES
(1, 10),
(1, 14),
(2, 10),
(2, 14),
(3, 10),
(3, 14),
(4, 6),
(5, 6),
(6, 6),
(6, 15),
(7, 1),
(8, 1),
(9, 1),
(10, 2),
(11, 2),
(12, 2),
(12, 15),
(13, 2),
(13, 14),
(14, 2),
(14, 14),
(15, 2),
(15, 14),
(16, 9),
(16, 15),
(17, 9),
(17, 15),
(18, 9),
(18, 15),
(19, 9),
(20, 9),
(21, 9),
(21, 15),
(22, 9),
(22, 15),
(23, 14),
(24, 14),
(25, 4),
(26, 4),
(27, 13),
(28, 13),
(29, 14),
(30, 14),
(31, 13),
(31, 14),
(32, 14),
(33, 14),
(34, 13),
(34, 14),
(35, 9),
(36, 9),
(37, 6),
(38, 6),
(39, 9),
(40, 9),
(41, 14),
(41, 15),
(42, 14),
(42, 15),
(43, 10),
(43, 14),
(44, 10),
(44, 14),
(45, 10),
(45, 14),
(46, 2),
(46, 10),
(47, 2),
(47, 10),
(48, 2),
(48, 14),
(49, 2),
(49, 14),
(50, 13),
(51, 13),
(52, 9),
(53, 9),
(54, 1),
(55, 1),
(56, 8),
(57, 8),
(58, 6),
(59, 6),
(60, 1),
(61, 1),
(62, 1),
(62, 8),
(63, 11),
(64, 12),
(65, 13),
(66, 8),
(67, 8),
(68, 8),
(69, 10),
(69, 14),
(70, 10),
(70, 14),
(71, 10),
(71, 14),
(72, 1),
(72, 14),
(73, 1),
(73, 14),
(74, 12),
(74, 13),
(75, 12),
(75, 13),
(76, 12),
(76, 13),
(77, 6),
(78, 6),
(79, 1),
(79, 11),
(80, 1),
(80, 11),
(81, 4),
(82, 4),
(83, 9),
(83, 15),
(84, 9),
(84, 15),
(85, 9),
(85, 15),
(86, 1),
(86, 7),
(87, 1),
(87, 7),
(88, 14),
(89, 14),
(90, 1),
(91, 1),
(91, 7),
(92, 5),
(92, 14),
(93, 5),
(93, 14),
(94, 5),
(94, 14),
(95, 12),
(95, 13),
(96, 11),
(97, 11),
(98, 1),
(99, 1),
(100, 4),
(101, 4),
(102, 10),
(102, 11),
(103, 10),
(103, 11),
(104, 13),
(105, 13),
(106, 8),
(107, 8),
(108, 9),
(109, 14),
(110, 14),
(111, 12),
(111, 13),
(112, 12),
(112, 13),
(113, 9),
(114, 10),
(115, 9),
(116, 1),
(117, 1),
(118, 1),
(119, 1),
(120, 1),
(121, 1),
(121, 11),
(122, 11),
(123, 2),
(123, 15),
(124, 7),
(124, 11),
(125, 4),
(126, 6),
(127, 2),
(128, 9),
(129, 1),
(130, 1),
(130, 15),
(131, 1),
(131, 7),
(132, 9),
(133, 9),
(134, 1),
(135, 4),
(136, 6),
(137, 9),
(138, 1),
(138, 12),
(139, 1),
(139, 12),
(140, 1),
(140, 12),
(141, 1),
(141, 12),
(142, 12),
(142, 15),
(143, 9),
(144, 7),
(144, 15),
(145, 4),
(145, 15),
(146, 6),
(146, 15),
(147, 3),
(148, 3),
(149, 3),
(149, 15),
(150, 11),
(151, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `id_tipo` int(11) NOT NULL,
  `nombre` varchar(10) NOT NULL,
  `descripcion` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `tipo`
--

INSERT INTO `tipo` (`id_tipo`, `nombre`, `descripcion`) VALUES
(1, 'Agua', 'Se dice que es puro y que suele adaptarse a cualquier situación o condición climática, ya que el agua puede adoptar cualquier forma en cualquier momento'),
(2, 'Bicho', 'Este grupo de Pokémon se caracteriza por su crecimiento rápido ya que no tardan mucho en evolucionar, viven primordialmente en los bosques y zonas cercanas a estos, algunos son un poco más difíciles de divisar debido a que se encuentran en copas de árboles donde anidan.'),
(3, 'Dragón', 'Se caracterizan por ser difíciles de atrapar y entrenar. Interesante es el hecho de que muchos Pokémon del tipo dragón llegan a superar las estadísticas comunes.'),
(4, 'Eléctrico', 'Los Pokémon de tipo eléctrico tienen hábitats variados, desde bosques, praderas, ciudades y centrales eléctricas. Los Pokémon de tipo eléctrico almacenan electricidad estática en sus cuerpos y luego la liberan en forma de un ataque como Rayo por diferentes partes.'),
(5, 'Fantasma', 'Los Pokémon que pertenecen al tipo fantasma generalmente se relacionan con el terror, lo oscuro y el más allá. Suelen vivir en casas abandonadas, cementerios, torres fúnebres y lugares oscuros e inhabitados. Gran parte de estos Pokémon esbozan una sonrisa siniestra y tenebrosa. Otra característica de los Pokémon fantasma es que son extremadamente traviesos y les encanta jugarles bromas pesadas a los humanos y otros Pokémon.'),
(6, 'Fuego', 'Los Pokémon de tipo fuego basan sus ataques principalmente en el control de este elemento y la mayoría de estos ataques pueden quemar al Pokémon oponente. Son apasionados y algunos de mal carácter, viven en cuevas o zonas rocosas y muy áridas, y más probable aún cerca de volcanes activos. '),
(7, 'Hielo', 'Destacan por su gran resistencia y adaptación al medio frío o glaciar, como son las cimas de las montañas, las cavernas y cuevas heladas o incluso los polos. Tienen la capacidad de congelar al enemigo en combate. Además pueden realizar ataques devastadores como frío polar.'),
(8, 'Lucha', 'Este tipo de Pokémon son especialistas en el combate cuerpo a cuerpo. Se podría decir que son opuestos a los del tipo psíquico, ya que estos últimos dependen del ataque especial mientras que los del tipo lucha se especializan en ataque físico.'),
(9, 'Normal', 'Los tipos normal son los más diversos entre los Pokémon, con estadísticas variadas, desarrollos y requerimientos para sus evoluciones diferentes para cada uno, al igual que diferir en las zonas donde se pueden capturar, desde bosques, cuevas, montañas, ciudades, etc.'),
(10, 'Planta', 'Los Pokémon de tipo planta suelen ser pacíficos y les gusta cuidar de las flores y a los demás, pero también son grandes luchadores y pueden envenenar, paralizar o dormir al rival en combate.Normalmente su cuerpo suele ser igual a alguna especie vegetal, en cuyo caso el Pokémon crece en un desarrollo muy similar a un vegetal.'),
(11, 'Psíquico', 'Los Pokémon de este tipo suelen ser muy inteligentes y a menudo se les atribuye capacidades como prever acciones futuras, hacer levitar objetos o incluso a ellos mismos. Se puede localizar a este tipo de Pokémon en cuevas o zonas cercanas a estas.'),
(12, 'Roca', 'El tipo roca destaca por su gran defensa frente a ataques físicos. Sin embargo, tiene en su contra que presenta varias debilidades con respecto a otros tipos, y los Pokémon de este tipo no se caracterizan por ser muy veloces. Cabe destacar que la mayoría de los movimientos de tipo roca poseen baja precisión a la hora de atacar.'),
(13, 'Tierra', 'Los Pokémon de este tipo tienen temor al tipo agua, igual que los de tipo roca. Estos Pokémon se pueden hallar en cuevas o zonas rocosas. Los Pokémon de tipo tierra destacan por ser inmunes ante ataques tipo eléctrico. Son buenos combatientes y poseen ataques sumamente devastadores, como fisura y terremoto entre otros.'),
(14, 'Veneno', 'Pertenece a Pokémon que suelen encontrarse en zonas donde hay cuevas, pantanos o en sus cercanías, excepto en los Pokémon que tienen como primer tipo el tipo planta o tipo bicho. La mayoría de movimientos de tipo veneno pueden envenenar.'),
(15, 'Volador', 'Los Pokémon de tipo volador son rápidos y con ataques que normalmente son de contacto físico, o en los que utilizan el viento a su favor. Son inmunes al tipo tierra, puesto que al volar los ataques de este tipo no les afectan.');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`numero_pokedex`);

--
-- Indices de la tabla `pokemon_tipo`
--
ALTER TABLE `pokemon_tipo`
  ADD PRIMARY KEY (`numero_pokedex`,`id_tipo`),
  ADD KEY `id_tipo` (`id_tipo`);

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`id_tipo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pokemon`
--
ALTER TABLE `pokemon`
  MODIFY `numero_pokedex` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=152;

--
-- AUTO_INCREMENT de la tabla `tipo`
--
ALTER TABLE `tipo`
  MODIFY `id_tipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pokemon_tipo`
--
ALTER TABLE `pokemon_tipo`
  ADD CONSTRAINT `pokemon_tipo_ibfk_1` FOREIGN KEY (`numero_pokedex`) REFERENCES `pokemon` (`numero_pokedex`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pokemon_tipo_ibfk_2` FOREIGN KEY (`id_tipo`) REFERENCES `tipo` (`id_tipo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
