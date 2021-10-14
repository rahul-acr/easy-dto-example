package org.easydto.dtotest.service;

import org.easydto.dtotest.entity.Student;

import java.util.List;

public interface StudentService {

    Student fetchStudent(Long id);

    void saveStudent(Student student);

    List<Student> fetchAll() ;

}
