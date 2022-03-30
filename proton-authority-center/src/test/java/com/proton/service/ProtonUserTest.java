package com.proton.service;

import cn.hutool.crypto.digest.MD5;
import com.alibaba.fastjson.JSON;
import com.proton.dao.ProtonUserDao;
import com.proton.entity.ProtonUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

//@Slf4j
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class ProtonUserTest {
//    @Autowired
//    private ProtonUserDao protonUserDao;
//
//    @Test
//    public void createUserRecord(){
//        ProtonUser ecommerceUser = new ProtonUser();
//        ecommerceUser.setUsername("ImoocQinyi@imooc.com");
//        ecommerceUser.setPassword(MD5.create().digestHex("12345678"));
//        ecommerceUser.setExtraInfo("{}");
//        Date a = new Date();
//        ecommerceUser.setCreateTime(a);
//        ecommerceUser.setUpdateTime(a);
//        log.info("save user: [{}]",
//                JSON.toJSON(protonUserDao.save(ecommerceUser)));
//    }
//}
