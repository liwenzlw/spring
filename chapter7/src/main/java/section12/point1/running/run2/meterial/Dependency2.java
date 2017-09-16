package section12.point1.running.run2.meterial;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by jimboi on 2017/9/16.
 */
@Named
public class Dependency2 {
    public void doPlay() {
        System.out.println("Dependency2");
    }
}
