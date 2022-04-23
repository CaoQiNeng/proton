package com.proton.controller;

import com.proton.service.HelloService;
import com.proton.service.IAnalysisService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

/**
 * <h1>订单服务对外 HTTP 接口</h1>
 * */
@Slf4j
@RestController
@RequestMapping("/analysis")
public class AnalysisController {
    private final IAnalysisService analysisService;

    @DubboReference
    HelloService helloService;

    public AnalysisController(IAnalysisService analysisService) {
        this.analysisService = analysisService;
    }

    @PostMapping("/analysis")
    public void createOrder() {
//        analysisService.analysis();
        analysisService.analysisSeata();
    }

    @GetMapping("/analysisOpenFeign")
    public void analysisOpenFeign() {
//        analysisService.analysis();
        analysisService.analysisOpenFeign();
    }

    @PostMapping("/analysisSeataTcc")
    public void analysisSeataTcc() {
//        analysisService.analysis();
        analysisService.analysisSeataTcc();
    }

    @PostMapping("/batchInsert")
    public void batchInsert() {
//        analysisService.analysis();
        for (int q = 0; q < 100; q++){
            System.out.println(q);
            analysisService.batchInsert(q);
        }
    }

//    @PostMapping("/test-dubbo")
//    public void testDubbo() {
//        String a = helloService.hello();
//
//        System.out.println(a);
//
////        analysisService.analysis();
////        for (int q = 0; q < 100; q++){
////            System.out.println(q);
////            analysisService.batchInsert(q);
////        }
//    }
}
