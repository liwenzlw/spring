package section12.point1.running.run3.meterial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
}