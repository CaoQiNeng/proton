package com.proton.dao;

import com.proton.entity.ProtonDoctorBalance;
import com.proton.entity.ProtonDoctorMarkReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * <h1>EcommerceBalance Dao 接口定义</h1>
 * */
public interface DoctorBalanceDao extends JpaRepository<ProtonDoctorBalance, Long> {

//    @Modifying(clearAutomatically = true)
//    @Query(value = "update t_proton_report_50w set model_result =&#63;1 where p.id = &#63;2",nativeQuery = true)
//    int updateModelResultById(Long id, Long result);
}
