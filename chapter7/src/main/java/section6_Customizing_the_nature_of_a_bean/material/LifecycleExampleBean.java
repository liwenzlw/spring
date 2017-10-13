package section6_Customizing_the_nature_of_a_bean.material;

import org.springframework.context.Lifecycle;

/**
 * Created by jimboi on 2017/10/11.
 */
public class LifecycleExampleBean implements Lifecycle {

    private boolean flag = false;

    public void start() {
        System.out.println("LifecycleExampleBean start");
        flag = true;
    }

    public void stop() {
        System.out.println("LifecycleExampleBean stop");
        flag = true;
    }

    public boolean isRunning() {
        System.out.println("LifecycleExampleBean isRunning");
        return flag;
    }
}
