package section12.point1.running.run5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section12.point1.running.run5.meterial.pkg1.AppConfig;
import section12.point1.running.run5.meterial.pkg1.ScanedClass1;
import section12.point1.running.run5.meterial.pkg1.pkg.ScanedClass2;
import section12.point1.running.run5.meterial.pkg2.ScanedClass3;

/**
 * Created by jimboi on 2017/9/16.
 * @Point5:
 *          Enabling component scanning by add @ComponentScan(basePackages = "section12.point1.running.run5.meterial.pkg2")
 *          on @Configuration class
 *          如果没有指定@ComponentScan的basePackages值,如 @ComponentScan,则默认扫描AppConfig所在的包及其子包
 *
 */
public class Run5ByAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig appConfig = ctx.getBean(AppConfig.class);
        //ScanedClass1 scanedClass1 = ctx.getBean(ScanedClass1.class);
        //ScanedClass2 scanedClass2 = ctx.getBean(ScanedClass2.class);
        ScanedClass3 scanedClass3 = ctx.getBean(ScanedClass3.class);
    }
}
