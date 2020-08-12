package es.springframework.springdependencyinjectionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.springframework.springdependencyinjectionexample.controllers.MyController;

@SpringBootApplication
public class SpringDependencyInjectionExampleApplication {

    public static void main(String[] args) {

        // Store the context in a variable
        ApplicationContext context = SpringApplication.run(SpringDependencyInjectionExampleApplication.class, args);

        // Get the bean from context. Spring converts the bean to lower case the first letter, so MyController --> myController
        MyController controller = (MyController) context.getBean("myController");

        // Use bean methods
        System.out.println(controller.hello());
    }
}
