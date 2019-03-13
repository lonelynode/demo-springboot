package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        SpringApplication app = new SpringApplication(MySpringConfiguration.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
    }
}
