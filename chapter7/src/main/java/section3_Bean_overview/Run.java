package section3_Bean_overview;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import section3_Bean_overview.material.Car;
import section3_Bean_overview.material.ClientService;

import java.util.Arrays;

/**
 * Created by jimboi on 2017/9/23.
 */
public class Run {

    //Aliasing a bean outside the bean definition
    @Test
    public void testAlians() {
        ApplicationContext context = new ClassPathXmlApplicationContext("section3_Bean_overview/config/spring.xml");
        Car car = context.getBean("carAliasOut", Car.class);
        Car car2 = context.getBean("carAliasIn", Car.class);
        System.out.println(car.equals(car2));
        System.out.println(car.getEngineer());
    }

    //BeanDefinition
    @Test
    public void testBeanDefinition() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section3_Bean_overview/config/spring1.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        int beanDefinitionCount = context.getBeanDefinitionCount();
        System.out.println("beanDefinitionCount:" + beanDefinitionCount);
        System.out.println("beanDefinitionNames:" +  Arrays.asList(beanDefinitionNames));
        //注册一个Spring IOC容器之外的对象到IOC容器中
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        BeanDefinition carBeanDefinition = beanFactory.getBeanDefinition("car");
        System.out.println("carBeanDefinition:" +  carBeanDefinition);
        Car car4Reg = new Car();
        car4Reg.setEngineer("6缸");
        beanFactory.registerSingleton("car4Reg",car4Reg);
        //BeanDefinition car2BeanDefinition = beanFactory.getBeanDefinition("car2");
        //System.out.println("car2BeanDefinition:" + car2BeanDefinition);
        Car car21 = context.getBean("car4Reg", Car.class);
        System.out.println("car4Reg:" +  car21.getEngineer());
    }
    //Instantiating beans
    @Test
    public void instanceBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("section3_Bean_overview/config/spring3.xml");
        Car carConstructor = context.getBean("carConstructor", Car.class);
        ClientService clientService = context.getBean("clientService", ClientService.class);
        Car carInstanceFactory = context.getBean("carInstanceFactory", Car.class);
        System.out.println(carConstructor);
        System.out.println(clientService);
        System.out.println(carInstanceFactory);
    }
}
