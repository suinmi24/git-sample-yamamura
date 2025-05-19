package com.example.ex_beginner;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserForm {

    @NotBlank(message = "名前は必須です")
    private String name;

    @NotNull(message = "年齢は必須です")
    private Integer age;

    @NotBlank(message = "メッセージは必須です")
    private String comment;


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
