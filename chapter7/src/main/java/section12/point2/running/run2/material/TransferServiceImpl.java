package section12.point2.running.run2.material;

import org.springframework.stereotype.Service;

/**
 * Created by jimboi on 2017/9/16.
 */
public class TransferServiceImpl implements TransferService {

    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public void getMoney() {
        accountRepository.getMoney();
    }

}
