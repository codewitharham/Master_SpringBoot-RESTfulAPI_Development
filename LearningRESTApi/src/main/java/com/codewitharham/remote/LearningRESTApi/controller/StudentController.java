package com.codewitharham.remote.LearningRESTApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewitharham.remote.LearningRESTApi.DataTransferObjects.StudentDto;
import com.codewitharham.remote.LearningRESTApi.services.StudentService;

@RestController
public class StudentController {

    private final StudentService studentService;

    // Constructor Injection (best practice)
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @GetMapping("/students")
    public List<StudentDto> getStudents() {
        return studentService.getAllStudents();

    }

    @GetMapping("/students/{id}")    
    // path variable annotation to bind the method parameter to the value in the URI
    // e.g., /students/1 -> id = 1
    // if the path variable name and method parameter name are the same, you can omit the name in the annotation
    // e.g., @PathVariable Long id
    // if they are different, you need to specify the name in the annotation
    // e.g., @PathVariable("studentId") Long id
    public StudentDto getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    
    @GetMapping("/")
    public String home() {
        return "Welcome to the Student Management API!";
    }


    @PostMapping("/students")
    public String addStudent() {
        return "Create Student Endpoint - To be implemented";
    }
    


}
