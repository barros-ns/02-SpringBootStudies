package com.barros.springframework.springdemocore.config;

import com.barros.springframework.springdemocore.common.Coach;
import com.barros.springframework.springdemocore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
