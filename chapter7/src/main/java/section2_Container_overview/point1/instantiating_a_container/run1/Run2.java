package section2_Container_overview.point1.instantiating_a_container.run1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import section2_Container_overview.point1.instantiating_a_container.run1.material.AccountService;
import section2_Container_overview.point1.instantiating_a_container.run1.material.Car;

/**
 * Created by jimboi on 2017/9/23.
 * 加载两个配置文件
 */
public class Run2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[] {
                                "section2_Container_overview/point1/instantiating_a_container/run1/config/service.xml",
                                "section2_Container_overview/point1/instantiating_a_container/run1/config/dao.xml"
                        });
        AccountService bean = context.getBean(AccountService.class);
        bean.insertAccount();
    }
}
