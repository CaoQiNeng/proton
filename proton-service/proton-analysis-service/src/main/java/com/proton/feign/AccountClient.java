package com.proton.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <h1>用户账户服务 Feign 接口(安全的)</h1>
 * */
@FeignClient(
        contextId = "AccountClient",
        value = "proton-account")
public interface AccountClient {

    /**
     * <h2>根据 id 查询地址信息</h2>
     * */
    @RequestMapping(
            value = "/proton-account/balance/deduct-balance",
            method = RequestMethod.PUT
    )
    void deductBalance();
}
