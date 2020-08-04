package es.springframework.springdependencyinjectionexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service // Spring makes it a bean
@Primary // If several beans, this is default
public class PrimaryGreetingsService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Primary Greetings Service --> Hello!";
    }
}
