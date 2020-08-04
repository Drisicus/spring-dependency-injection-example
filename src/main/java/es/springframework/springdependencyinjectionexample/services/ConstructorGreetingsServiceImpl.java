package es.springframework.springdependencyinjectionexample.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsServiceImpl implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello - im Constructor Greetings Service";
    }
}
