package es.springframework.springdependencyinjectionexample;

import es.springframework.springdependencyinjectionexample.controllers.ConstructorInjectedController;
import es.springframework.springdependencyinjectionexample.controllers.MyController;
import es.springframework.springdependencyinjectionexample.controllers.PropertyInjectedController;
import es.springframework.springdependencyinjectionexample.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionExampleApplication {

    public static void main(String[] args) {

        // Store the context in a variable
        ApplicationContext context = SpringApplication.run(SpringDependencyInjectionExampleApplication.class, args);

        // Get the bean from context. Spring converts the bean to lower case the first letter, so MyController --> myController
        MyController controller = (MyController) context.getBean("myController");

        // Use bean methods
        System.out.println(controller.hello());

        // Example calls using controllers directly
//        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }
}
