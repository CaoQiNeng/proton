package com.proton.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <h1>用户账户服务 Feign 接口(安全的)</h1>
 * */
@FeignClient(
        contextId = "AnalysisRpeaksClient",
        value = "proton-rpeaks-analysis")
public interface AnalysisRpeaksClient {

    /**
     * <h2>根据 id 查询地址信息</h2>
     * */
    @RequestMapping(
            value = "/proton-rpeaks-analysis/analysis-rpeaks/findRpeaks",
            method = RequestMethod.POST
    )
    int[] findRpeaks(@RequestBody float[] ecg);
}
