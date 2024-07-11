package com.rest.example.demo;

import com.rest.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaInterface extends JpaRepository<Student,Integer> {
}
