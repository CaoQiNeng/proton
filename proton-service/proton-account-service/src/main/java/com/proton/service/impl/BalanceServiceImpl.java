package com.proton.service.impl;

import com.proton.account.BalanceInfo;
import com.proton.action.TccActionAccount;
import com.proton.dao.BalanceDao;
import com.proton.entity.ProtonBalance;
import com.proton.service.IBalanceService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h1>用于余额相关服务接口实现</h1>
 * */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class BalanceServiceImpl implements IBalanceService {

//    private final BalanceDao balanceDao;
    private final TccActionAccount tccActionAccount;

    private final BalanceDao balanceDao;

    public BalanceServiceImpl(TccActionAccount tccActionAccount, BalanceDao balanceDao) {
        this.tccActionAccount = tccActionAccount;
        this.balanceDao = balanceDao;
    }

    @Override
    public BalanceInfo getCurrentUserBalanceInfo() {
        Long userId = 16L;
        BalanceInfo balanceInfo = new BalanceInfo(
                userId, 0L ,0l
        );

        ProtonBalance protonBalance =
                balanceDao.findByUserId(userId);
        if (null != protonBalance) {
            balanceInfo.setBalance(protonBalance.getBalance());
        } else {
            // 如果还没有用户余额记录, 这里创建出来，余额设定为0即可
            ProtonBalance newBalance = new ProtonBalance();
            newBalance.setUserId(userId);
            newBalance.setBalance(0L);
            log.info("init user balance record: [{}]",
                    balanceDao.save(newBalance).getId());
        }

        return balanceInfo;
    }

    @Override
//    @GlobalTransactional
    public BalanceInfo deductBalance(BalanceInfo balanceInfo) {
        tccActionAccount.deductBalance(null, balanceInfo);

        return new BalanceInfo();
    }
}
