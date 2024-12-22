package in.bank.atm;

public class ATMApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank();
		
		Account account1 = new Account(5000);
		Account account2 = new Account(3000);
		
		
		AccountHolder holder1 = new AccountHolder("Balaji", "1234", "9999", account1);
		AccountHolder holder2 = new AccountHolder("Rohit", "4321", "8888", account2);
		
		bank.addAccountHolders(holder1);
		bank.addAccountHolders(holder2);
		
		PerticularATMBank HDFCBank = new PerticularATMBank(bank);
		HDFCBank.startATM();
		
	}

}
