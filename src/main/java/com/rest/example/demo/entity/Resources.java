package com.rest.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
//@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Inheritance
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer resources_id;
    private String  name;
    private String size;
    private String url;
    @OneToOne(mappedBy = "resources")
    private Lecture lecture;
}
