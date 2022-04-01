package com.proton.contronller;

import com.proton.service.AnalysisDLService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <h1>订单服务对外 HTTP 接口</h1>
 * */
@Slf4j
@RestController
@RequestMapping("/analysis-dl")
public class AnalysisDLController {

    private final AnalysisDLService analysisHrvService;

    public AnalysisDLController(AnalysisDLService analysisHrvService) {
        this.analysisHrvService = analysisHrvService;
    }

//    @PostMapping("/dl")
//    public int dl(@RequestBody float[] ecg) {
//        log.info("begin dl, ecg len: [{}]", ecg.length);
//        return analysisHrvService.dl(ecg);
//    }

    @PostMapping("/dl")
    public int dl() {
//        log.info("begin dl, ecg len");\
        System.out.println(1);
        return 0;
    }
}
