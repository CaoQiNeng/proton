package com.proton.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * <h1>用户账户服务 Feign 接口(安全的)</h1>
 * */
@FeignClient(
        contextId = "AnalysisHrvClient",
        value = "proton-hrv-analysis")
public interface AnalysisHrvClient {

    /**
     * <h2>根据 id 查询地址信息</h2>
     * */
    @RequestMapping(
            value = "/proton-hrv-analysis/analysis-hrv/hrv",
            method = RequestMethod.POST
    )
    Map<String, Integer> hrv(@RequestBody int[] rpeaks);
}
