package com.proton.service;

import com.proton.entity.AnalysisResult;
import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;
import org.springframework.stereotype.Service;

/**
 * @author: peijiepang
 * @date 2019-11-11
 * @Description:
 */
@Service
public interface TccActionOneService {
    String buy();

}
