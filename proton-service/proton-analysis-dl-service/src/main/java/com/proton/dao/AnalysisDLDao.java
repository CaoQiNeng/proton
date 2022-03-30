package com.proton.dao;

import com.proton.entity.AnalysisDLResult;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * <h1>EcommerceOrder Dao 接口定义</h1>
 * */
public interface AnalysisDLDao extends PagingAndSortingRepository<AnalysisDLResult, Long> {

    /**
     * <h2>根据 userId 查询分页订单</h2>
     * select * from t_ecommerce_order where user_id = ?
     *  order by ... desc/asc limit x offset y
     * */
}
