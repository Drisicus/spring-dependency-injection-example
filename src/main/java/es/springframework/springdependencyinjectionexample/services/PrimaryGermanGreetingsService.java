package es.springframework.springdependencyinjectionexample.services;

public class PrimaryGermanGreetingsService implements GreetingService{

    private GreetingsRepository greetingsRepository;

    public PrimaryGermanGreetingsService(GreetingsRepository greetingsRepository){
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingsRepository.getGermanGreeting();
    }
}
