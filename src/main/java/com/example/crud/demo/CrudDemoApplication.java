package com.example.crud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * Spring Boot implementation class - This class defines the Spring Boot
 * configuration.
 * 
 * @author Niharika Naik
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = ("com.example.crud.demo"))
public class CrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

}
