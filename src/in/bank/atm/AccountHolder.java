package in.bank.atm;

public class AccountHolder {
	/*
	 * Stores user details (name, account number, and PIN).
	   Validates the PIN and provides access to the associated account.
	 */
	
	private String name;
	private String accountNumber;
	private String pin;
	private Account account;
	
	public String getName() {
		return name;
	}
	
	public Account getAccount() {
		return account;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public boolean validatePIN(String pin) {
		return this.pin.equals(pin);	
	}
	
	public AccountHolder(String name, String accountNumber, String pin, Account account) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.account = account;
	}
	
	
	
	
}
