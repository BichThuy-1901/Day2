package depencyinjection;

import pojobeans.Account;
import pojobeans.AccountRepository;
import pojobeans.AccountService;

public class AccountServiceSetterImlp implements AccountService {
    private AccountRepository accountRepository;

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {

    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {

    }

    @Override
    public Account getAccount(long accountId) {
        return null;
    }
}
