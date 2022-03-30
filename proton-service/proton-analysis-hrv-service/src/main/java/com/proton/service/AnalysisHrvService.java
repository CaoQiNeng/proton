package com.proton.service;

import java.util.Map;

public interface AnalysisHrvService {
    /**
     * <h2>插入深度学习结果</h2>
     * */
    Map<String, Integer> hrv(int[] rpeaks);
}
