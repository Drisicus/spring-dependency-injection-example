package es.springframework.springdependencyinjectionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.springframework.springdependencyinjectionexample.controllers.MyController;
import es.springframework.springdependencyinjectionexample.exampleBeans.FakeDataSource;

@SpringBootApplication
public class SpringDependencyInjectionExampleApplication {

    public static void main(String[] args) {

        // Store the context in a variable
        ApplicationContext context = SpringApplication.run(SpringDependencyInjectionExampleApplication.class, args);

        // Get the bean from context. Spring converts the bean to lower case the first letter, so MyController --> myController
        MyController controller = (MyController) context.getBean("myController");

        // Relevant files: exampleBeans/FakeDataSource, config/PropertyConfig, resources/datasource.properties
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());
    }
}
