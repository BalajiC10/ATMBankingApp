# ATM Interface in Java (Console-based Application)

## Overview
The **ATM Interface** is a console-based banking application developed in **Core Java**. It provides a simulation of basic ATM functionalities, allowing users to perform various banking operations like checking balances, transaction history, deposits, withdrawals, and fund transfers.

## Key Features
- **User Authentication**: Secure login using account number and PIN.
- **Bank Balance Inquiry**: View current account balance.
- **Transaction History**: Track past transactions, including deposits, withdrawals, and transfers.
- **Deposit Funds**: Add money to the account.
- **Withdraw Funds**: Withdraw money from the account (subject to sufficient balance).
- **Fund Transfer**: Transfer money between accounts within the bank.
- **Exit**: Quit the application safely.

## Technology Stack
- **Programming Language**: Core Java
- **Development Tools**: Any IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or VS Code)
- **Runtime Environment**: Java SE (Standard Edition)

## Domain
The application belongs to the **Banking** domain and demonstrates core banking functionalities in a simplified environment.

## Class Overview
### 1. **ATMApplication**
- Entry point of the application.
- Initializes the bank with predefined account holders and starts the ATM interface.

### 2. **PerticularATMBank**
- Handles user authentication and provides an interactive menu for ATM operations.
- Includes methods for balance inquiry, transaction history, deposits, withdrawals, and fund transfers.

### 3. **Bank**
- Manages a collection of account holders.
- Provides methods to add and retrieve account holders by account number.

### 4. **AccountHolder**
- Represents a bank customer with details like name, account number, PIN, and associated account.
- Includes PIN validation and account retrieval.

### 5. **Account**
- Represents the user’s bank account.
- Tracks the balance and transaction history.
- Provides methods for deposits, withdrawals, and fund transfers.

### 6. **BankTransaction**
- Records details of individual transactions (e.g., type, amount, timestamp).
- Used to log and retrieve the transaction history.

## How to Run the Application
1. Ensure you have Java SE installed on your system.
2. Clone or download the source code.
3. Compile the Java files using:
   ```bash
   javac -d . *.java
   ```
4. Run the application using:
   ```bash
   java in.bank.atm.ATMApplication
   ```
5. Follow the on-screen prompts to interact with the application.

## Sample Workflow
1. Enter account number and PIN to log in.
2. Choose an operation from the menu (e.g., check balance, withdraw funds).
3. Perform the operation as prompted (e.g., enter amount to withdraw).
4. View the updated balance or transaction history.
5. Logout by selecting the "Quit" option.

## Future Enhancements
- Add support for multiple banks.
- Implement a graphical user interface (GUI).
- Introduce real-time transaction processing using a database.
- Enhance security with encryption for PINs and account data.
- Provide multilingual support for users.

## License
This project is open-source and can be used for educational purposes. For commercial use, proper credit to the author is appreciated.

