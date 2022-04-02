package com.proton.service.impl;

import com.proton.dao.AnalysisHrvDao;
import com.proton.entity.AnalysisResult;
import com.proton.service.AnalysisHrvService;
//import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class AnalysisHrvServiceImpl implements AnalysisHrvService {

    private final AnalysisHrvDao AnalysisHrvDao;

    public AnalysisHrvServiceImpl(AnalysisHrvDao analysisHrvDao) {
        AnalysisHrvDao = analysisHrvDao;
    }
//    @Override
//    public Map<String, Integer> hrv(int[] rpeaks) {
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        map.put("aveHR", 60);
//        map.put("alo", 30);
//        map.put("LF", 7);
//        return map;
//    }

    @Override
    public Map<String, Integer> hrv(int[] rpeaks) {
        int number = (int)(Math.random()*100000);
        AnalysisHrvDao.save(new AnalysisResult((long) number,1));

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("aveHR", 60);
        map.put("alo", 30);
        map.put("LF", 7);
        return map;
    }
}
