**Title: Instantiating the Spring container using AnnotationConfigApplicationContext**

    @Knowledge
    -1.This versatile ApplicationContext implementation is capable of accepting not only
      @Configuration classes as input, but also plain @Component classes and classes annotated with
      JSR-330 metadata.

    -2.When @Configuration classes are provided as input, the @Configuration class itself is registered
      as a bean definition, and all declared @Bean methods within the class are also registered as bean
      definitions.

    -3.When @Component and JSR-330 classes are provided, they are registered as bean definitions, and it
      is assumed that DI metadata such as @Autowired or @Inject are used within those classes where
      necessary.


1.Simple construction

2.Building the container programmatically using register(Class<?>…) or annotation using @Configuration and @Bean 

3.Enabling component scanning with scan(String…) Programmatically or @ComponentScan

4.Support for web applications with AnnotationConfigWebApplicationContext

