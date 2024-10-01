import java.io.Serializable;
import java.util.Random;
 
public class Checking extends ACCOUNT implements Serializable {
    private double interestRate;
    private String routingNumber;
 
    public Checking(String accountNumber, double balance, String accountHolder, double interestRate, String routingNumber) {
        super(accountNumber, balance, accountHolder);
        this.interestRate = interestRate;
        this.routingNumber = routingNumber;
    }
 
    public double getInterestRate() {
        return interestRate;
    }
 
    public String getRoutingNumber() {
        return routingNumber;
    }
 
    public static Checking createCheckingAccount(Random random, int index) {
        String accountNumber = String.format("%09d", random.nextInt(1_000_000_000));
        double balance = 100 + (10000 - 100) * random.nextDouble();
        String accountHolder = "Holder " + (index + 1);
        double interestRate = 0.01 + (0.05 - 0.01) * random.nextDouble();
        String routingNumber = String.format("%09d", random.nextInt(1_000_000_000));
 
        return new Checking(accountNumber, balance, accountHolder, interestRate, routingNumber);
    }
}
