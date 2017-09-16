package section12.point1.running.run1.material;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by jimboi on 2017/9/16.
 */
@Service
public class MyServiceImpl implements MyService {

    public void doStuff() {
        System.out.println("doStuff");
    }
}
