package com.proton.contronller;

import com.proton.service.AnalysisHrvService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <h1>订单服务对外 HTTP 接口</h1>
 * */
@Slf4j
@RestController
@RequestMapping("/analysis-hrv")
public class AnalysisHrvController {

    private final AnalysisHrvService analysisHrvService;

    public AnalysisHrvController(AnalysisHrvService analysisHrvService) {
        this.analysisHrvService = analysisHrvService;
    }

    @PostMapping("/hrv")
    public Map<String, Integer> hrv(@RequestBody int[] rpeaks) {
        log.info("begin hrv, rpeaks len: [{}]", rpeaks.length);
        return analysisHrvService.hrv(rpeaks);
    }
}
