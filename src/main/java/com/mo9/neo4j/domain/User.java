package com.mo9.neo4j.domain;

import com.mo9.neo4j.relationtype.Mo9RelationType;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 14:10
 */
@NodeEntity
public class User {
    @GraphId
    private Long userId;
    @Index
    private String name;
    @Index
    private String mobile;
    private String ip;
    private String deviceNo;
    private Integer score;
    private boolean ifGood;
    private String contacts;
    private String callInfo;
    private String companyAddress;
    private String companyName;

    @Relationship(type = Mo9RelationType.WORK_FOR)
    Set<Company> worksFor = new HashSet<>();

    public void worksFor(Company company) {
        this.worksFor.add(company);
    }

    @Relationship(type = Mo9RelationType.OWNED_DEVICE)
    private Set<Device> ownDevices = new HashSet<>();

    public void hadDevice(Device device){
        ownDevices.add(device);
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public boolean isIfGood() {
        return ifGood;
    }

    public void setIfGood(boolean ifGood) {
        this.ifGood = ifGood;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getCallInfo() {
        return callInfo;
    }

    public void setCallInfo(String callInfo) {
        this.callInfo = callInfo;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<Company> getWorksFor() {
        return worksFor;
    }

    public void setWorksFor(Set<Company> worksFor) {
        this.worksFor = worksFor;
    }
}
