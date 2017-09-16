package section12.point1.running.run4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section12.point1.running.run4.meterial.AppConfig;
import section12.point1.running.run4.meterial.MyService;

/**
 * Created by jimboi on 2017/9/16.
 *
 * @Point5:
 *          When @Configuration classes are provided as input, the @Configuration class itself is registered
 *          as a bean definition, and all declared @Bean methods within the class are also registered as bean
 *          definitions.
 */
public class Run4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig appConfig = ctx.getBean(AppConfig.class);
        MyService myService = ctx.getBean(MyService.class);
        appConfig.play();
        myService.doStuff();
    }
}
