//package com.proton.service.impl;
//
//import com.alibaba.fastjson.JSONObject;
//import com.proton.dao.OrderDao;
//import com.proton.entity.AnalysisResult;
//import com.proton.service.TccActionOne;
//import io.seata.rm.tcc.api.BusinessActionContext;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * @author: peijiepang
// * @date 2019-11-11
// * @Description:
// */
//@Service
//public class TccActionOneImpl implements TccActionOne {
//
//    private final static Logger LOGGER = LoggerFactory.getLogger(TccActionOneImpl.class);
//
//    private final OrderDao orderDao;
//
//    public TccActionOneImpl(OrderDao orderDao) {
//        this.orderDao = orderDao;
//    }
//
//    @Override
//    public boolean createOrder(BusinessActionContext businessActionContext, AnalysisResult analysisResult) {
////        if(null == actionContext){
////            return false;
////        }
////        String xid = actionContext.getXid();
//        LOGGER.info("TccActionOne prepare, xid:");
//        orderDao.save(analysisResult);
//
//        int a = 3/0;
//        return true;
//    }
//
//    @Transactional
//    @Override
//    public boolean commit(BusinessActionContext actionContext) {
//        String xid = actionContext.getXid();
//        LOGGER.info("TccActionOne commit, xid:" + xid);
//        System.out.println(111111);
//        return true;
//    }
//
//    @Transactional
//    @Override
//    public boolean rollback(BusinessActionContext actionContext) {
//        String xid = actionContext.getXid();
//        Long orderNo = ((JSONObject) actionContext.getActionContext("order")).getLong("id");
//        orderDao.deleteById(orderNo);
//        LOGGER.info("TccActionOne rollback, xid:" + xid);
//        return true;
//    }
//
//}
