package com.proton.service;

/**
 * <h1>订单相关服务接口定义</h1>
 * */
public interface IAnalysisService {
    /**
     * <h2>下单(分布式事务): 创建订单 -> 扣减库存 -> 扣减余额 -> 创建物流信息(Stream + Kafka)</h2>
     * */
    void analysis();

    void analysisSeata();
}
