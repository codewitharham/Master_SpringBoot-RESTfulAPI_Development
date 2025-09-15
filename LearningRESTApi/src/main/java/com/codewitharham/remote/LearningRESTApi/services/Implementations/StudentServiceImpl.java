package com.codewitharham.remote.LearningRESTApi.services.Implementations;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.codewitharham.remote.LearningRESTApi.repository.StudentRepository;
import com.codewitharham.remote.LearningRESTApi.services.StudentService;
import com.codewitharham.remote.LearningRESTApi.DataTransferObjects.StudentDto;
import com.codewitharham.remote.LearningRESTApi.entity.StudentEntity;

@Service // Marks this class as a service component in Spring
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepo;

    private final ModelMapper modelMapper;

    // Constructor injection (best practice)

    public StudentServiceImpl(StudentRepository studentRepo, ModelMapper modelMapper) {
        this.studentRepo = studentRepo;
        this.modelMapper = modelMapper;
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


    @Override
    public StudentDto getStudentById(Long id) {
        // 1. Fetch entity from DB
        StudentEntity studentEntity = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        // System.out.println("Fetched Student Entity: " + studentEntity);

        // 2. Convert Entity -> DTO
        StudentDto studentDto = modelMapper.map(studentEntity, StudentDto.class);

        System.out.println("Fetched Student: " + id);

        // 3. Return DTO
        return studentDto;
    }
}
