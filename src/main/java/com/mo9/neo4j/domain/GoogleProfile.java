package com.mo9.neo4j.domain;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * @Author wtwei
 * @Date 2017/3/1
 * @Time 14:13
 */
@NodeEntity(label = "googleProfile")
public class GoogleProfile {
    @GraphId
    private Long id;


    private String name;
    private String address;
    private String sex;
    private String dob;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if (id == null){
            return false;
        }
        if (!(other instanceof GoogleProfile)){
            return false;
        }

        return id.equals(((GoogleProfile) other).id);
    }

    public int hashCode(){
        return id == null ? System.identityHashCode(this) : id.hashCode();
    }
}
