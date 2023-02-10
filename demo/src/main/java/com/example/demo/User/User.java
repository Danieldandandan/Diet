package com.example.demo.User;

import java.time.LocalDate;

public class User {
    private Long id;
    private String name;
    private LocalDate dob;
    private String email; 
    private Integer age;
    public User() {

    }

    public User(    Long id,
                    String name,
                    LocalDate dob,
                    String email,
                    Integer age) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.age = age; 
    }
    public User(    String name,
                    LocalDate dob,
                    String email,
                    Integer age) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.age = age; 
    }
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }
    
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "User{ " +
                ", id = " + id +
                ", name = " + name +
                ", emial = " + email +
                ", dob = " + dob +
                ", age = " + age + 
                " }";
    }
}
