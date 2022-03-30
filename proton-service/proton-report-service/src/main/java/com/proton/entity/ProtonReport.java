package com.proton.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;

/**
 * <h1>用户订单表实体类定义</h1>
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_proton_report")
public class ProtonReport {

    /** 自增主键 */
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** 用户 id */
    @Column(name = "user_id", nullable = false)
    private Long userId;

    /** 用户 id */
    @Column(name = "reprot_id", nullable = false)
    private String reprotId;

    /** 深度学习结果 */
    @Column(name = "model_result", nullable = false)
    private int modelResult;

    /** 心率 */
    @Column(name = "ave_hr", nullable = false)
    private int aveHr;

    /** 饮酒风险指数 */
    @Column(name = "alo", nullable = false)
    private int alo;

    /** HRVLF */
    @Column(name = "lf", nullable = false)
    private int lf;

    /** 创建时间 */
    @CreatedDate
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    public ProtonReport(Long userId, String reprotId, int modelResult, int aveHr, int alo, int lf) {
        this.id = 11l;
        this.userId = userId;
        this.reprotId = reprotId;
        this.modelResult = modelResult;
        this.aveHr = aveHr;
        this.alo = alo;
        this.lf = lf;
        this.createTime = new Date(new java.util.Date().getTime());
    }
}
