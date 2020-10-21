/*
Navicat MySQL Data Transfer

Source Server         : lx
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : oadb

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-10-21 15:11:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for depart
-- ----------------------------
DROP TABLE IF EXISTS `depart`;
CREATE TABLE `depart` (
  `pid` int NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `pname` varchar(50) NOT NULL COMMENT '部门名称',
  `premark` varchar(500) DEFAULT NULL COMMENT '部门备注',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of depart
-- ----------------------------
INSERT INTO `depart` VALUES ('1', '开发部门', '技术人员');
INSERT INTO `depart` VALUES ('2', '营销部门', '营销人员');
INSERT INTO `depart` VALUES ('3', '客服部门', '客服人员');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `realname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '真实姓名',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `psw` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工性别',
  `pid` int DEFAULT NULL COMMENT '外键（部门编号）',
  `path` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  KEY `pid` (`pid`),
  CONSTRAINT `pid` FOREIGN KEY (`pid`) REFERENCES `depart` (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '明明', 'admin', 'admin', '男', '1', '小明小明');
INSERT INTO `users` VALUES ('2', '红红', '123456', '123456', '女', '2', '红红红红');
INSERT INTO `users` VALUES ('3', '花花', '123456', '123456', '女', '3', '花花花花');
