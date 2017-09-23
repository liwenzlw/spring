**Title: Using the @Bean annotation**

    @Knowledge
    -1.@Bean is a method-level annotation and a direct analog of the XML <bean/> element. The annotation
       supports some of the attributes offered by <bean/>, such as: init-method, destroy-method, autowiring
       and name.
       You can use the @Bean annotation in a @Configuration-annotated or in a @Component-annotated
       class.
       
     -2.Full @Configuration vs 'lite' @Beans mode?
        When @Bean methods are declared within classes that are not annotated with @Configuration
        they are referred to as being processed in a 'lite' mode. For example, bean methods declared in
        a @Component or even in a plain old class will be considered 'lite'.
        Unlike full @Configuration, lite @Bean methods cannot easily declare inter-bean dependencies.
        Usually one @Bean method should not invoke another @Bean method when operating in 'lite' mode.
        Only using @Bean methods within @Configuration classes is a recommended approach of
        ensuring that 'full' mode is always used. This will prevent the same @Bean method from accidentally
        being invoked multiple times and helps to reduce subtle bugs that can be hard to track down when
        operating in 'lite' mode


