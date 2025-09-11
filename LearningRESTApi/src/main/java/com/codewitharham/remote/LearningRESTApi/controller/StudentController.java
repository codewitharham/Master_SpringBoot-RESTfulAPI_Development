package com.codewitharham.remote.LearningRESTApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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


}
