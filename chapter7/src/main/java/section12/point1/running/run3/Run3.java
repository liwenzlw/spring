package section12.point1.running.run3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section12.point1.running.run3.meterial.AdditionalConfig;
import section12.point1.running.run3.meterial.AppConfig;
import section12.point1.running.run3.meterial.MyService;
import section12.point1.running.run3.meterial.OtherConfig;

/**
 * Created by jimboi on 2017/9/16.
 * @Point4:
 *          Building the container programmatically using register(Class<?>…)
 */
public class Run3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx;
        ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class, OtherConfig.class);
        ctx.register(AdditionalConfig.class);
        ctx.refresh();
        MyService myService = ctx.getBean(MyService.class);
        myService.doStuff();
    }
}
