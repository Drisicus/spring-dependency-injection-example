package es.springframework.springdependencyinjectionexample.controllers;

import es.springframework.springdependencyinjectionexample.services.GreetingService;
import org.springframework.stereotype.Controller;

// @Controllers makes this class a Spring bean. Spring will create the bean automatically.
@Controller
public class MyController {

    // Several implementations but PrimaryGreetingsService is marked as primary so it is selected
    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
