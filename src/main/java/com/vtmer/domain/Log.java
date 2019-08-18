package com.vtmer.domain;

import java.util.Date;

public class Log {
    private Integer id;

    private Integer admiId;

    private Integer userId;

    private Date opreationalTime;

    private String operationalRecord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdmiId() {
        return admiId;
    }

    public void setAdmiId(Integer admiId) {
        this.admiId = admiId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOpreationalTime() {
        return opreationalTime;
    }

    public void setOpreationalTime(Date opreationalTime) {
        this.opreationalTime = opreationalTime;
    }

    public String getOperationalRecord() {
        return operationalRecord;
    }

    public void setOperationalRecord(String operationalRecord) {
        this.operationalRecord = operationalRecord;
    }
}