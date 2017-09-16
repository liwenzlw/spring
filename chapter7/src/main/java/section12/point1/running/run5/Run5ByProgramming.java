package section12.point1.running.run5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section12.point1.running.run5.meterial.pkg1.AppConfig;
import section12.point1.running.run5.meterial.pkg2.ScanedClass3;

/**
 * Created by jimboi on 2017/9/16.
 *
 *  @Point6:
 *          Remember that @Configuration classes are meta-annotated with @Component, so they
 *          are candidates for component-scanning! In the example above, assuming that AppConfig is
 *          declared within the com.acme package (or any package underneath), it will be picked up during
 *          the call to scan(), and upon refresh() all its @Bean methods will be processed and registered
 *          as bean definitions within the container
 */
public class Run5ByProgramming {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("section12.point1.running.run5.meterial.pkg2");
        ctx.refresh();
        //AppConfig appConfig = ctx.getBean(AppConfig.class);
        //ScanedClass1 scanedClass1 = ctx.getBean(ScanedClass1.class);
        //ScanedClass2 scanedClass2 = ctx.getBean(ScanedClass2.class);
        ScanedClass3 scanedClass3 = ctx.getBean(ScanedClass3.class);
    }
}
