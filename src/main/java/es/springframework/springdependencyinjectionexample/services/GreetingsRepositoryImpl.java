package es.springframework.springdependencyinjectionexample.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingsRepositoryImpl implements GreetingsRepository {

    @Override
    public String getEnglishGreeting() {
        return "English hello";
    }

    @Override
    public String getSpanishGreeting() {
        return "Spanish hola";
    }

    @Override
    public String getGermanGreeting() {
        return "German hallo";
    }
}
