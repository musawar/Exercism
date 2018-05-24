package io.exercism.bank_account;

public class BankAccount {

	private long accountBalance;
	private boolean isAccountActive;
	public void open() {
		accountBalance = 0;
		isAccountActive = true;
	}

	/*
	 * To manage concurrent access in multi threading environment synchronized
	 * keyword is used. It will make the method (deposit) thread safe.
	 */
	public synchronized void deposit(int amount) throws BankAccountActionInvalidException {
		checkAccountClosed();
		checkNegativeAmount(amount);
		accountBalance += amount;
	}

	/*
	 * To manage concurrent access in multi threading environment synchronized
	 * keyword is used. It will make the method (withdraw) thread safe.
	 */
	public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
		
		checkAccountClosed();
		checkNegativeAmount(amount);
		
		if (accountBalance == 0)
			throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
		
		if (amount > accountBalance) 
			throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");

		accountBalance -= amount;
		
	}

	/* Get Account Balance */
	public long getBalance() throws BankAccountActionInvalidException {
		if (!isAccountActive)
			throw new BankAccountActionInvalidException("Account closed");

		return accountBalance;

	}
	
	/* Amount Negative Check for Entered Amount. */
	public void checkNegativeAmount(int amount) throws BankAccountActionInvalidException{
		if (amount<0)
			throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
	}

	/*Account Closed Check. */
	public void checkAccountClosed() throws BankAccountActionInvalidException{
		if (!isAccountActive)
			throw new BankAccountActionInvalidException("Account closed");
	}
	
	/* Account closed. */
	public void close() {
		isAccountActive = false;
		accountBalance = 0;
	}

}
