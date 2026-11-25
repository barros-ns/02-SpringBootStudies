package com.barros.springframework.springdemocore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"com.barros.springframework"}
)
public class SpringDemoCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoCoreApplication.class, args);
    }

}
