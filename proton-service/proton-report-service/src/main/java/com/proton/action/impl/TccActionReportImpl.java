package com.proton.action.impl;

import com.alibaba.fastjson.JSONObject;
import com.proton.action.TccActionReport;
import com.proton.dao.ReportDao;
import com.proton.entity.Report;
import io.seata.rm.tcc.api.BusinessActionContext;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: peijiepang
 * @date 2019-11-11
 * @Description:
 */
@Slf4j
@Service
public class TccActionReportImpl implements TccActionReport {

    private final static Logger LOGGER = LoggerFactory.getLogger(TccActionReportImpl.class);

    private final ReportDao reportDao;

    public TccActionReportImpl(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    @Override
    @Transactional
    public boolean save(BusinessActionContext businessActionContext, Report report) {
        report.setState(1);

        reportDao.save(report);

        return true;
    }

    @Override
    @Transactional
    public boolean commit(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();

        Report report = new Report();
        report.setState(2);

//        reportDao.save(report);
        LOGGER.info("TccActionOne commit, xid:" + xid);
        return true;
    }

    @Override
    @Transactional
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
//        Long orderNo = ((JSONObject) actionContext.getActionContext("report")).getLong("userId");
        Report report = new Report();
        report.setState(3);

        reportDao.save(report);
//        balanceDao.deleteById(orderNo);
        LOGGER.info("TccActionOne rollback, xid:" + xid);
        return true;
    }

}
