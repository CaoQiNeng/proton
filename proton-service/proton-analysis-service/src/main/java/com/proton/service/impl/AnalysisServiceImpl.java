package com.proton.service.impl;

import com.proton.dao.AnalysisDao;
import com.proton.entity.AnalysisResult;
import com.proton.feign.*;
import com.proton.service.IAnalysisService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * <h1>订单相关服务接口实现</h1>
 * */
@Slf4j
@Service
public class AnalysisServiceImpl implements IAnalysisService {
    /** Feign 客户端 */
    private final AnalysisDLClient analysisDLClient;

    private final AnalysisRpeaksClient analysisRpeaksClient;

    private final AnalysisHrvClient analysisHrvClient;

    private final AnalysisDao analysisDao;

    private final ReportClient reportClient;

    private final AccountClient accountClient;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PersistenceContext
    private EntityManager em;

    static int a= 0;

    public AnalysisServiceImpl(AnalysisDLClient analysisDLClient, AnalysisRpeaksClient analysisRpeaksClient,
                               AnalysisHrvClient analysisHrvClient, AnalysisDao analysisDao, ReportClient reportClient, AccountClient accountClient) {
        this.analysisDLClient = analysisDLClient;
        this.analysisRpeaksClient = analysisRpeaksClient;
        this.analysisHrvClient = analysisHrvClient;
        this.analysisDao = analysisDao;
        this.reportClient = reportClient;
        this.accountClient = accountClient;
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void analysisSeataTcc() {
        reportClient.saveTest();

        accountClient.deductBalance();


//        int a= 3/0;
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void analysisSeata() {
        int ecgLen = 256 * 10;
        float[] ecg = new float[ecgLen];
        for(int i = 0; i < ecgLen; i++){
            ecg[i] = 1.322f;
        }
        analysisDLClient.dl(ecg);

        int[] rPeaks = new int[10];
        for(int i = 0; i < 10; i++){
            rPeaks[i] = 1;
        }
        analysisHrvClient.hrv(rPeaks);
        int a= 3/0;
    }

    /**
     * <h2>创建订单: 这里会涉及到分布式事务</h2>
     * 创建订单会涉及到多个步骤和校验, 当不满足情况时直接抛出异常;
     * 1. 校验请求对象是否合法
     * 2. 创建订单
     * 3. 扣减商品库存
     * 4. 扣减用户余额
     * 5. 发送订单物流消息 SpringCloud Stream + Kafka
     * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void analysis() {
        int ecgLen = 256 * 10;
        float[] ecg = new float[ecgLen];
        for(int i = 0; i < ecgLen; i++){
            ecg[i] = 1.322f;
        }
        a = a+1;
        System.out.println(a);
//        int dlResult = analysisDLClient.dl(ecg);
//        int[] rpeaks = analysisRpeaksClient.findRpeaks(ecg);
//        Map<String, Integer> hrvResult = analysisHrvClient.hrv(rpeaks);

//        log.info("dlResult: [{}]", dlResult);
//        log.info("hrvResult: [{}]", hrvResult);

//        analysisDao.save(new AnalysisResult(111L, "000001_0000001", dlResult,
//                hrvResult.get("aveHR"), hrvResult.get("alo"), hrvResult.get("LF")));
//         mysql 1400
        analysisDao.save(new AnalysisResult(111L, "000001_0000001", 1,
                1, 1, 1));



//        for (int q = 0; q < 1000; q++){
//            System.out.println(q);
//            batchInsert(q);
//        }




//        Optional<AnalysisResult> ar = analysisDao.findById(2756200L);
//
//        System.out.println(ar);
    }



//    void batchInsert(int q) {
//        List<AnalysisResult> list = new LinkedList<AnalysisResult>();
//        int loopNum = 10000;
//        for (int j = 0; j < loopNum; j++){
//            String userID = String.format("%04d", q);
//            String rID = String.format("%07d", j);
//            String reportID = userID + '_' + rID;
//
//
//            java.util.Date utilDate=new java.util.Date();
//            Date d=new Date (utilDate.getTime());
//            list.add(new AnalysisResult(1L,111L, reportID, 1, 1, 1, 1, d));
//        }
////            System.out.println(i);
////            analysisDao.save(list);
//
//
////        int BATCH_SIZE = 10000;
////        Iterator iterator = list.listIterator();
////        int index = 0;
////        while (iterator.hasNext()){
////            em.persist(iterator.next());
////            index++;
////            if (index % BATCH_SIZE == 0){
////                em.flush();
////                em.clear();
////            }
////        }
////        if (index % BATCH_SIZE != 0){
////            em.flush();
////            em.clear();
////        }
//
//        String sql = "Insert into t_proton_report_1000w VALUES(?,?,?,?,?,?,?,?)";
//        jdbcTemplate.batchUpdate(sql,new BatchPreparedStatementSetter() {
//            @Override
//            public void setValues(PreparedStatement ps, int i) throws SQLException {
//                ps.setLong(1,list.get(i).getId());
//                ps.setLong(2,list.get(i).getUserId());
//                ps.setString(3,list.get(i).getReprotId());
//                ps.setInt(4,list.get(i).getModelResult());
//                ps.setInt(5,list.get(i).getAveHr());
//                ps.setInt(6,list.get(i).getAlo());
//                ps.setInt(7,list.get(i).getLf());
//                ps.setDate(8,list.get(i).getCreateTime());
//            }
//            @Override
//            public int getBatchSize() {
//                return list.size();
//            }
//        });
//    }


}
