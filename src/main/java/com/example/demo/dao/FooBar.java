package com.example.demo.dao;

import java.io.Serializable;
import java.util.Date;

public class FooBar implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foo_bar.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foo_bar.FOO
     *
     * @mbg.generated
     */
    private String foo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foo_bar.BAR
     *
     * @mbg.generated
     */
    private String bar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foo_bar.CREATED_DATE
     *
     * @mbg.generated
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foo_bar.CREATED_BY
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foo_bar.LAST_UPDATED_DATE
     *
     * @mbg.generated
     */
    private Date lastUpdatedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foo_bar.LAST_UPDATED_BY
     *
     * @mbg.generated
     */
    private String lastUpdatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foo_bar.FLAG
     *
     * @mbg.generated
     */
    private Short flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foo_bar
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foo_bar.ID
     *
     * @return the value of foo_bar.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foo_bar.ID
     *
     * @param id the value for foo_bar.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foo_bar.FOO
     *
     * @return the value of foo_bar.FOO
     *
     * @mbg.generated
     */
    public String getFoo() {
        return foo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foo_bar.FOO
     *
     * @param foo the value for foo_bar.FOO
     *
     * @mbg.generated
     */
    public void setFoo(String foo) {
        this.foo = foo == null ? null : foo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foo_bar.BAR
     *
     * @return the value of foo_bar.BAR
     *
     * @mbg.generated
     */
    public String getBar() {
        return bar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foo_bar.BAR
     *
     * @param bar the value for foo_bar.BAR
     *
     * @mbg.generated
     */
    public void setBar(String bar) {
        this.bar = bar == null ? null : bar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foo_bar.CREATED_DATE
     *
     * @return the value of foo_bar.CREATED_DATE
     *
     * @mbg.generated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foo_bar.CREATED_DATE
     *
     * @param createdDate the value for foo_bar.CREATED_DATE
     *
     * @mbg.generated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foo_bar.CREATED_BY
     *
     * @return the value of foo_bar.CREATED_BY
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foo_bar.CREATED_BY
     *
     * @param createdBy the value for foo_bar.CREATED_BY
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foo_bar.LAST_UPDATED_DATE
     *
     * @return the value of foo_bar.LAST_UPDATED_DATE
     *
     * @mbg.generated
     */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foo_bar.LAST_UPDATED_DATE
     *
     * @param lastUpdatedDate the value for foo_bar.LAST_UPDATED_DATE
     *
     * @mbg.generated
     */
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foo_bar.LAST_UPDATED_BY
     *
     * @return the value of foo_bar.LAST_UPDATED_BY
     *
     * @mbg.generated
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foo_bar.LAST_UPDATED_BY
     *
     * @param lastUpdatedBy the value for foo_bar.LAST_UPDATED_BY
     *
     * @mbg.generated
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy == null ? null : lastUpdatedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foo_bar.FLAG
     *
     * @return the value of foo_bar.FLAG
     *
     * @mbg.generated
     */
    public Short getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foo_bar.FLAG
     *
     * @param flag the value for foo_bar.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(Short flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foo_bar
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", foo=").append(foo);
        sb.append(", bar=").append(bar);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", lastUpdatedDate=").append(lastUpdatedDate);
        sb.append(", lastUpdatedBy=").append(lastUpdatedBy);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}