-- 创建 t_proton_doctor_mark_report 数据表
CREATE TABLE IF NOT EXISTS `proton`.`t_proton_doctor_mark_report` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    `reprot_id` VARCHAR(30) NOT NULL DEFAULT '000' COMMENT '报告id',
    `count` INT NOT NULL DEFAULT 0 COMMENT '已被标记次数',
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='医生标注报告表';