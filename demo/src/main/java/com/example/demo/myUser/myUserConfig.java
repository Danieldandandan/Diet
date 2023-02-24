package com.example.demo.myUser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
@Configuration
public class myUserConfig {

    @Bean
    CommandLineRunner CommandLineRunner(myUserRepository myUserRepository) {
        return args -> {
            myUser daniel = new myUser(
                    "Daniel",
                    LocalDate.of(1999,Month.SEPTEMBER,8),
                    "chuzhencheng1999@gmail.com",
                    23
            );
            myUser jack = new myUser(
                    "jack",
                    LocalDate.of(2007,Month.APRIL,6),
                    "zhenxichu@gmail.com",
                    23
            );
            myUserRepository.saveAll(
                List.of(daniel,jack)
            );
        };
    }
}
