package es.springframework.springdependencyinjectionexample.services;

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
