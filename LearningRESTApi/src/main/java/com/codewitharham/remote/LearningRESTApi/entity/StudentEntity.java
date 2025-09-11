package com.codewitharham.remote.LearningRESTApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



    // What is ENTITY?
    // An entity in the context of Java Persistence API (JPA) is a lightweight,
    // persistent domain object that represents a table in a relational database.
    // Each instance of an entity corresponds to a row in the table, and each field in
    // the entity corresponds to a column in the table.
    // Entities are typically annotated with the @Entity annotation, which marks the
    // class as a JPA entity. The @Id annotation is used to specify the primary key
    // field of the entity, and the @GeneratedValue annotation is used to specify how
    // the primary key value is generated.
    // Entities can also have relationships with other entities, such as one-to-many
    // or many-to-many relationships, which can be defined using annotations such as/
    // @OneToMany and @ManyToMany.


@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // Constructors
    public StudentEntity() {}

    public StudentEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

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
