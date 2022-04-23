package com.proton.service.impl;

import com.proton.account.BalanceInfo;
//import com.proton.action.TccActionAccount;
import com.proton.dao.BalanceDao;
import com.proton.entity.ProtonBalance;
import com.proton.entity.ProtonReport;
import com.proton.service.IBalanceService;
//import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * <h1>用于余额相关服务接口实现</h1>
 * */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class BalanceServiceImpl implements IBalanceService {

//    private final BalanceDao balanceDao;
//    private final TccActionAccount tccActionAccount;

    private final BalanceDao balanceDao;

    public BalanceServiceImpl(BalanceDao balanceDao) {
//        this.tccActionAccount = tccActionAccount;
        this.balanceDao = balanceDao;
    }

    @Override
    @Transactional
    public int updateBalance() {
        int number = (int) (Math.random() * 100000);
        Long userId = 16L;

        int number2 = 0;
        if (number < 99999){
            number2 = number + 1;
        } else{
            number2 = number - 1;
        }
//        BalanceInfo balanceInfo = new BalanceInfo(
//                userId, 0L ,0l
//        );

        ProtonReport protonReport1 =
                balanceDao.findByUserId((long) number);

        protonReport1.setModelResult(protonReport1.getModelResult() + 1);

        ProtonReport protonReport2 =
                balanceDao.findByUserId((long) number2);

        protonReport1.setModelResult(protonReport2.getModelResult() + 1);
//        newReport.setId(1L);
//        newReport.setUserId(userId);
//        newReport.setModelResult(protonReport.getModelResult() + 1);
//        newReport.setAlo(1);
//        java.util.Date utilDate=new java.util.Date();
//        Date d=new Date (utilDate.getTime());
//        newReport.setCreateTime(d);
//        newReport.setLf(1);
//        newReport.setAveHr(1);
//        newReport.setReprotId("1");
        List<ProtonReport> list = new LinkedList<ProtonReport>();
        list.add(protonReport1);
        list.add(protonReport2);
        List<ProtonReport> pr = balanceDao.saveAll(list);
//        ProtonReport pr = balanceDao.save(protonReport);
        System.out.println(pr.get(0).getUserId());
        System.out.println(pr.get(1).getModelResult());

//        balanceDao.updateModelResultById(protonReport.getId(), (long) (protonReport.getModelResult() + 1));

//        System.out.println(a);
//        if (null != protonBalance) {
//        balanceInfo.setBalance(protonBalance.getBalance());
//        } else {
//             如果还没有用户余额记录, 这里创建出来，余额设定为0即可
//            ProtonBalance newBalance = new ProtonBalance();
//            newBalance.setUserId(userId);
//            newBalance.setBalance(0L);
//            log.info("init user balance record: [{}]",
//                    balanceDao.save(newBalance).getId());
//        }

        return 1;
    }

//    @Override
////    @GlobalTransactional
//    public BalanceInfo deductBalance(BalanceInfo balanceInfo) {
//        tccActionAccount.deductBalance(null, balanceInfo);
//
//        return new BalanceInfo();
//    }
}
