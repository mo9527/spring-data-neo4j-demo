package com.mo9.neo4j.domain;

import com.mo9.neo4j.relationtype.Mo9RelationType;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 14:58
 */
@NodeEntity
public class Company {
    @GraphId
    private Long id;
    @Index
    private String compaynName;
    private String companyAddress;
    private String companyPhone;
    private String industry;

    public Collection<User> getEmployes() {
        return employes;
    }

    public void hiring(User user) {
        this.employes.add(user);
    }

    @Relationship(type = Mo9RelationType.HIRING)
    public Set<User> employes = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompaynName() {
        return compaynName;
    }

    public void setCompaynName(String compaynName) {
        this.compaynName = compaynName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
