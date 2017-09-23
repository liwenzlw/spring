**Title: 7.1 Introduction to the Spring IoC container and beans**

    @Knowledge
    -1.The org.springframework.beans and org.springframework.context packages are the
       basis for Spring Framework’s IoC container. The BeanFactory interface provides an advanced
       configuration mechanism capable of managing any type of object. ApplicationContext is a subinterface of BeanFactory. It adds easier integration with Spring’s AOP features; message resource
       handling (for use in internationalization), event publication; and application-layer specific contexts such
       as the WebApplicationContext for use in web applications.
       In short, the BeanFactory provides the configuration framework and basic functionality, and the
       ApplicationContext adds more enterprise-specific functionality. The ApplicationContext is
       a complete superset of the BeanFactory
       
     -2.In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC
        container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed
        by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans,
        and the dependencies among them, are reflected in the configuration metadata used by a container.


