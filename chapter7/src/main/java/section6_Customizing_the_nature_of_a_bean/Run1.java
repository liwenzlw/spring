package section6_Customizing_the_nature_of_a_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jimboi on 2017/10/10.
 *
 * Combining lifecycle mechanisms
 */
public class Run1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section6_Customizing_the_nature_of_a_bean/spring2.xml");
        context.destroy();
    }
}
