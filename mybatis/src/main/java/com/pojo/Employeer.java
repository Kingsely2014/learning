package com.pojo;

public class Employeer {
    private Integer employeerId;

    private String employeerName;

    private Integer employeerAge;

    private String employeerDepartment;

    private String employeerWorktype;

    public Integer getEmployeerId() {
        return employeerId;
    }

    public void setEmployeerId(Integer employeerId) {
        this.employeerId = employeerId;
    }

    public String getEmployeerName() {
        return employeerName;
    }

    public void setEmployeerName(String employeerName) {
        this.employeerName = employeerName == null ? null : employeerName.trim();
    }

    public Integer getEmployeerAge() {
        return employeerAge;
    }

    public void setEmployeerAge(Integer employeerAge) {
        this.employeerAge = employeerAge;
    }

    public String getEmployeerDepartment() {
        return employeerDepartment;
    }

    public void setEmployeerDepartment(String employeerDepartment) {
        this.employeerDepartment = employeerDepartment == null ? null : employeerDepartment.trim();
    }

    public String getEmployeerWorktype() {
        return employeerWorktype;
    }

    public void setEmployeerWorktype(String employeerWorktype) {
        this.employeerWorktype = employeerWorktype == null ? null : employeerWorktype.trim();
    }
}