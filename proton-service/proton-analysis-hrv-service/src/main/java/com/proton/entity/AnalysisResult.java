package com.proton.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * <h1>用户订单表实体类定义</h1>
 * */
@Data
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_proton_report_hrv")
public class AnalysisResult {
    /** 用户 id */
    @Id
    @Column(name = "report_id", nullable = false)
    private Long reportId;

    /** 深度学习结果 */
    @Column(name = "model_result", nullable = false)
    private int modelResult;

    public AnalysisResult(Long reportId, int modelResult) {
        this.reportId = reportId;
        this.modelResult = modelResult;
    }
}
