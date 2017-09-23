package section12.point2.running.run2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section12.point2.running.run2.config.AppConfig;
import section12.point2.running.run2.material.TransferService;

/**
 * Created by jimboi on 2017/9/16.
 * @Pint3: Bean dependencies
 *          A @Bean annotated method can have an arbitrary number of parameters describing the dependencies
 *          required to build that bean. For instance if our TransferService requires an AccountRepository
 *          we can materialize that dependency via a method parameter:
 */
public class Run2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        TransferService transferService = ctx.getBean(TransferService.class);
        transferService.getMoney();
    }
}
