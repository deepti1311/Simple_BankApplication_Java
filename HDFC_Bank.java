import java.math.BigDecimal;
import AccountType.AccountType;
import Account.Account;
import Account.BankAccount;
import exceptions.*;

public class HDFC_Bank extends Account implements BankAccount {

  public BigDecimal min_balance;
  public AccountType account_type;

  public HDFC_Bank(String owner, BigDecimal balance, BigDecimal min_balance, AccountType account_type)
      throws minimumbalanceException {
    super(owner, balance, min_balance, account_type);
    super.setMinBalance(BigDecimal.valueOf(5000));
    super.setOverDraft(this.getbalance(min_balance).multiply(BigDecimal.valueOf(0.2)));

    try {
      if (balance.compareTo(min_balance) >= 0) {
        this.balance = balance;
      } else {
        throw new minimumbalanceException("Minimum balance insufficent");

      }
    } catch (minimumbalanceException e) {
      e.getMessage();
      throw new minimumbalanceException("Minimum balance insufficent");
    }

  }

  @Override
  public BigDecimal Deposite(BigDecimal balance) {

    return super.Deposite(balance);

  }

  @Override
  public void Widthdraw(BigDecimal balance) throws InsufficientBalanceException {
    super.Widthdraw(balance);

  }

  @Override
  public void setOverDraft(BigDecimal amt) {
    super.setOverDraft(amt);
  }

}
