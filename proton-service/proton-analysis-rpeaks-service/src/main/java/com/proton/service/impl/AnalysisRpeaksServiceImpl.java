package com.proton.service.impl;

import com.proton.service.AnalysisRpeaksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AnalysisRpeaksServiceImpl implements AnalysisRpeaksService {
    @Override
    public int[] findRpeaks(float[] ecg) {
        int[] rpeaks = new int[10];
        for(int i = 0; i < 10; i++){
            rpeaks[i] = i * 256;
        }
        return rpeaks;
    }
}
