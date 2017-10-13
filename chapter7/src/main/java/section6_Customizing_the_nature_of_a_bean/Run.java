package section6_Customizing_the_nature_of_a_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jimboi on 2017/10/10.
 */
public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("section6_Customizing_the_nature_of_a_bean/spring.xml");
    }
}
