**Receiving lifecycle callbacks**

    @Knowledge
    -1.Any classes defined with the @Bean annotation support the regular lifecycle callbacks and can use the
       @PostConstruct and @PreDestroy annotations from JSR-250, see JSR-250 annotations for further
       details.
       
    -2.The regular Spring lifecycle callbacks are fully supported as well. If a bean implements
       InitializingBean, DisposableBean, or Lifecycle, their respective methods are called by the
       container.
       
    -3.The standard set of *Aware interfaces such as BeanFactoryAware, BeanNameAware,
       MessageSourceAware, ApplicationContextAware, and so on are also fully supported.
       
    -4.The @Bean annotation supports specifying arbitrary initialization and destruction callback methods,
       much like Spring XML’s init-method and destroy-method attributes on the bean element:
       
    -5.By default, beans defined using Java config that have a public close or shutdown method
       are automatically enlisted with a destruction callback. If you have a public close or shutdown
       method and you do not wish for it to be called when the container shuts down, simply add
       @Bean(destroyMethod="") to your bean definition to disable the default (inferred) mode
       
    -6.You may want to do that by default for a resource that you acquire via JNDI as its lifecycle is
       managed outside the application. In particular, make sure to always do it for a DataSource as
       it is known to be problematic on Java EE application servers.
       `@Bean(destroyMethod="")
        public DataSource dataSource() throws NamingException {
            return (DataSource) jndiTemplate.lookup("MyDS");
        }`
        
    -7.Tip
       When you work directly in Java, you can do anything you like with your objects and do not always
       need to rely on the container lifecycle!
    

