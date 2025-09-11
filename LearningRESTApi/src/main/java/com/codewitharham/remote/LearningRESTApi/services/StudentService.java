package com.codewitharham.remote.LearningRESTApi.services;

import java.util.List;

import com.codewitharham.remote.LearningRESTApi.DataTransferObjects.StudentDto;

public interface StudentService {
    // Service layer interface for Student operation
    // Define methods for student-related operations here
    // e.g., createStudent, getStudentById, getAllStudents, updateStudent, deleteStudent
    // Implementation will be done in a class that implements this interface

    List<StudentDto> getAllStudents();
}
