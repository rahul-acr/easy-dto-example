package com.example.dtotest.controller;

import com.example.dtotest.entity.Student;
import com.example.dtotest.service.StudentService;
import org.easydto.proxy.Dto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Dto<Student>> fetchAll(){
        return studentService.fetchAll().stream().map(Dto::from).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Dto<Student> get(@PathVariable Long id) {
        return Dto.from(studentService.fetchStudent(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody Dto<Student> dto) {
        Student newStudent = new Student();
        dto.map(newStudent);
        studentService.saveStudent(newStudent);
    }

}
