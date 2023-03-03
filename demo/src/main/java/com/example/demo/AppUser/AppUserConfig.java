package com.example.demo.AppUser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

@Configuration
public class AppUserConfig {

    @Bean
    CommandLineRunner CommandLineRunner(AppUserRepository myUserRepository) {
        return args -> {
            AppUser daniel = new AppUser(
                    "Daniel",
                    LocalDate.of(1999, Month.SEPTEMBER, 8),
                    "chuzhencheng1999@gmail.com",
                    "passwordDaniel");
            AppUser jack = new AppUser(
                    "jack",
                    LocalDate.of(2007, Month.APRIL, 6),
                    "zhenxichu@gmail.com",
                    "passwordDaniel");
            myUserRepository.saveAll(
                    List.of(daniel, jack));
        };
    }
}
