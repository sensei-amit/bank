class Bank_Transaction {
    private String accountName; 
    private String accountHolderName;
    private String accountType; 
    private long accountNumber;
    private double balance;

    public Bank_Transaction(String accountName, String accountHolderName, String accountType, long accountNumber, double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayTransactionInfo() 
    {
        System.out.println("Bank Name: " + accountName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}


public class BankApplication {
    public static void main(String[] args) {
        Bank_Customer customer1 = new Bank_Customer("Amit", 1001, "Hubballi, India");
        Bank_Transaction transaction1 = new Bank_Transaction("SBI", "Amit", "Saving", 123456789L, 5000.75);

        customer1.displayCustomerInfo();
        transaction1.displayTransactionInfo();
    }
}