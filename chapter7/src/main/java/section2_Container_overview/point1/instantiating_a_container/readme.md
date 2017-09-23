**Title: Instantiating a container**

    1.Instantiating a Spring IoC container is straightforward. The location path or paths supplied to an
       ApplicationContext constructor are actually resource strings that allow the container to load
       configuration metadata from a variety of external resources such as the local file system, from the Java
       CLASSPATH, and so on. For example:Run1,Run2
       
    2.Composing XML-based configuration metadata
      It can be useful to have bean definitions span multiple XML files. Often each individual XML configuration
      file represents a logical layer or module in your architecture.
      You can use the application context constructor to load bean definitions from all these XML fragments.
      This constructor takes multiple Resource locations, as was shown in the previous section. Alternatively,
      use one or more occurrences of the <import/> element to load bean definitions from another file or
      files. For example:Run3
    