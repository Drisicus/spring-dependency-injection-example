package es.springframework.springdependencyinjectionexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service // Spring makes it a bean
@Primary // If several beans, this is default
@Profile("en")
public class PrimaryGreetingsService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Primary Greetings Service --> Hello!";
    }
}
