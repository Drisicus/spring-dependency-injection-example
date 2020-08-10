package es.springframework.springdependencyinjectionexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryGreetingsService implements GreetingService {

    GreetingsRepository greetingsRepository;

    public PrimaryGreetingsService(GreetingsRepository greetingsRepository){
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingsRepository.getEnglishGreeting();
    }
}
