import java.math.BigDecimal;
import Account.Account;

import exceptions.InsufficientBalanceException;
import exceptions.SameAccException;

public class UPI {
  public String upiId;
  public Account account;

  public UPI(String upiId, Account account) {
    this.upiId = upiId;
    this.account = account;

  }

  public void transfer(BigDecimal amount, UPI destination) throws SameAccException, InsufficientBalanceException {
    System.out.println(getClass().getSimpleName() + " Transaction Details :");

    if (this == destination) {
      throw new SameAccException("Can not transfer to same account");
    } else {
      this.account.Widthdraw(amount);
    }
    System.out.println(account.owner + " UPI transaction sucessfull!!");
  }

  public void recive(BigDecimal amount, UPI destination) throws SameAccException, InsufficientBalanceException {
    System.out.println(getClass().getSimpleName() + " Transaction Details :");
    destination.account.Deposite(amount);
    System.out.println(destination.account.owner + " Amount recived through UPI TRANSACTION sucessfullY!!");

  }

  public String get(String upiId) {
    return this.upiId = upiId;

  }

  public Account get(Account account) {
    return this.account = account;
  }

  public void set(String upiId, Account account) {

    this.upiId = upiId;
    this.account = account;
  }

}