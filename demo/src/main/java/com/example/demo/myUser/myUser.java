package com.example.demo.myUser;

import java.time.LocalDate;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table
public class myUser {
    @Id
    @SequenceGenerator (
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private String name;
    private LocalDate dob;
    private String email; 
    private Integer age;
    public myUser() {

    }

    public myUser(    Long id,
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
    public myUser(    String name,
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
        return "myUser{ " +
                ", id = " + id +
                ", name = " + name +
                ", emial = " + email +
                ", dob = " + dob +
                ", age = " + age + 
                " }";
    }
}
