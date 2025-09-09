package com.codewitharham.remote.LearningRESTApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


public class StudentEntity {
    
    @Entity
    public class Student {
        
        
        @Id // Primary Key - "id" field"
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment - "GenerationType.IDENTITY" only for MySQL and PostgreSQL        
        
        private Long id;
        private String name;
        private String email;

        // Getters and Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }   
    }

}
