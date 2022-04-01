//package com.proton.service.impl;
//
//import com.alibaba.fastjson.JSONObject;
//import com.proton.dao.OrderDao;
//import com.proton.entity.AnalysisResult;
//import com.proton.service.TccActionOne;
//import com.proton.service.TccActionOneService;
//import io.seata.rm.tcc.api.BusinessActionContext;
//import io.seata.spring.annotation.GlobalTransactional;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * @author: peijiepang
// * @date 2019-11-11
// * @Description:
// */
//@Service
//public class TccActionOneServiceImpl implements TccActionOneService {
//
//    private final static Logger LOGGER = LoggerFactory.getLogger(TccActionOneServiceImpl.class);
//
//    @Autowired
//    TccActionOne tccActionOne;
//
//    @Override
//    @GlobalTransactional
//    public String buy(){
//        AnalysisResult analysisResult = new AnalysisResult(11111L, "000001_0000001", 1,
//                1, 1, 1);
//        tccActionOne.createOrder(null, analysisResult);
//
//        return "sucess";
//    }
//}
