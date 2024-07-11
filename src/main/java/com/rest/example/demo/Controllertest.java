package com.rest.example.demo;

import com.rest.example.demo.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controllertest {
    @GetMapping("/name")
    public String name(@RequestBody String name){
        System.out.println("Hello "+name);
        return "Hello "+name;

    }
    StudentJpaInterface studentJpaInterface;

    public Controllertest(StudentJpaInterface studentJpaInterface) {
        this.studentJpaInterface = studentJpaInterface;
    }

    @PostMapping("/students")
    public Student student(@RequestBody Student student){
        return studentJpaInterface.save(student);
    }

    @GetMapping("/students")
    public List<Student> students(){
        return studentJpaInterface.findAll();
    }
    
}
