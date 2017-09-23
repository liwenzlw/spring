**Title: 7.3 Bean overview**

    @Knowledge
    -1.A Spring IoC container manages one or more beans. These beans are created with the configuration
       metadata that you supply to the container, for example, in the form of XML <bean/> definitions.
       Within the container itself, these bean definitions are represented as BeanDefinition objects, which
       contain (among other information) the following metadata:
            • A package-qualified class name: typically the actual implementation class of the bean being defined.
            • Bean behavioral configuration elements, which state how the bean should behave in the container
            (scope, lifecycle callbacks, and so forth).
            • References to other beans that are needed for the bean to do its work; these references are also
            called collaborators or dependencies.
            • Other configuration settings to set in the newly created object, for example, the number of connections
            to use in a bean that manages a connection pool, or the size limit of the pool.
     