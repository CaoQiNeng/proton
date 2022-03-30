package com.proton.contronller;

import com.proton.service.AnalysisRpeaksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * <h1>订单服务对外 HTTP 接口</h1>
 * */
@Slf4j
@RestController
@RequestMapping("/analysis-rpeaks")
public class AnalysisRpeaksController {

    private final AnalysisRpeaksService analysisRpeaksService;

    public AnalysisRpeaksController(AnalysisRpeaksService analysisRpeaksService) {
        this.analysisRpeaksService = analysisRpeaksService;
    }

    @PostMapping("/findRpeaks")
    public int[] findRpeaks(@RequestBody float[] ecg) {
        log.info("begin findRpeaks, ecg len: [{}]", ecg.length);

        return analysisRpeaksService.findRpeaks(ecg);
    }
}
