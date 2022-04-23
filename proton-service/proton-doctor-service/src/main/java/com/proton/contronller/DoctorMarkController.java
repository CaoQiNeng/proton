package com.proton.contronller;

import com.proton.service.IDoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>用户余额服务 Controller</h1>
 * */
@Slf4j
@RestController
@RequestMapping("/doctor-balance")
public class DoctorMarkController {

    private final IDoctorService doctorMarkService;

    public DoctorMarkController(IDoctorService doctorMarkService) {
        this.doctorMarkService = doctorMarkService;
    }

    @PostMapping("/batch-insert-user")
    public void batchInsertUser() {
        int a = doctorMarkService.batchInsertUser();
    }

    @PostMapping("/batch-insert-report")
    public void batchInsertReport() {
        int a = doctorMarkService.batchInsertReport();
    }

    @PostMapping("/get-mark-report")
    public void getMarkReport() {
        int a = doctorMarkService.findMardReport();

        int b = 1;
    }

//    @PutMapping("/deduct-balance")
//    public void deductBalance() {
//        BalanceInfo balanceInfo = new BalanceInfo(16L, 1L, 0L);
//        balanceService.deductBalance(balanceInfo);
//    }
}
