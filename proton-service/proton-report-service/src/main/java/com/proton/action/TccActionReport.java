//package com.proton.action;
//
//import com.proton.account.BalanceInfo;
//import com.proton.entity.Report;
//import io.seata.rm.tcc.api.BusinessActionContext;
//import io.seata.rm.tcc.api.BusinessActionContextParameter;
//import io.seata.rm.tcc.api.LocalTCC;
//import io.seata.rm.tcc.api.TwoPhaseBusinessAction;
//
///**
// * @author: peijiepang
// * @date 2019-11-11
// * @Description:
// */
//@LocalTCC
//public interface TccActionReport {
//    @TwoPhaseBusinessAction(name = "TccActionOne" , commitMethod = "commit", rollbackMethod = "rollback")
//    boolean save(BusinessActionContext businessActionContext, @BusinessActionContextParameter(paramName = "report") Report report);
//
//    /**
//     * Commit boolean.
//     *
//     * @param actionContext the action context
//     * @return the boolean
//     */
//    boolean commit(BusinessActionContext actionContext);
//
//    /**
//     * Rollback boolean.
//     *
//     * @param actionContext the action context
//     * @return the boolean
//     */
//    boolean rollback(BusinessActionContext actionContext);
//
//}
