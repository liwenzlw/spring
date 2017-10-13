package section6_Customizing_the_nature_of_a_bean.material;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MultipleLifecycleExampleBean implements InitializingBean,DisposableBean{

    public MultipleLifecycleExampleBean(){
        System.out.println("MultipleLifecycleExampleBean Construct");
    }
    private String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
        System.out.println("MultipleLifecycleExampleBean set prop");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("MultipleLifecycleExampleBean postConstruct");
    }

    public void init() {
        System.out.println("MultipleLifecycleExampleBean init");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("MultipleLifecycleExampleBean afterPropertiesSet");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("MultipleLifecycleExampleBean PreDestroy");
    }

    public void destruct() {
        System.out.println("MultipleLifecycleExampleBean destruct");
    }

    public void destroy() throws Exception {
        System.out.println("MultipleLifecycleExampleBean destory");
    }
}