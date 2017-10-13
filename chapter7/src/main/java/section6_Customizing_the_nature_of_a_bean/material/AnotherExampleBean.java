package section6_Customizing_the_nature_of_a_bean.material;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by jimboi on 2017/10/10.
 */
public class AnotherExampleBean implements InitializingBean {

    private String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
        System.out.println("set AnotherExampleBean prop");
    }

    public void afterPropertiesSet() {
        // do some initialization work
        System.out.println("AnotherExampleBean afterPropertiesSet");
    }

}
