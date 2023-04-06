package designprinciples.solid.lsp.bankaccount.refactored;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {
    @Override
    protected void deposit(BigDecimal amount) {
    }
}