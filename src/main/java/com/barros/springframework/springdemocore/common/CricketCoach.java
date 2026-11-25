package com.barros.springframework.springdemocore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component //Marks Class as a Spring Bean
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 15 minutes!!";
    }
}
