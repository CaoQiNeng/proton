package com.proton.dao;

import com.proton.entity.ProtonDoctorMarkReport;
import com.proton.entity.ProtonDoctorOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * <h1>EcommerceBalance Dao 接口定义</h1>
 * */
public interface DoctorOrderDao extends JpaRepository<ProtonDoctorOrder, Long> {
//    @Modifying(clearAutomatically = true)
//    @Query(value = "update t_proton_report_50w set model_result =&#63;1 where p.id = &#63;2",nativeQuery = true)
//    int updateModelResultById(Long id, Long result);
//    @Query(value = "select * from t_proton_doctor_mark_report ORDER BY count LIMIT 1",nativeQuery = true)
//    @Query(value = "update t_proton_report_50w set model_result =&#63;1 where p.id = &#63;2",nativeQuery = true)
//    ProtonDoctorOrder findMarkReport();
}
