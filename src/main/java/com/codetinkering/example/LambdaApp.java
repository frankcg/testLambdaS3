package com.codetinkering.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;

@SpringBootApplication
public class LambdaApp {

    public static void main(String[] args) {
        FunctionalSpringApplication.run(LambdaApp.class, args);
    }
}
