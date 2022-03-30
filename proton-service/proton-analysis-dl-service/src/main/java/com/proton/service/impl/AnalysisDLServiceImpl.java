package com.proton.service.impl;

import com.proton.dao.AnalysisDLDao;
import com.proton.entity.AnalysisDLResult;
import com.proton.service.AnalysisDLService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class AnalysisDLServiceImpl implements AnalysisDLService {

    private final AnalysisDLDao analysisDLDao;

    public AnalysisDLServiceImpl(AnalysisDLDao analysisDLDao) {
        this.analysisDLDao = analysisDLDao;
    }

    @Override
    public int dl(float[] ecg) {
        int number = (int)(Math.random()*100000);
        analysisDLDao.save(new AnalysisDLResult((long) number, 1));
        return 0;
    }
}
