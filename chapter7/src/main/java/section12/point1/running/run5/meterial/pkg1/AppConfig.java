package section12.point1.running.run5.meterial.pkg1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import section12.point1.running.run4.meterial.MyService;
import section12.point1.running.run4.meterial.MyServiceImpl;

@Configuration
//@ComponentScan
@ComponentScan(basePackages = "section12.point1.running.run5.meterial.pkg2")
public class AppConfig {
    //......
}