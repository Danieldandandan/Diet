package com.example.demo.AppUser;

import java.time.*;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table
public class AppUser {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;
    private String name;
    private LocalDate dob;
    private String email;
    private String password;
    @Transient
    private Integer age;

    public AppUser() {

    }

    public AppUser(String email,
            String password) {
        this.password = password;
        this.email = email;

    }

    public AppUser(Long id,
            String name,
            LocalDate dob,
            String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public AppUser(String name,
            LocalDate dob,
            String email,
            String password) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    public boolean comparePassword(String s) {
        return s.equals(this.password); // Need change for safty reason
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "myUser{ " +
                ", id = " + id +
                ", name = " + name +
                ", emial = " + email +
                ", dob = " + dob +
                ", age = " + age +
                ", password" + password +
                " }";
    }
}
