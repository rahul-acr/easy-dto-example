package com.example.dtotest.service;

import com.example.dtotest.entity.Student;

import java.util.List;

public interface StudentService {

    Student fetchStudent(Long id);

    void saveStudent(Student student);

    List<Student> fetchAll() ;

}
