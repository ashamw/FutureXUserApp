package com.futureX.services.FutureXUserApp;

import java.math.BigInteger;

import org.bouncycastle.jcajce.CompositePublicKey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(UserId.class)
@JsonIgnoreProperties({"hibernateLazyIntializer" , "handler"})
public class User {
    @Id
    private BigInteger userid;
    @Id
    private BigInteger courseid;
    private String username;
    public User(){

    }
    public BigInteger getUserid() {
        return userid;
    }
    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }
    public BigInteger getCourseid() {
        return courseid;
    }
    public void setCourseid(BigInteger courseid) {
        this.courseid = courseid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    

}
