package com.spring.salaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.spring.Entity")
@EnableJpaRepositories(basePackages = "com.spring.Repository")
@ComponentScan(basePackages = "com.spring")
public class SalaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalaServiceApplication.class, args);
    }

}
