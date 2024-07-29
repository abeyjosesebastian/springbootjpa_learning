package com.rest.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer lecture_id;
    private String name;
    @OneToOne
    @JoinColumn(name="resource_id")
    private Resources resources;


}
