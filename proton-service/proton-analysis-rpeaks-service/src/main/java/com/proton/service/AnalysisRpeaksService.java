package com.proton.service;

public interface AnalysisRpeaksService {
    /**
     * <h2>插入深度学习结果</h2>
     * */
    int[] findRpeaks(float[] ecg);
}
