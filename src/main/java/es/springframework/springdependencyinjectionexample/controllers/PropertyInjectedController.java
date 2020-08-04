package es.springframework.springdependencyinjectionexample.controllers;

import es.springframework.springdependencyinjectionexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // No necesita el Qualifier porque el nombre coincide con el nombre de la implementación
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
