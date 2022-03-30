package com.proton.dao;

import com.proton.entity.ProtonBalance;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>EcommerceBalance Dao 接口定义</h1>
 * */
public interface BalanceDao extends JpaRepository<ProtonBalance, Long> {

    /** 根据 userId 查询 EcommerceBalance 对象 */
    ProtonBalance findByUserId(Long userId);
}
