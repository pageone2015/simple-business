create database simple_business;
use simple_business;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL COMMENT '用户名',
  `password` varchar(45) NOT NULL COMMENT '密码',
  `phone`	varchar(20) NOT NULL COMMENT '手机号码',
  `department`	varchar(50) NOT NULL COMMENT '部门',
  `status`	int(1) NOT NULL COMMENT '审批状态：0：待审批，1：审批通过，2：审批未通过',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_vote` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL COMMENT '用户名',
  `logistic_rate` int(5) NOT NULL COMMENT '后勤工作满意度',
  `hygien_rate` int(5) NOT NULL COMMENT '卫生状况满意度',
  `food_rate` int(5) NOT NULL COMMENT '食堂菜品满意度',
  `estate_rate` int(5) NOT NULL COMMENT '物业服务满意度',
  `suggestion` varchar(1000) NULL COMMENT '建议',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;


CREATE TABLE `t_fruit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fruit_name` varchar(45) NOT NULL COMMENT '水果名称',
  `fruit_desc` varchar(500) NULL COMMENT '水果描述',
  `original_name` varchar(100) NOT NULL COMMENT '水果图片原有名称',
  `save_path` varchar(200) NOT NULL COMMENT '水果图片保存路径',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

insert into t_user (user_name, password, phone, department, status) values ('1234', '123456', '1801234567', '123', '1');
