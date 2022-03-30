package com.proton.service.impl;

import com.proton.account.BalanceInfo;
import com.proton.dao.BalanceDao;
import com.proton.entity.ProtonBalance;
import com.proton.service.IBalanceService;
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

    private final BalanceDao balanceDao;

    public BalanceServiceImpl(BalanceDao balanceDao) {
        this.balanceDao = balanceDao;
    }

    @Override
    public BalanceInfo getCurrentUserBalanceInfo() {
        Long userId = 11L;
        BalanceInfo balanceInfo = new BalanceInfo(
                userId, 0L
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
    public BalanceInfo deductBalance(BalanceInfo balanceInfo) {
        Long userId = 11L;
        // 扣减用户余额的一个基本原则: 扣减额 <= 当前用户余额
        ProtonBalance protonBalance =
                balanceDao.findByUserId(userId);
        if (null == protonBalance
                || protonBalance.getBalance() - balanceInfo.getBalance() < 0
        ) {
            throw new RuntimeException("user balance is not enough!");
        }

        Long sourceBalance = protonBalance.getBalance();
        protonBalance.setBalance(protonBalance.getBalance() - balanceInfo.getBalance());
        log.info("deduct balance: [{}], [{}], [{}]",
                balanceDao.save(protonBalance).getId(), sourceBalance,
                balanceInfo.getBalance());

        return new BalanceInfo(
                protonBalance.getUserId(),
                protonBalance.getBalance()
        );
    }
}
