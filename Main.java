import java.math.BigDecimal;
import AccountType.AccountType;
import exceptions.*;

public class Main {

  public static void main(String[] args)
      throws minimumbalanceException, SameAccException, InsufficientBalanceException {
    System.out.println('\n');
    HDFC_Bank acc1 = new HDFC_Bank("Deepti", BigDecimal.valueOf(10000), BigDecimal.valueOf(3000), AccountType.SAVINGS);
    acc1.Deposite(BigDecimal.valueOf(1000));
    acc1.Widthdraw(BigDecimal.valueOf(5000));

    System.out.println('\n');

    ICICI_Bank acc2 = new ICICI_Bank("Darshana", BigDecimal.valueOf(5000), BigDecimal.valueOf(2000),
        AccountType.CURRENT);
    acc2.Deposite(BigDecimal.valueOf(1010));
    acc2.Widthdraw(BigDecimal.valueOf(550));

    System.out.println('\n');

    UPI upiID1 = new UPI("123006", acc1);
    UPI upiID2 = new UPI("450023", acc2);

    upiID2.transfer(BigDecimal.valueOf(5500), upiID1);
    System.out.println('\n');
    upiID2.recive(BigDecimal.valueOf(5500), upiID1);
    System.out.println('\n');
  }

}
