package in.bank.atm;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	/*
	 * The Bank class maintains a map of account holders using the account number as the key.
	   It provides methods to add and retrieve account holders.
	 */
		
	private Map<String, AccountHolder> accountHolders;
	
	public Bank() {
		accountHolders= new HashMap<>();
	}
	
	
	public void addAccountHolders(AccountHolder holder) {
		accountHolders.put(holder.getAccountNumber(),holder);
		
	}
	
	public AccountHolder getAccountHolder(String accountNumber) {
	    return accountHolders.get(accountNumber); // Directly fetch from the map
	}

}
