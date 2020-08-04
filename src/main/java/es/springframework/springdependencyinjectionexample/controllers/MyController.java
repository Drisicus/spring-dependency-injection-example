package es.springframework.springdependencyinjectionexample.controllers;

import org.springframework.stereotype.Controller;

// @Controllers makes this class a Spring bean. Spring will create the bean automatically.
@Controller
public class MyController {
    public String hello(){
        String text = "Hello World";
        System.out.println(text);
        return text;
    }
}
