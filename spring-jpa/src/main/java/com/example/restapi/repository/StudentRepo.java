package com.example.restapi.repository;

import com.example.restapi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

    List<Student> findByName(String name);

}
