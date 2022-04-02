//package com.proton.action.impl;
//
//import com.alibaba.fastjson.JSONObject;
//import com.proton.account.BalanceInfo;
//import com.proton.action.TccActionAccount;
//import com.proton.dao.BalanceDao;
//import com.proton.entity.ProtonBalance;
//import io.seata.rm.tcc.api.BusinessActionContext;
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author: peijiepang
// * @date 2019-11-11
// * @Description:
// */
//@Slf4j
//@Service
//public class TccActionAccountImpl implements TccActionAccount {
//
//    private final static Logger LOGGER = LoggerFactory.getLogger(TccActionAccountImpl.class);
//
//    private final BalanceDao balanceDao;
//
//    public TccActionAccountImpl(BalanceDao balanceDao) {
//        this.balanceDao = balanceDao;
//    }
//
//    @Override
//    @Transactional
//    public boolean deductBalance(BusinessActionContext businessActionContext, BalanceInfo balanceInfo) {
////        if(null == actionContext){
////            return false;
////        }
////        String xid = actionContext.getXid();
//        LOGGER.info("TccActionOne prepare, xid:");
//        // 扣减用户余额的一个基本原则: 扣减额 <= 当前用户余额
//        ProtonBalance protonBalance =
//                balanceDao.findByUserId(balanceInfo.getUserId());
//        if (null == protonBalance
//                || protonBalance.getBalance() - balanceInfo.getBalance() < 0
//        ) {
//            throw new RuntimeException("user balance is not enough!");
//        }
//
//        Long sourceBalance = protonBalance.getBalance();
//        protonBalance.setBalance(protonBalance.getBalance() - balanceInfo.getBalance());
//        protonBalance.setFreeze(protonBalance.getFreeze() + balanceInfo.getBalance());
//
//        log.info("deduct balance: [{}], [{}], [{}]",
//                balanceDao.save(protonBalance).getId(), sourceBalance,
//                balanceInfo.getBalance());
//
//        int a = 3 / 0;
//
//        return true;
//    }
//
//    @Override
//    @Transactional
//    public boolean commit(BusinessActionContext actionContext) {
//        String xid = actionContext.getXid();
//        // 扣减用户余额的一个基本原则: 扣减额 <= 当前用户余额
//        ProtonBalance protonBalance =
//                balanceDao.findByUserId(((JSONObject) actionContext.getActionContext("balance"))
//                        .getLong("userId"));
//
//        Long sourceBalance = protonBalance.getBalance();
//        protonBalance.setFreeze(protonBalance.getFreeze() -
//                ((JSONObject) actionContext.getActionContext("balance")).getLong("balance"));
//
//        balanceDao.save(protonBalance);
////        log.info("deduct balance: [{}], [{}], [{}]",
////                balanceDao.save(protonBalance).getId(), sourceBalance,
////                balanceInfo.getBalance());
//        LOGGER.info("TccActionOne commit, xid:" + xid);
//        System.out.println(111);
//        return true;
//    }
//
//    @Override
//    @Transactional
//    public boolean rollback(BusinessActionContext actionContext) {
//        String xid = actionContext.getXid();
//        Long orderNo = ((JSONObject) actionContext.getActionContext("balance")).getLong("userId");
////        balanceDao.deleteById(orderNo);
//        LOGGER.info("TccActionOne rollback, xid:" + xid);
//        return true;
//    }
//
//}
