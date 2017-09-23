package section12.point2.running.run2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import section12.point2.running.run2.material.AccountRepository;
import section12.point2.running.run2.material.TransferService;
import section12.point2.running.run2.material.TransferServiceImpl;

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