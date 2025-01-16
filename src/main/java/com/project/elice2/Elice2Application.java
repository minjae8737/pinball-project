package com.project.elice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Elice2Application {

    public static void main(String[] args) {

        SpringApplication.run(Elice2Application.class, args);
    }

}