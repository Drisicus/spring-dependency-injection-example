package es.springframework.springdependencyinjectionexample.services;

public class PrimarySpanishGreetingsService implements GreetingService{

    GreetingsRepository greetingsRepository;

    public PrimarySpanishGreetingsService(GreetingsRepository greetingsRepository){
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingsRepository.getSpanishGreeting();
    }
}
