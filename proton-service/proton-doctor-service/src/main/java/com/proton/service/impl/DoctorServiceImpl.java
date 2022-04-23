package com.proton.service.impl;

//import com.proton.action.TccActionAccount;
import com.proton.dao.DoctorBalanceDao;
import com.proton.dao.DoctorMarkDao;
import com.proton.dao.DoctorOrderDao;
import com.proton.entity.ProtonDoctorBalance;
import com.proton.entity.ProtonDoctorMarkReport;
import com.proton.entity.ProtonDoctorOrder;
import com.proton.service.IDoctorService;
//import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * <h1>用于余额相关服务接口实现</h1>
 * */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class DoctorServiceImpl implements IDoctorService {

//    private final BalanceDao balanceDao;
//    private final TccActionAccount tccActionAccount;

    private final DoctorBalanceDao doctorBalanceDao;

    private final DoctorMarkDao doctorMarkDao;

    private final DoctorOrderDao doctorOrderDao;

    public DoctorServiceImpl(DoctorBalanceDao doctorBalanceDao, DoctorMarkDao doctorMarkDao, DoctorOrderDao doctorOrderDao) {
//        this.tccActionAccount = tccActionAccount;
        this.doctorBalanceDao = doctorBalanceDao;
        this.doctorMarkDao = doctorMarkDao;
        this.doctorOrderDao = doctorOrderDao;
    }

    @Override
    public int batchInsertUser() {
        List<ProtonDoctorBalance> list = new ArrayList<ProtonDoctorBalance>();
        for (int i = 0; i < 500; i++){
            Date d = new Date();
            ProtonDoctorBalance pdb = new ProtonDoctorBalance(11L, (long) i,0L,0L, d, d);
            doctorBalanceDao.save(pdb);
        }

        return 0;
    }

    @Override
    public int batchInsertReport() {
        for (int i = 0; i < 100000; i++){
            ProtonDoctorMarkReport pdmr = new ProtonDoctorMarkReport(String.valueOf(i),0);
            doctorMarkDao.save(pdmr);
        }

        return 0;
    }

    @Override
    public int findMardReport() {
//        Optional<ProtonDoctorMarkReport> report = doctorMarkDao.findById(2822L);
        List<ProtonDoctorMarkReport> report_list = doctorMarkDao.findMarkReport();
        int index = (int)(Math.random() * report_list.size());
        ProtonDoctorMarkReport report = report_list.get(index);

        doctorMarkDao.updateMarkReport(report.getCount() + 1, report.getId(), report.getCount());
        System.out.println(report);



//        int random = (int)(Math.random() * 500);
//        ProtonDoctorOrder protonDoctorOrder = new ProtonDoctorOrder((long) random, report.getReprotId(),
//                                        0, new Date(), new Date());
//        doctorOrderDao.save(protonDoctorOrder);

//        int a =1/0;
        return 0;
    }

}
