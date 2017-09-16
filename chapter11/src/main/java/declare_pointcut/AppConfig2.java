package declare_pointcut;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jimboi on 2017/9/16.
 */
@Configuration
public class AppConfig2 {

        @Bean
        public String a() {
            return "a";
        }
        @Bean
        public String b() {
            return "b";
        }
}
