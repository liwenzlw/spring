package section12.point1.running.run1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import section12.point1.running.run1.material.AppConfig;
import section12.point1.running.run1.material.MyService;

/**
 * @Point1: Instantiating the Spring container using AnnotationConfigApplicationContext
 * Created by jimboi on 2017/9/16.
 */
public class Run1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = ctx.getBean(MyService.class);
        myService.doStuff();
    }


}
