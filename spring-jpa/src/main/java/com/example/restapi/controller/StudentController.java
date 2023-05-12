package com.example.restapi.controller;


import com.example.restapi.model.Student;
import com.example.restapi.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "student redcord added ";

    }

    @GetMapping("/getall")
    public List<Student> getAllStudent(){
        return (List<Student>) studentRepo.findAll();

    }

    @GetMapping("/id/{id}")
    public Student getStudent(@PathVariable Integer id){
         return studentRepo.findById(id).orElseThrow();
    }

    @GetMapping("/name/{name}")
    public List<Student> getStudent(@PathVariable String name){
        return studentRepo.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        studentRepo.deleteById(id);
        return "student redcord of" + id + "is deteleted ";
    }

}
