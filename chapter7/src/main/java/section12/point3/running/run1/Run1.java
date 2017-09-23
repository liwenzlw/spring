package section12.point3.running.run1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section12.point3.running.run1.config.AppConfig;
import section12.point3.running.run1.material.Bar;
import section12.point3.running.run1.material.Foo;

/**
 * Created by jimboi on 2017/9/16.
 * @Point1:
 *          The @Bean annotation supports specifying arbitrary initialization and destruction callback methods,
 *          much like Spring XML’s init-method and destroy-method attributes on the bean element:
 * @Point2:
 *          By default, beans defined using Java config that have a public close or shutdown method
 *          are automatically enlisted with a destruction callback. If you have a public close or shutdown
 *          method and you do not wish for it to be called when the container shuts down, simply add
 *          @Bean(destroyMethod="") to your bean definition to disable the default (inferred) mode
 */
public class Run1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Foo foo = ctx.getBean(Foo.class);
        Bar bar = ctx.getBean(Bar.class);
        ctx.close();
    }
}
