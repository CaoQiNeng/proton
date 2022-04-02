package com.proton.contronller;

import com.proton.account.BalanceInfo;
import com.proton.service.IBalanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * <h1>用户余额服务 Controller</h1>
 * */
@Slf4j
@RestController
@RequestMapping("/balance")
public class BalanceController {

    private final IBalanceService balanceService;

    public BalanceController(IBalanceService balanceService) {
        this.balanceService = balanceService;
    }

    @PostMapping("/update-balance")
    public void updateBalance() {
        int a = balanceService.updateBalance();
    }

//    @PutMapping("/deduct-balance")
//    public void deductBalance() {
//        BalanceInfo balanceInfo = new BalanceInfo(16L, 1L, 0L);
//        balanceService.deductBalance(balanceInfo);
//    }
}
