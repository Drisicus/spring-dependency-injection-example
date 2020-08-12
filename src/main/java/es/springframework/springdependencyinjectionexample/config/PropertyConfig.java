package es.springframework.springdependencyinjectionexample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.springframework.springdependencyinjectionexample.exampleBeans.FakeDataSource;

@Configuration
public class PropertyConfig {

    @Value("${data.user}")
    String user;

    @Value("${data.password}")
    String password;

    @Value("${data.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

}
