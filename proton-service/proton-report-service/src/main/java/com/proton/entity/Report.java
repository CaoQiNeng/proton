package com.proton.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Report {
    private String id;
    private Integer modelResult;
    private Integer ave_hr;
    private Integer alo;
    private Integer LF;
    private Integer state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getModel_result() {
        return modelResult;
    }

    public void setModel_result(Integer modelResult) {
        this.modelResult = modelResult;
    }

    public Integer getAve_hr() {
        return ave_hr;
    }

    public void setAve_hr(Integer ave_hr) {
        this.ave_hr = ave_hr;
    }

    public Integer getAlo() {
        return alo;
    }

    public void setAlo(Integer alo) {
        this.alo = alo;
    }

    public Integer getLF() {
        return LF;
    }

    public void setLF(Integer LF) {
        this.LF = LF;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
