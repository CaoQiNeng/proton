package com.proton.dao;

import com.proton.entity.ProtonUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>ProtonUser Dao 接口定义</h1>
 * */public interface ProtonUserDao extends JpaRepository<ProtonUser, Long> {

    /**
     * <h2>根据用户名查询 EcommerceUser 对象</h2>
     * select * from t_ecommerce_user where username = ?
     * */
    ProtonUser findByUsername(String username);

    /**
     * <h2>根据用户名和密码查询实体对象</h2>
     * select * from t_ecommerce_user where username = ? and password = ?
     * */
    ProtonUser findByUsernameAndPassword(String username, String password);
}
