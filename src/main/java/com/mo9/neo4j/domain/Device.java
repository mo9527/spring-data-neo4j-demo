package com.mo9.neo4j.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.DateString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Set;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:21 .
 */
@NodeEntity(label = "userDevice")
public class Device {
    @GraphId
    private Long id;
    @Index
    private String mo9DeviceId;
    private String width;
    private String height;
    private String osVersion;
    private String osType;
    private String brantType;

    @DateString
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creatTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMo9DeviceId() {
        return mo9DeviceId;
    }

    public void setMo9DeviceId(String mo9DeviceId) {
        this.mo9DeviceId = mo9DeviceId;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getBrantType() {
        return brantType;
    }

    public void setBrantType(String brantType) {
        this.brantType = brantType;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
