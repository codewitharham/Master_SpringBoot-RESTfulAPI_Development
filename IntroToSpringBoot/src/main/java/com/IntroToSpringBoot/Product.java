package com.IntroToSpringBoot;

import org.springframework.stereotype.Component;

@Component // This annotation indicates that this class is a Spring-managed component (bean).
// By annotating the class with @Component, we are telling Spring to create an instance of this class and manage its lifecycle.
// This allows us to use dependency injection to inject instances of this class into other classes that need it.
public class Product {
    private String name;
    private double price;

    // A default, no-argument constructor is needed for Spring to create the bean.
    public Product() {
        // leave this empty or initialize with default values
    }

    // Your existing constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}