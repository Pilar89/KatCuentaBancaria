import java.util.Date;

public class Historico {
  private String fecha;
  private Integer credit;
  private Integer debit;
  private Integer balance;

  public Historico(String fecha, Integer credit, Integer debit, Integer balance) {

    this.fecha = fecha;
    this.credit = credit;
    this.debit = debit;
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Historico{" +
      "fecha=" + fecha +
      ", credit=" + credit +
      ", debit=" + debit +
      ", balance=" + balance +
      '}';
  }
}
