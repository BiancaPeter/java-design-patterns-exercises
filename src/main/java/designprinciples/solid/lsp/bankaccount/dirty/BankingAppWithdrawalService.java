package designprinciples.solid.lsp.bankaccount.dirty;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private final Account account;

    public BankingAppWithdrawalService(Account account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}