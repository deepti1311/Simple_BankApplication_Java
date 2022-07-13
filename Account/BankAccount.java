package Account;

import exceptions.*;
import java.math.BigDecimal;

public interface BankAccount {

  public void Widthdraw(BigDecimal balance) throws InsufficientBalanceException;

  public BigDecimal Deposite(BigDecimal balance);

  public boolean checkBalance(BigDecimal amount);

}
