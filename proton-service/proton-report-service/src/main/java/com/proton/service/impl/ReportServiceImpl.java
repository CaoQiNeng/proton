package com.proton.service.impl;

//import com.proton.action.TccActionReport;
import com.proton.dao.ReportDao;
import com.proton.entity.Report;
//import com.proton.service.IReportService;
//import io.seata.spring.annotation.GlobalTransactional;
import com.proton.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class ReportServiceImpl implements ReportService {

    private final ReportDao reportDao;

//    private final TccActionReport tccActionAccount;

    static int a = 0;

    public ReportServiceImpl(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    @Override
//    @GlobalTransactional
    public void save() throws Exception {
        Report report = new Report(a + "", a % 6,1,1,1,0);
        reportDao.save(report);
        a++;

        log.info("create report success.");
    }

    @Override
    public void findReport() throws Exception {
//        Report report = new Report(a + "",0,1,1,1,0);
//        tccActionAccount.save(null, report);
//        a++;

        Report a = reportDao.findReport();
        System.out.println(a);

//        log.info("create report success.");
    }
//
//    @GetMapping(value="/test2")
//    public MongoTest findTestByName(){
//        MongoTest mgtest= mtdao.findTestByName("ceshi");
//        System.out.println("mgtest is "+mgtest);
//        return mgtest;
//    }
//
//    @GetMapping(value="/test3")
//    public void updateTest(){
//        MongoTest mgtest=new MongoTest();
//        mgtest.setId(11);
//        mgtest.setAge(44);
//        mgtest.setName("ceshi2");
//        mtdao.updateTest(mgtest);
//    }
//
//    @GetMapping(value="/test4")
//    public void deleteTestById(){
//        mtdao.deleteTestById(11);
//    }
}
