package section12.point2.running.run1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section12.point2.running.run1.material.AppConfig;
import section12.point2.running.run1.material.TransferService;

/**
 * Created by jimboi on 2017/9/16.
 * @Point1:
 *          Declaring a bean
 */
public class Run1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        TransferService transferService = ctx.getBean(TransferService.class);
        transferService.doStuff();
    }
}
