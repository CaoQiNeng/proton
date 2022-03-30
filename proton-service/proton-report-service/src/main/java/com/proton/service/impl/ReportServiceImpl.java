package com.proton.service.impl;

import com.proton.dao.ReportDao;
import com.proton.entity.Report;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Service
public class ReportServiceImpl {

    @Autowired
    private ReportDao reportDao;

    static int a = 0;

    public void save() throws Exception {
        Report report = new Report(a + "",0,1,1,1,0);
        reportDao.save(report);
        a++;

        log.info("create report success.");
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
