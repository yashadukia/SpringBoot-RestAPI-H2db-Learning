package com.example.spring_data_rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customers {
    @Id
    @GeneratedValue
    private int cid;
    private String cname;
    private String cemail;

    public int getCid() {
        return this.cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCemail() {
        return this.cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    @Override
    public String toString() {
        return "{" +
            " cid='" + getCid() + "'" +
            ", cname='" + getCname() + "'" +
            ", cemail='" + getCemail() + "'" +
            "}";
    }

}