package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jack = new Student(1L,
                "Jack",
                "jack@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student jackson = new Student(1L,
                    "Jackson",
                    "jackson@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            repository.saveAll(List.of(jack, jackson)
            );
        };
    }
}


