**Title: 7.2 Container overview**

    @Knowledge
    -1.The interface org.springframework.context.ApplicationContext represents the Spring IoC
       container and is responsible for instantiating, configuring, and assembling the aforementioned beans.
       The container gets its instructions on what objects to instantiate, configure, and assemble by reading
       configuration metadata. The configuration metadata is represented in XML, Java annotations, or Java
       code. It allows you to express the objects that compose your application and the rich interdependencies
       between such objects.
       
     -2.Several implementations of the ApplicationContext interface are supplied out-of-thebox with Spring. 
        In standalone applications it is common to create an instance of
        ClassPathXmlApplicationContext or FileSystemXmlApplicationContext. While XML has
        been the traditional format for defining configuration metadata you can instruct the container to use
        Java annotations or code as the metadata format by providing a small amount of XML configuration to
        declaratively enable support for these additional metadata formats.
        
      @Point1:
            _Configuration metadata_
            -1.As the preceding diagram shows, the Spring IoC container consumes a form of configuration metadata;
              this configuration metadata represents how you as an application developer tell the Spring container to
              instantiate, configure, and assemble the objects in your application.
              
              Note
              XML-based metadata is not the only allowed form of configuration metadata. The Spring IoC
              container itself is totally decoupled from the format in which this configuration metadata is
              actually written. These days many developers choose Java-based configuration for their Spring
              applications.
              
            -2.For information about using other forms of metadata with the Spring container, see:
               • Annotation-based configuration: Spring 2.5 introduced support for annotation-based configuration
               metadata.
               • Java-based configuration: Starting with Spring 3.0, many features provided by the Spring JavaConfig
               project became part of the core Spring Framework. Thus you can define beans external to your
               application classes by using Java rather than XML files. To use these new features, see the
               @Configuration, @Bean, @Import and @DependsOn annotations.

            -3.Spring configuration consists of at least one and typically more than one bean definition that the
               container must manage. XML-based configuration metadata shows these beans configured as <bean/
               > elements inside a top-level <beans/> element. Java configuration typically uses @Bean annotated
               methods within a @Configuration class.

            -4.These bean definitions correspond to the actual objects that make up your application. Typically you
               define service layer objects, data access objects (DAOs), presentation objects such as Struts Action
               instances, infrastructure objects such as Hibernate SessionFactories, JMS Queues, and so forth.
               Typically one does not configure fine-grained domain objects in the container, because it is usually the
               responsibility of DAOs and business logic to create and load domain objects. However, you can use
               Spring’s integration with AspectJ to configure objects that have been created outside the control of an
               IoC container. See Using AspectJ to dependency-inject domain objects with Spring.
               
            -5.The following example shows the basic structure of XML-based configuration metadata:
            
                `<?xml version="1.0" encoding="UTF-8"?>
                    <beans xmlns="http://www.springframework.org/schema/beans"
                        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                        xsi:schemaLocation="http://www.springframework.org/schema/beans
                        http://www.springframework.org/schema/beans/spring-beans.xsd">
                        <bean id="..." class="...">
                            <!-- collaborators and configuration for this bean go here -->
                        </bean>
                        <bean id="..." class="...">
                            <!-- collaborators and configuration for this bean go here -->
                        </bean>
                        <!-- more bean definitions go here -->
                 </beans>`