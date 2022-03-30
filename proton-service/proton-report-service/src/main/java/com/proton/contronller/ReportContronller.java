package com.proton.contronller;

import com.proton.entity.Report;
import com.proton.service.impl.ReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportContronller {

    @Autowired
    private ReportServiceImpl reportService;

    @GetMapping(value="/test1")
    public void saveTest() throws Exception {
        reportService.save();
    }

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
