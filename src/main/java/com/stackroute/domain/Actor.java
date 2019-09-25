package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    @Value("Haripriya")
    public void setName(String name) {
        this.name = name;
    }
    @Value("Female")
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Value("21")
    public void setAge(int age) {
        this.age = age;
    }
}
