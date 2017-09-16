package declare_pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan()
public class AppConfig {

    @Bean
    public Integer getXX(){

        return 12321;
    }


    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Integer i = (Integer)ctx.getBean("getXX");
        String a = (String)ctx.getBean("a");
        String b = (String)ctx.getBean("b");
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
    }
}