package section12.point2.running.run2.material;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TransferService transferService(AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }

    @Bean
    public AccountRepository accountRepository() {
        return new AccountRepository();
    }
}