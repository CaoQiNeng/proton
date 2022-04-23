package com.proton.service;

//import com.proton.account.BalanceInfo;

/**
 * <h2>用于余额相关的服务接口定义</h2>
 * */
public interface IDoctorService {
    /**
     * <h2>批量插入医生数据</h2>
     *
     * */
    int batchInsertUser();

    /**
     * <h2>批量插入报告数据</h2>
     *
     * */
    int batchInsertReport();

    /**
     * <h2>批量插入报告数据</h2>
     *
     * */
    int findMardReport();
}
