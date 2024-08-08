package annotationbasedconfiguration;

import pojobeans.Account;
import pojobeans.AccountRepository;
import pojobeans.AccountService;

public class AccountService2Impl implements AccountService {
        private AccountRepository accountRepository;

        public void setAccountRepository(AccountRepository accountRepository) {
            this.accountRepository = accountRepository;
        }
        @Override
        public void transferMoney(long fromAccountId, long toAccountId, double amount) {
            Account sourceAccount = accountRepository.find(fromAccountId);
            Account targetAccount = accountRepository.find(toAccountId);
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            targetAccount.setBalance(targetAccount.getBalance() + amount);
            accountRepository.update(sourceAccount);
            accountRepository.update(targetAccount);
        }

        @Override
        public void depositMoney(long accountId, double amount) throws Exception {

        }

        @Override
        public Account getAccount(long accountId) {
            return accountRepository.find(accountId);
        }
}
