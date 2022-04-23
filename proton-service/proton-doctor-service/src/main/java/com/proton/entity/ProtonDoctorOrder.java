package com.proton.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * <h1>用户订单表实体类定义</h1>
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_proton_order")
public class ProtonDoctorOrder {

    /** 自增主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** 用户 id */
    @Column(name = "user_id", nullable = false)
    private Long userId;

    /** 报告 id */
    @Column(name = "report_id", nullable = false)
    private String reportId;

    /** 报告被标记次数 */
    @Column(name = "report_status", nullable = false)
    private int reportStatus;

    /** 创建时间 */
    @CreatedDate
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    /** 更新时间 */
    @LastModifiedDate
    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    public ProtonDoctorOrder(Long userId, String reprotId, int reportStatus, Date createTime, Date updateTime) {
        this.userId = userId;
        this.reportId = reprotId;
        this.reportStatus = reportStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
