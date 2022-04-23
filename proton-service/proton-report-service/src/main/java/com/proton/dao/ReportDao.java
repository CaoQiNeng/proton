package com.proton.dao;

import com.proton.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportDao {


    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     */
    public void save(Report test) {
//        mongoTemplate.save(test);
        mongoTemplate.save(test, "report");
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public Report findReport() {
        Query query = new Query(Criteria.where("modelResult").is(3));
        List<Report> mgt =  mongoTemplate.find(query , Report.class);
        System.out.println(mgt.get(10));
        System.out.println(mgt.size());
        return mgt.get(0);
    }
//
//    /**
//     * 更新对象
//     */
//    public void updateTest(MongoTest test) {
//        Query query=new Query(Criteria.where("id").is(test.getId()));
//        Update update= new Update().set("age", test.getAge()).set("name", test.getName());
//        //更新查询返回结果集的第一条
//        mongoTemplate.updateFirst(query,update,MongoTest.class);
//        //更新查询返回结果集的所有
//        // mongoTemplate.updateMulti(query,update,TestEntity.class);
//    }
//
//    /**
//     * 删除对象
//     * @param id
//     */
//    public void deleteTestById(Integer id) {
//        Query query=new Query(Criteria.where("id").is(id));
//        mongoTemplate.remove(query,MongoTest.class);
//    }
}
