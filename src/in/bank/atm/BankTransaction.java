package in.bank.atm;

import java.util.Date;

public class BankTransaction {
    
    private String transactionType;
    private double amount;
    private Date timestamp;
    
    // Constructor
    public BankTransaction(String transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = new Date(); // Set the current date and time
    }

    @Override
    public String toString() {
        return "BankTransaction [transactionType=" + transactionType + ", amount=" + amount + ", timestamp=" + timestamp + "]";
    }
}
