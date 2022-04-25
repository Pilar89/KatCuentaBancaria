import java.util.ArrayList;
import java.util.List;

public class BankAccount {

  private Integer accountBalance;

  private List historico = new ArrayList();


  public BankAccount(Integer accountBalance) {
    this.accountBalance = accountBalance;
  }

  public void deposit(Integer amount, String date) {
    this.accountBalance = this.accountBalance + amount;
    Historico registration = new Historico(date, amount, 0, this.accountBalance);
    historico.add(registration);

  }

  public void withdraw(Integer amount, String date) {
    if (amount > this.accountBalance) return;
    this.accountBalance = this.accountBalance - amount;
    Historico registration = new Historico(date, 0, amount, this.accountBalance);
    historico.add(registration);
  }


  public void printStatements() {
    for (int i = 0; i < historico.size(); i++) {
      System.out.println(historico.get(i));
      ;
    }

  }

}
