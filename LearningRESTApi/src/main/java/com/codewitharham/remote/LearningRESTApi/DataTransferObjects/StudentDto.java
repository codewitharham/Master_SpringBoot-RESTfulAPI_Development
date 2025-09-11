package com.codewitharham.remote.LearningRESTApi.DataTransferObjects;

// What is DTO?
// DTO stands for Data Transfer Object. It is a design pattern used to transfer data between different layers or components of an application.
// DTOs are simple objects that encapsulate data and do not contain any business logic.
// They are often used to transfer data over the network, such as in RESTful APIs, or between different parts of an application, such as between the service layer and the presentation layer.
// The main purpose of using DTOs is to reduce the number of method calls and to improve performance by bundling multiple data elements into a single object.
// DTOs can also help to decouple different layers of an application, making it easier to maintain and evolve the codebase.
// In summary, DTOs are used to transfer data efficiently and effectively between different parts of an application or across network boundaries.



public class StudentDto {
    private Long id;
    private String name;
    private String email;

    public StudentDto() {
    }

    public StudentDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

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
