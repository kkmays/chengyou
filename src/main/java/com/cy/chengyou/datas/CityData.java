package com.cy.chengyou.datas;

import com.cy.chengyou.dtos.*;

public class CityData extends BaseDto {

    private String code;
    private String name;
    private String phonetic;
    private String firstPhonetic;
    private Double longitude;
    private Double latitude;
    private String provinceCode;
    private ProvinceData provinceData;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getFirstPhonetic() {
        return firstPhonetic;
    }

    public void setFirstPhonetic(String firstPhonetic) {
        this.firstPhonetic = firstPhonetic;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public ProvinceData getProvinceData() {
        return provinceData;
    }

    public void setProvinceData(ProvinceData provinceData) {
        this.provinceData = provinceData;
    }
}
