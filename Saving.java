import java.io.Serializable;
import java.util.Random;
 
public class Saving extends ACCOUNT implements Serializable {
    private double interestRate;
 
    public Saving(String accountNumber, double balance, String accountHolder, double interestRate) {
        super(accountNumber, balance, accountHolder);
        this.interestRate = interestRate;
    }
 
    public double getInterestRate() {
        return interestRate;
    }
 
    public static Saving createSavingsAccount(Random random, int index) {
        String accountNumber = String.format("%09d", random.nextInt(1_000_000_000));
        double balance = 100 + (10000 - 100) * random.nextDouble();
        String accountHolder = "Holder " + (index + 1);
        double interestRate = 0.01 + (0.05 - 0.01) * random.nextDouble();
 
        return new Saving(accountNumber, balance, accountHolder, interestRate);
    }
}
