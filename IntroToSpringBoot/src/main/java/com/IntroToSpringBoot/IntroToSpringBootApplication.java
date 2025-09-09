package com.IntroToSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

/**
 * The main class for the Spring Boot application.
 * This class serves as the entry point and demonstrates dependency injection
 * and the use of the CommandLineRunner interface.
 */
@SpringBootApplication
public class IntroToSpringBootApplication implements CommandLineRunner {

    // A bean is an object that is managed by the Spring IoC container.
    private final Product product;

    /**
     * Constructor-based Dependency Injection.
     * Spring automatically injects the 'Product' bean into this constructor.
     * This is a best practice for required dependencies as it promotes immutability.
     * @param product The Product bean to be injected.
     */
    public IntroToSpringBootApplication(Product product) {
        this.product = product;
    }

    public static void main(String[] args) {
        // Runs the Spring Boot application.
        SpringApplication.run(IntroToSpringBootApplication.class, args);
    }

    /**
     * The 'run' method is executed after the application has started.
     * It is part of the CommandLineRunner interface.
     * @param args Command-line arguments passed to the application.
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, Spring Boot!");


        // Use the Product bean that was injected via the constructor.
        product.setName("Sample Product");
		product.setPrice(19.99);
		System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: $" + product.getPrice());
    }
}
