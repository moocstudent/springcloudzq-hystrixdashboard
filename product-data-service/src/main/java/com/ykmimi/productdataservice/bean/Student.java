package com.ykmimi.productdataservice.bean;

public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String motto;
    private String education;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String sex, String motto, String education) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.motto = motto;
        this.education = education;
    }
}
