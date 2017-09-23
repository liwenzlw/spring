package section12.point4.running.run1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import section12.point4.running.run1.material.Encryptor;

/**
 * The default scope is singleton, but you can override this with the @Scope annotation:
 */
@Configuration
public class MyConfiguration {
    @Bean
    @Scope("prototype")
    public Encryptor encryptor() {
        // ...
        return new Encryptor();
    }
}