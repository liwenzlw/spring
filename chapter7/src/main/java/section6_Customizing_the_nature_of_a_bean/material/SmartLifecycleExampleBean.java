package section6_Customizing_the_nature_of_a_bean.material;

import org.springframework.context.SmartLifecycle;

/**
 * Created by jimboi on 2017/10/13.
 */
public class SmartLifecycleExampleBean implements SmartLifecycle {

    private boolean flag = false;
    public boolean isAutoStartup() {
        return true;
    }

    public void stop(Runnable callback) {
        stop();
        System.out.println("stop callback");
    }

    public void start() {
        System.out.println("start");
        flag = true;
    }

    public void stop() {
        System.out.println("stop");
        flag = false;
    }

    public boolean isRunning() {
        return flag;
    }

    public int getPhase() {
        return 1;
    }
}
