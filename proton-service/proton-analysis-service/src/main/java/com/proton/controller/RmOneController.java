package com.proton.controller;

import com.proton.entity.AnalysisResult;
import com.proton.service.TccActionOne;
import com.proton.service.TccActionOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * tcc rm分支注册--下单服务
 * @author: peijiepang
 * @date 2019-11-11
 * @Description:
 */
@RestController
public class RmOneController {

    @Autowired
    private TccActionOneService tccActionOneService;

    @PostMapping(value = "/order/create")
    public String createOrder(){
        tccActionOneService.buy();

        return "ok";
    }

}
