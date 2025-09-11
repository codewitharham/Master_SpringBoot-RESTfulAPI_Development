package com.codewitharham.remote.LearningRESTApi.services.Implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codewitharham.remote.LearningRESTApi.repository.StudentRepository;
import com.codewitharham.remote.LearningRESTApi.services.StudentService;
import com.codewitharham.remote.LearningRESTApi.DataTransferObjects.StudentDto;
import com.codewitharham.remote.LearningRESTApi.entity.StudentEntity;

@Service // Marks this class as a service component in Spring
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepo;

    // Constructor injection (best practice)
    public StudentServiceImpl(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        // 1. Fetch entities from DB
        List<StudentEntity> studentEntities = studentRepo.findAll();

        // 2. Convert Entity -> DTO using Stream API
        List<StudentDto> studentDtos = studentEntities
                .stream() // Turn List into Stream
                .map(entity -> new StudentDto(entity.getId(), entity.getName(), entity.getEmail())) // Transform
                .toList(); // Collect into List

        // 3. Return DTOs
        return studentDtos;
    }
}
