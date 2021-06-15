package com.example.jokesapp;

import com.example.jokesapp.Methods.DatabaseMethods;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication
public class JokesappApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(JokesappApplication.class, args);
    }

}


