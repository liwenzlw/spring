package section2_Container_overview.point1.instantiating_a_container.run1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import section2_Container_overview.point1.instantiating_a_container.run1.material.AccountService;
import section2_Container_overview.point1.instantiating_a_container.run1.material.Car;

/**
 * Created by jimboi on 2017/9/23.
 * Composing XML-based configuration metadata
 */
public class Run3 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[] {
                                "section2_Container_overview/point1/instantiating_a_container/run1/config/composed.xml"
                        });
        AccountService bean = context.getBean(AccountService.class);
        bean.insertAccount();
        Car bean2 = context.getBean(Car.class);
        System.out.println(bean2.getEngineer());
    }
}
