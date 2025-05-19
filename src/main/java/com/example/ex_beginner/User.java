package com.example.ex_beginner;

public class User {
    private String name;
    private Integer age;
    private String comment;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getComment() {
        return comment;
    }
}
