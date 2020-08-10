package es.springframework.springdependencyinjectionexample.services;

public class GreetingsServiceFactory {

    private GreetingsRepository greetingsRepository;

    public GreetingsServiceFactory(GreetingsRepository greetingsRepository){
        this.greetingsRepository = greetingsRepository;
    }

    public GreetingService createGreetingsService(String language){
        switch (language){
            case "en":
                return new PrimaryGreetingsService(greetingsRepository);
            case "de":
                return new PrimaryGermanGreetingsService(greetingsRepository);
            case "es":
                return new PrimarySpanishGreetingsService(greetingsRepository);
            default:
                return new PrimaryGreetingsService(greetingsRepository);
        }
    }

}
