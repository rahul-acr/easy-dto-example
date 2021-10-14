package com.example.dtotest.service;

import com.example.dtotest.entity.Student;
import com.example.dtotest.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional(readOnly = true)
    public Student fetchStudent(Long id){
        return studentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Transactional
    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    public List<Student> fetchAll() {
        return studentRepository.findAll();
    }
}
