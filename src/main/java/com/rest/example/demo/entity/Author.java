package com.rest.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id")
    private Integer author_id;
    @Column(name="firstname")
    private String first_name;
    @Column(name="lastname")
    private String last_name;
    @Column(name="email")
    private String email;
    @Column(name="age")
    private Integer age;

    @ManyToMany(mappedBy="authorList")
   List<Course> courseList;

    public Author() {
    }

    public Integer getId() {
        return author_id;
    }

    public void setId(Integer id) {
        this.author_id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
