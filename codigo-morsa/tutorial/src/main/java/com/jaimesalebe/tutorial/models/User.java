package com.jaimesalebe.tutorial.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    public String name;
    @JsonIgnore
    public int age;

    @JsonProperty("real_address")
    public String address;

    @JsonGetter("information")
    public String toString() {
        return "Su nombre es " + name + " y su edad es " + age;
    }

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
