public class Checking extends ACCOUNT {
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

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
}