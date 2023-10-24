package com.demo.Classassignments;

class Student
{
    protected int studId;
    protected String name;
    protected int deptId;
    protected String gender;
    protected String phoneNo;

    public Student(int studId, String name, int deptId, String gender, String phoneNo)
    {
        this.studId = studId;
        this.name = name;
        this.deptId = deptId;
        this.gender = gender;
        this.phoneNo = phoneNo;
    }

  
    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
} 