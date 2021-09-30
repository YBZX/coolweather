package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provincdCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvincdCode() {
        return provincdCode;
    }

    public void setProvincdCode(int provincdCode) {
        this.provincdCode = provincdCode;
    }
}
