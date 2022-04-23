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
@Table(name = "t_proton_doctor_mark_report")
public class ProtonDoctorMarkReport {

    /** 自增主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** 用户 id */
    @Column(name = "reprot_id", nullable = false)
    private String reprotId;

    /** 报告被标记次数 */
    @Column(name = "count", nullable = false)
    private int count;

    public ProtonDoctorMarkReport(String reprotId, int count) {
        this.reprotId = reprotId;
        this.count = count;
    }
}
