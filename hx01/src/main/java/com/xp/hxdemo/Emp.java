package com.xp.hxdemo;

import java.math.BigDecimal;
import java.util.Date;

public class Emp {

    private String name;

    private BigDecimal salary;

    private String code;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Emp(String name, BigDecimal salary, String code, Date birthday) {
        this.name = name;
        this.salary = salary;
        this.code = code;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", code='" + code + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
