package com.barros.springframework.springdemocore.rest;

import com.barros.springframework.springdemocore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define a private field for the dependency

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach){ //change the qualifier name to the class you want to inject as the given example
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = coach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return "<h1>" + myCoach.getDailyWorkout() + "</h1>";
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: "
                + myCoach.getClass().getSimpleName() + " == " + anotherCoach.getClass().getSimpleName() +
                ": " + (myCoach == anotherCoach);
    }
}
