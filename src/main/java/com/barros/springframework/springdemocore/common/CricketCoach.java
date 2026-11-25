package com.barros.springframework.springdemocore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component //Marks Class as a Spring Bean
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //Define the init method
    @PostConstruct
    public void initBean(){
        System.out.println("In initBean(): " + getClass().getSimpleName());
    }

    //Define the Destroy method
    @PreDestroy
    public void destroyBean(){
        System.out.println("In destroyBean(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 15 minutes!!";
    }
}
