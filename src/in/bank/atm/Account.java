package in.bank.atm;

import java.util.ArrayList;
import java.util.List;

public class Account {
	/*
	 * Handles account operations like credit, debit, and transfer.
	   Maintains a transaction history.
	 */
	
	private double balance;
	private List<BankTransaction> transactionhistory;
	
	 public Account(double initialBalance) {
	        this.balance = initialBalance;
	        this.transactionhistory = new ArrayList<>();
	  }
	 
	public Account(double balance, List<BankTransaction> transactionhistory) {
		super();
		this.balance = balance;
		this.transactionhistory = transactionhistory;
	}


	public double getBalance() {
		return balance;
	}

	public void credit(double amount) {
		balance+=amount;
		transactionhistory.add(new BankTransaction("Deposit ", amount));
	}
	
	public boolean debit(double amount) {
		
		if(amount<=balance) {
			balance -=amount;
			
			transactionhistory.add(new BankTransaction("Withdrawal ", amount));
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfer(Account recipent, double amount) {
		
		if(amount<=balance) {
			
			debit(amount);
			recipent.credit(amount);
			
			transactionhistory.add(new BankTransaction("Transfer to" +recipent,amount));
			
			return true;
		}
		
		return false;
		
		
	}
	
	public void printHistory() {
		System.out.println("Transaction History::");
		
		for(BankTransaction transaction:transactionhistory) {
			System.out.println(transaction);
		}
	}
	
	
}
