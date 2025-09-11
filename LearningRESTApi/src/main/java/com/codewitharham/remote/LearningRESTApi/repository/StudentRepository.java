package com.codewitharham.remote.LearningRESTApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewitharham.remote.LearningRESTApi.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    // JpaRepository provides:
    // - findAll()
    // - findById(Long id)
    // - save(StudentEntity entity)
    // - deleteById(Long id)
}
