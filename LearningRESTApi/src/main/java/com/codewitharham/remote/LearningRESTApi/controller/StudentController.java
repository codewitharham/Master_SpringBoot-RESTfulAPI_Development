package com.codewitharham.remote.LearningRESTApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewitharham.remote.LearningRESTApi.DataTransferObjects.StudentDto;

@RestController
public class StudentController {
    
    @GetMapping("/students")
    public StudentDto getStudents() {
        return new StudentDto(123L, "Arham", "codewitharham.remote@gmail.com");

    }


}
