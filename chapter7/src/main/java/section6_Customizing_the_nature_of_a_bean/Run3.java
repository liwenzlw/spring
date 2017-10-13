package section6_Customizing_the_nature_of_a_bean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jimboi on 2017/10/11.
 *
 * Startup and shutdown callbacks
 */
public class Run3 {

    /* The Lifecycle interface */
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section6_Customizing_the_nature_of_a_bean/spring3.xml");
        context.start();
        context.stop();
    }

    /* The LifecycleProcessor interface */
    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section6_Customizing_the_nature_of_a_bean/spring4.xml");
        //context.start();
       // context.stop();
        context.refresh();
        context.close();
        //context.destroy();
    }

}
