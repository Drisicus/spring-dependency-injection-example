package es.springframework.springdependencyinjectionexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingsService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "German Service";
    }
}
