package es.springframework.springdependencyinjectionexample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import es.springframework.springdependencyinjectionexample.exampleBeans.FakeBroker;
import es.springframework.springdependencyinjectionexample.exampleBeans.FakeDataSource;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:broker.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:broker.properties")
})
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${data.user}")
    String user;

    @Value("${data.password}")
    String password;

    @Value("${data.url}")
    String url;

    @Value("${broker.user}")
    String brokerUser;

    @Value("${broker.password}")
    String brokerPassword;

    @Value("${broker.url}")
    String brokerUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(environment.getProperty("DATA_PASSWORD"));
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeBroker fakeBroker(){
        FakeBroker fakeBroker = new FakeBroker();
        fakeBroker.setUser(brokerUser);
        fakeBroker.setPassword(brokerPassword);
        fakeBroker.setUrl(brokerUrl);
        return fakeBroker;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
