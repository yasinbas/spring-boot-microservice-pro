package com.example.sha.springbootsellertestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootSellerTestappApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootSellerTestappApplication.class, args);
    }

}
