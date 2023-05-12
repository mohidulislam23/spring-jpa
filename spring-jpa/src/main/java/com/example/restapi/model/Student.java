package com.example.restapi.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="student")
public class Student {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "student_id")
    private Integer id;

    @Column(name= "student_name")
    private String name;

    public Student() {

    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
