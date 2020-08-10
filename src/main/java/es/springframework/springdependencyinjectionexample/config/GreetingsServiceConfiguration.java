package es.springframework.springdependencyinjectionexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import es.springframework.springdependencyinjectionexample.services.GreetingService;
import es.springframework.springdependencyinjectionexample.services.GreetingsRepository;
import es.springframework.springdependencyinjectionexample.services.GreetingsServiceFactory;

@Configuration
public class GreetingsServiceConfiguration {

    @Bean
    GreetingsServiceFactory greetingsServiceFactory(GreetingsRepository greetingsRepository){
        return new GreetingsServiceFactory(greetingsRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingsServiceFactory greetingsServiceFactory){
        return greetingsServiceFactory.createGreetingsService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingsServiceFactory greetingsServiceFactory){
        return greetingsServiceFactory.createGreetingsService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingsServiceFactory greetingsServiceFactory){
        return greetingsServiceFactory.createGreetingsService("de");
    }
}
