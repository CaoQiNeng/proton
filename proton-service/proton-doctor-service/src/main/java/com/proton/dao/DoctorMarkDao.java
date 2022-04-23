package com.proton.dao;

import com.proton.entity.ProtonDoctorBalance;
import com.proton.entity.ProtonDoctorMarkReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * <h1>EcommerceBalance Dao 接口定义</h1>
 * */
public interface DoctorMarkDao extends JpaRepository<ProtonDoctorMarkReport, Long> {
//    @Modifying(clearAutomatically = true)
//    @Query(value = "update t_proton_report_50w set model_result =&#63;1 where p.id = &#63;2",nativeQuery = true)
//    int updateModelResultById(Long id, Long result);
    @Query(value = "select * from t_proton_doctor_mark_report where count < 15 ORDER BY count DESC LIMIT 50",nativeQuery = true)
//    @Query(value = "update t_proton_report_50w set model_result =&#63;1 where p.id = &#63;2",nativeQuery = true)
    List<ProtonDoctorMarkReport> findMarkReport();

    @Modifying
    @Query(nativeQuery = true,value = "update t_proton_doctor_mark_report set count = ?1 where id = ?2 and count = ?3")
    int updateMarkReport(int count, Long id, int beforeCount);
}
