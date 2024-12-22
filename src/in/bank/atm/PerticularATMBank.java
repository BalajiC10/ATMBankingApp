package in.bank.atm;

import java.util.Scanner;

public class PerticularATMBank {
    private Bank bank;

    public PerticularATMBank(Bank bank) {
        this.bank = bank;
    }

    public void startATM() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the ATM System!");

        System.out.print("Enter your Account Number: ");
        String accountNumber = scan.nextLine();

        System.out.print("Enter your PIN: ");
        String pin = scan.nextLine();

        AccountHolder accountHolder = bank.getAccountHolder(accountNumber);

        if (accountHolder != null && accountHolder.validatePIN(pin)) {
            System.out.println("Login Successful. Welcome, " + accountHolder.getName());
            showMenu(accountHolder);
        } else {
            System.out.println("Invalid account number or PIN. Please try again.");
        }
    }

    private void showMenu(AccountHolder accountHolder) {
        Scanner scan = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nPlease choose an Operation:");
            System.out.println("1. Bank Balance");
            System.out.println("2. Transaction History");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Transfer");
            System.out.println("6. Quit");

            int choice = scan.nextInt();
            scan.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    // Display the account balance
                    System.out.println("Your current balance is: " + accountHolder.getAccount().getBalance());
                    break;

                case 2:
                    // Print transaction history
                    System.out.println("Transaction History:");
                    accountHolder.getAccount().printHistory();
                    break;

                case 3:
                    // Withdraw funds
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawnAmount = scan.nextDouble();
                    if (accountHolder.getAccount().debit(withdrawnAmount)) {
                        System.out.println("Withdrawal Successful. Remaining Balance: " + accountHolder.getAccount().getBalance());
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;

                case 4:
                    // Deposit funds
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scan.nextDouble();
                    accountHolder.getAccount().credit(depositAmount);
                    System.out.println("Deposit Successful. Updated Balance: " + accountHolder.getAccount().getBalance());
                    break;

                case 5:
                    // Transfer funds
                    System.out.print("Enter recipient account number: ");
                    String recipientAccount = scan.nextLine();
                    AccountHolder recipient = bank.getAccountHolder(recipientAccount);

                    if (recipient != null) {
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scan.nextDouble();
                        if (accountHolder.getAccount().transfer(recipient.getAccount(), transferAmount)) {
                            System.out.println("Transfer Successful. Updated Balance: " + accountHolder.getAccount().getBalance());
                        } else {
                            System.out.println("Transfer Failed. Insufficient funds.");
                        }
                    } else {
                        System.out.println("Recipient account not found.");
                    }
                    break;

                case 6:
                    // Quit
                    quit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }
    }
}
