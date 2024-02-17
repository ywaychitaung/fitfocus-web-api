-- -------------------------------------------------------------
-- TablePlus 5.9.0(538)
--
-- https://tableplus.com/
--
-- Database: fitfocus
-- Generation Time: 2024-02-17 14:28:52.1700
-- -------------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


DROP TABLE IF EXISTS `activity_log`;
CREATE TABLE `activity_log` (
  `activity_log_id` int NOT NULL AUTO_INCREMENT,
  `timestamp` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `user_user_id` int DEFAULT NULL,
  PRIMARY KEY (`activity_log_id`),
  KEY `UK_b7wd0opq37yokskcxycq7k2io` (`user_user_id`) USING BTREE,
  CONSTRAINT `FKp5696duol4ww0ebkb8rgr7h8a` FOREIGN KEY (`user_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `fitness_metrics`;
CREATE TABLE `fitness_metrics` (
  `fitness_metrics_id` int NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) NOT NULL,
  `height` double DEFAULT NULL,
  `meditation_duration` int DEFAULT NULL,
  `sleep_hours` int DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `water_consumption` int DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `user_user_id` int DEFAULT NULL,
  `bmi` double DEFAULT NULL,
  `exercise_calories_burned` double DEFAULT NULL,
  `food_calories_consumed` double DEFAULT NULL,
  PRIMARY KEY (`fitness_metrics_id`),
  UNIQUE KEY `UK_namiep9jkikxb4wphl2865twh` (`user_user_id`),
  CONSTRAINT `FKjcbc0f56n88jmnvt48sgr1g9n` FOREIGN KEY (`user_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `goal`;
CREATE TABLE `goal` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) NOT NULL,
  `current_weight` double DEFAULT NULL,
  `goal_weight` double DEFAULT NULL,
  `starting_weight` double DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `weekly_goal_gain_loss` double DEFAULT NULL,
  `weekly_workout_minutes` int DEFAULT NULL,
  `user_user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_9skououwhrdkv4o6cyr1dnlob` (`user_user_id`),
  CONSTRAINT `FKa55h4ws2tdinfwni873cepsil` FOREIGN KEY (`user_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `monthly_weight_data`;
CREATE TABLE `monthly_weight_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `day1` double DEFAULT NULL,
  `day10` double DEFAULT NULL,
  `day11` double DEFAULT NULL,
  `day12` double DEFAULT NULL,
  `day13` double DEFAULT NULL,
  `day14` double DEFAULT NULL,
  `day15` double DEFAULT NULL,
  `day16` double DEFAULT NULL,
  `day17` double DEFAULT NULL,
  `day18` double DEFAULT NULL,
  `day19` double DEFAULT NULL,
  `day2` double DEFAULT NULL,
  `day20` double DEFAULT NULL,
  `day21` double DEFAULT NULL,
  `day22` double DEFAULT NULL,
  `day23` double DEFAULT NULL,
  `day24` double DEFAULT NULL,
  `day25` double DEFAULT NULL,
  `day26` double DEFAULT NULL,
  `day27` double DEFAULT NULL,
  `day28` double DEFAULT NULL,
  `day29` double DEFAULT NULL,
  `day3` double DEFAULT NULL,
  `day30` double DEFAULT NULL,
  `day31` double DEFAULT NULL,
  `day4` double DEFAULT NULL,
  `day5` double DEFAULT NULL,
  `day6` double DEFAULT NULL,
  `day7` double DEFAULT NULL,
  `day8` double DEFAULT NULL,
  `day9` double DEFAULT NULL,
  `user_user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_gai77abcq0i7uk6qskdef2mcc` (`user_user_id`),
  CONSTRAINT `FK35or5lh51wem0eo4iqidsbgjt` FOREIGN KEY (`user_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `profile`;
CREATE TABLE `profile` (
  `profile_id` bigint NOT NULL AUTO_INCREMENT,
  `country` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) NOT NULL,
  `date_of_birth` datetime(6) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `profile_photo` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`profile_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `weekly_calories_data`;
CREATE TABLE `weekly_calories_data` (
  `weekly_calories_data_id` int NOT NULL AUTO_INCREMENT,
  `friday` double DEFAULT NULL,
  `monday` double DEFAULT NULL,
  `saturday` double DEFAULT NULL,
  `sunday` double DEFAULT NULL,
  `thursday` double DEFAULT NULL,
  `tuesday` double DEFAULT NULL,
  `wednesday` double DEFAULT NULL,
  `user_user_id` int DEFAULT NULL,
  PRIMARY KEY (`weekly_calories_data_id`),
  UNIQUE KEY `UK_idqngy7ex4o77xxdxiwdofj44` (`user_user_id`),
  CONSTRAINT `FKlv0c80f6fihcbv4e9mfyto1yx` FOREIGN KEY (`user_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `weekly_sleep_data`;
CREATE TABLE `weekly_sleep_data` (
  `weekly_sleep_id` int NOT NULL AUTO_INCREMENT,
  `friday` double DEFAULT NULL,
  `monday` double DEFAULT NULL,
  `saturday` double DEFAULT NULL,
  `sunday` double DEFAULT NULL,
  `thursday` double DEFAULT NULL,
  `tuesday` double DEFAULT NULL,
  `wednesday` double DEFAULT NULL,
  `user_user_id` int DEFAULT NULL,
  PRIMARY KEY (`weekly_sleep_id`),
  UNIQUE KEY `UK_b3uxu3xks3jgbcyvpwgx5jvvy` (`user_user_id`),
  CONSTRAINT `FKvy00ejrbptxb72v5o891q3uf` FOREIGN KEY (`user_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `weekly_water_consumption_data`;
CREATE TABLE `weekly_water_consumption_data` (
  `weekly_water_data_id` int NOT NULL AUTO_INCREMENT,
  `friday` double DEFAULT NULL,
  `monday` double DEFAULT NULL,
  `saturday` double DEFAULT NULL,
  `sunday` double DEFAULT NULL,
  `thursday` double DEFAULT NULL,
  `tuesday` double DEFAULT NULL,
  `wednesday` double DEFAULT NULL,
  `user_user_id` int DEFAULT NULL,
  PRIMARY KEY (`weekly_water_data_id`),
  UNIQUE KEY `UK_f62kxbyr3hyltrt7n091cbge6` (`user_user_id`),
  CONSTRAINT `FKm01pbduxs83a7ay7lo7wxbbrt` FOREIGN KEY (`user_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `activity_log` (`activity_log_id`, `timestamp`, `description`, `user_user_id`) VALUES
(24, '2024-02-16 01:34:07.164010', 'You have changed sleep hours to 8 hours.', 1),
(25, '2024-02-16 08:45:07.164010', 'You have changed food calories consumed to 150 kcal.', 1),
(26, '2024-02-16 09:02:39.714566', 'You have changed sleep hours to 8 hours.', 1),
(27, '2024-02-16 09:04:15.064279', 'You have changed sleep hours to 9 hours.', 1),
(28, '2024-02-16 09:10:17.091596', 'You have changed water consumption to 8 liters.', 1),
(29, '2024-02-16 09:12:54.356307', 'You have updated water consumption to 3 liters.', 1),
(30, '2024-02-16 09:20:13.848681', 'You have changed sleep hours to 5 hours.', 1),
(31, '2024-02-16 09:21:16.978202', 'You have changed sleep hours to 8 hours, water consumption to 4 liters.', 1),
(32, '2024-02-16 09:22:21.115971', 'You have changed food calories consumed to 150 kcal.', 1),
(33, '2024-02-16 09:22:54.087865', 'You have updated exercise calories burned to 158.39999999999998 kcal.', 1),
(34, '2024-02-16 09:25:08.488187', 'You have updated water consumption to8 liters.', 1),
(35, '2024-02-16 09:27:35.835599', 'You have updated exercise calories burned to 228 kcal.', 1),
(36, '2024-02-17 10:53:26.188138', 'You have changed sleep hours to 8 hours.', 1),
(37, '2024-02-17 11:00:26.150975', 'You have updated goal weight to 120 kg.', 1),
(38, '2024-02-17 11:06:05.543140', 'You have changed food calories consumed to 321 kcal.', 1),
(39, '2024-02-17 11:06:19.131322', 'You have changed food calories consumed to 150 kcal.', 1),
(40, '2024-02-17 11:09:28.010732', 'You have updated exercise calories burned to 135 kcal.', 1),
(41, '2024-02-17 11:09:56.430411', 'You have changed sleep hours to 8 hours, water consumption to 3 liters.', 1),
(42, '2024-02-17 11:17:11.413168', 'You have updated water consumption to5 liters.', 1),
(43, '2024-02-17 11:31:01.424458', 'You have changed water consumption to 3 liters.', 1),
(44, '2024-02-17 11:31:03.278420', 'You have changed water consumption to 3 liters.', 1),
(45, '2024-02-17 11:31:28.404756', 'You have updated goal weight to 80 kg.', 1),
(46, '2024-02-17 11:32:20.727421', 'You have changed food calories consumed to 321 kcal.', 1),
(47, '2024-02-17 11:33:16.614922', 'You have updated exercise calories burned to 135 kcal.', 1),
(48, '2024-02-17 11:35:18.695705', 'You have updated water consumption to3 liters.', 1),
(49, '2024-02-17 11:35:26.107677', 'You have updated water consumption to53 liters.', 1),
(50, '2024-02-17 11:35:52.872286', 'You have updated water consumption to5 liters.', 1),
(51, '2024-02-17 11:36:18.798203', 'You have updated water consumption to5 liters.', 1);

INSERT INTO `fitness_metrics` (`fitness_metrics_id`, `created_at`, `height`, `meditation_duration`, `sleep_hours`, `updated_at`, `water_consumption`, `weight`, `user_user_id`, `bmi`, `exercise_calories_burned`, `food_calories_consumed`) VALUES
(1, '2024-02-06 14:16:56.000000', 0, 1, 0, '2024-02-17 11:36:18.804275', 0, 0, 1, 17.6, 0, 0);

INSERT INTO `goal` (`id`, `created_at`, `current_weight`, `goal_weight`, `starting_weight`, `updated_at`, `weekly_goal_gain_loss`, `weekly_workout_minutes`, `user_user_id`) VALUES
(1, '2024-02-06 14:17:42.000000', 120, 80, 120, '2024-02-17 11:31:28.407416', 5, 1, 1);

INSERT INTO `monthly_weight_data` (`id`, `day1`, `day10`, `day11`, `day12`, `day13`, `day14`, `day15`, `day16`, `day17`, `day18`, `day19`, `day2`, `day20`, `day21`, `day22`, `day23`, `day24`, `day25`, `day26`, `day27`, `day28`, `day29`, `day3`, `day30`, `day31`, `day4`, `day5`, `day6`, `day7`, `day8`, `day9`, `user_user_id`) VALUES
(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);

INSERT INTO `profile` (`profile_id`, `country`, `created_at`, `date_of_birth`, `gender`, `profile_photo`, `updated_at`) VALUES
(1, 'Myanmar', '2024-02-06 14:18:29.000000', '2024-02-06 14:18:29.000000', 'Male', NULL, '2024-02-06 14:18:29.000000');

INSERT INTO `users` (`user_id`, `created_at`, `email`, `first_name`, `last_name`, `password`, `updated_at`, `username`) VALUES
(1, '2024-02-06 14:15:59.000000', 'johndoe@example.com', 'John', 'Doe', '$2y$10$sMqoM5sXsBoDpqUHcS7Gge5VId8muC1RE5RH8xizwGvVdWH/9IYbe', '2024-02-06 14:15:59.000000', 'johndoe');

INSERT INTO `weekly_calories_data` (`weekly_calories_data_id`, `friday`, `monday`, `saturday`, `sunday`, `thursday`, `tuesday`, `wednesday`, `user_user_id`) VALUES
(1, 150, 800, 0, 0, 2000, 1600, -500, 1);

INSERT INTO `weekly_sleep_data` (`weekly_sleep_id`, `friday`, `monday`, `saturday`, `sunday`, `thursday`, `tuesday`, `wednesday`, `user_user_id`) VALUES
(1, 10, 6, 9, 0, 8, 7, 5, 1);

INSERT INTO `weekly_water_consumption_data` (`weekly_water_data_id`, `friday`, `monday`, `saturday`, `sunday`, `thursday`, `tuesday`, `wednesday`, `user_user_id`) VALUES
(1, 3, 2, 5, 0, 3, 4, 3, 1);



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;