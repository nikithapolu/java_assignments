package Assignment2.BankingSystem;
public abstract class Account
{
	private String name;
	private String accountNumber;
	protected double accountBalance;
	
	public Account(String name, String accountNumber, double accountBalance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	
	public abstract void withdraw(double amount);
	public abstract double getBalance();
	
	public String toString() {
		return "Account [name=" + name + ","
				+ " accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ "]";
}
}