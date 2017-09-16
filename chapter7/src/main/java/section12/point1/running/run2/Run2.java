package section12.point1.running.run2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section12.point1.running.run2.meterial.Dependency1;
import section12.point1.running.run2.meterial.Dependency2;
import section12.point1.running.run2.meterial.MyService;
import section12.point1.running.run2.meterial.MyServiceImpl;

/**
 * Created by jimboi on 2017/9/16.
 *
 * @Point2:
 *          This versatile ApplicationContext implementation is capable of accepting not only
 *          @Configuration classes as input, but also plain @Component classes and classes annotated with
 *          JSR-330 metadata.
 *
 * @Point3:
 *          When @Component and JSR-330 classes are provided, they are registered as bean definitions, and it
 *          is assumed that DI metadata such as @Autowired or @Inject are used within those classes where necessary.
 */
public class Run2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyServiceImpl.class,
                Dependency1.class, Dependency2.class);
        MyService myService = ctx.getBean(MyService.class);
        Dependency1 dependency1 = ctx.getBean(Dependency1.class);
        Dependency2 dependency2 = ctx.getBean(Dependency2.class);
        myService.doStuff();
        dependency1.doPlay();
        dependency2.doPlay();
    }
}
