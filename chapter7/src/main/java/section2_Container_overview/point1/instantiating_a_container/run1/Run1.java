package section2_Container_overview.point1.instantiating_a_container.run1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import section2_Container_overview.point1.instantiating_a_container.run1.material.Car;

/**
 * Created by jimboi on 2017/9/23.
 * Instantiating a Spring IoC container is straightforward. The location path or paths supplied to an
 * ApplicationContext constructor are actually resource strings that allow the container to load
 * configuration metadata from a variety of external resources such as the local file system, from the Java
 * CLASSPATH, and so on.
 */
public class Run1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"section2_Container_overview/point1/instantiating_a_container/run1/config/spring.xml"});
        Car bean = context.getBean(Car.class);
        System.out.println(bean.getEngineer());
    }
}
