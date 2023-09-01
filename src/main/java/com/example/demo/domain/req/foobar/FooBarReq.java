package com.example.demo.domain.req.foobar;

import java.util.Date;

public class FooBarReq {
    private Long id;

    private String foo;

    private String bar;

    private Date createdDate;

    private String createdBy;

    private Date lastUpdatedDate;

    private String lastUpdatedBy;

    private Short flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "FooBarReq{" +
        		"id=" + id +
        		", foo='" + foo + '\'' +
        		", bar='" + bar + '\'' +
        		", createdDate=" + createdDate +
        		", createdBy='" + createdBy + '\'' +
        		", lastUpdatedDate=" + lastUpdatedDate +
        		", lastUpdatedBy='" + lastUpdatedBy + '\'' +
        		", flag=" + flag +
        '}';
    }
}