public class Main {

public static void main(String[] args) {
        ACCOUNT accountTesting = new ACCOUNT("567", 10.00, "Sokina");
	System.out.println();

        System.out.println("ACCOUNT:");
        System.out.println("Account Number: " + accountTesting.getAccountNumber());
        System.out.println("Balance: " + accountTesting.getBalance());
        System.out.println("Account Holder: " + accountTesting.getAccountHolder());
	System.out.println();

        Savings savingsTesting = new Savings("123", 20.00, "Sokina", "001");
        System.out.println("Saving Acocunt:");
        System.out.println("Account Number: " + savingsTesting.getAccountNumber());
        System.out.println("Balance: " + savingsTesting.getBalance());
        System.out.println("Account Holder: " + savingsTesting.getAccountHolder());
        System.out.println("Routing Number: " + savingsTesting.getRoutingNumber());
	System.out.println();

        Checking checkingTesting = new Checking("456", 30.00, "Sokina", 1.5, "002");
        System.out.println("Checking Account:");
        System.out.println("Account Number: " + checkingTesting.getAccountNumber());
        System.out.println("Balance: " + checkingTesting.getBalance());
        System.out.println("Account Holder: " + checkingTesting.getAccountHolder());
        System.out.println("Interest Rate: " + checkingTesting.getInterestRate());
        System.out.println("Routing Number: " + checkingTesting.getRoutingNumber());
	System.out.println();

    }
}