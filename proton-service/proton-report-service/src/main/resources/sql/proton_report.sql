-- 创建 t_ecommerce_order 数据表
-- 创建 t_ecommerce_order 数据表
CREATE TABLE IF NOT EXISTS `proton`.`t_proton_report` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    `user_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '用户 id',
    `reprot_id` VARCHAR(30) NOT NULL DEFAULT '000' COMMENT '报告id',
    `model_result` INT NOT NULL COMMENT '深度学习结果',
    `ave_hr` INT NOT NULL DEFAULT 0 COMMENT '平均心率',
    `alo` INT NOT NULL DEFAULT 0 COMMENT '饮酒风险指数',
    `LF` INT NOT NULL DEFAULT 0 COMMENT 'HRVLF',
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='用户订单表';