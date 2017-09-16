package section12.point1.running.run4.meterial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
    public void play() {
        System.out.println("AppConfig");
    }
}