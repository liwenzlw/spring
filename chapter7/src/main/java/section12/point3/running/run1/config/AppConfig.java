package section12.point3.running.run1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import section12.point3.running.run1.material.Bar;
import section12.point3.running.run1.material.Foo;

@Configuration
public class AppConfig {
    @Bean(initMethod = "init")
    public Foo foo() {
        return new Foo();
    }

    @Bean(destroyMethod = "cleanup")
    public Bar bar() {
        return new Bar();
    }
}
/**
 *  in the case of Foo above, it would be equally as valid to call the init() method directly during construction:
 *
 *  @Configuration
 *  public class AppConfig {
 *      @Bean
 *      public Foo foo() {
 *          Foo foo = new Foo();
 *          foo.init();
 *          return foo;
 *      }
 *      // ...
 *  }
  */

