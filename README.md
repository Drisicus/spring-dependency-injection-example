Ejemplo de inyección de dependencias con Spring.

Se parte de un servicio especificado como tal con @Service llamado GreetingService.
Se quieren utilizar distintas formas de inyectar el servicio en distintos controladores usando diferentes métodos.

En la clase SpringDependencyInjectionExampleApplication se hace un ejemplo obteniendo
el contexto de la aplicación y a través de este se trata de obtener los beans con los controladores.

Métodos usados:

- Por propiedad --> PropertyInjectedController

Se tiene una variable en la clase "greetingService".
Requiere del @Autowired para que spring lo detecte.

- Por setters --> SetterInjectedController

Se tiene un método "setGreetingService" que asigna el servicio a una variable del 
controller, necesita @Autowired. 

- Por constructor (El recomendado) --> ConstructorInjectedController

La variable con el service se define en el constructor. No se requiere @Autowired.
 
--> Para ver los distintos error quitar los @Controller y los @Autowired de las controllers.