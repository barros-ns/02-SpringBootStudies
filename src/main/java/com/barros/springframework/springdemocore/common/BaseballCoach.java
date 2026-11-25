package com.barros.springframework.springdemocore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice swing for 30min ";
    }
}
