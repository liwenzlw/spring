package section2_Container_overview.point1.instantiating_a_container.run1.material;

/**
 * Created by jimboi on 2017/9/23.
 */
public class AccountService {

    private AccountDao accountDao;

    public void insertAccount() {
        accountDao.insertAccount();
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
