package com.mo9.neo4j.domain.relation;

import com.mo9.neo4j.domain.Company;
import com.mo9.neo4j.domain.User;
import com.mo9.neo4j.relationtype.Mo9RelationType;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.typeconversion.DateString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:00
 */
@RelationshipEntity(type = Mo9RelationType.WORK_FOR)
public class User2CompanyRelationShip {
    @GraphId
    private Long id;

    @StartNode
    private User user;

    @EndNode
    private Company company;

    private Double workYears;

    @DateString
    private Date startWorkDate;


    public User2CompanyRelationShip(){}

    public User2CompanyRelationShip(User user, Company company){
        this.user = user;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Company getCompany() {
        return company;
    }


    public Double getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Double workYears) {
        this.workYears = workYears;
    }

    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }
}
