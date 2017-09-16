package section12.point1.running.run2.meterial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by jimboi on 2017/9/16.
 */
@Service
public class MyServiceImpl implements  MyService{

    @Autowired
    private Dependency1 dependency1;

    @Inject
    private Dependency2 dependency2;

    public void doStuff() {
        System.out.println("doStuff");
        dependency1.doPlay();
        dependency2.doPlay();
    }
}
