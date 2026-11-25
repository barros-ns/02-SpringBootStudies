package com.barros.springframework.util;

import org.springframework.stereotype.Component;

@Component //Marks Class as an Spring Bean
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 15 minutes!!";
    }
}
