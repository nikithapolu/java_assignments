package Assignment2.BankingSystem;

public class CurrentAccount extends Account {

	private String tradeLicenseNumber;
	private double overdraft;

	public CurrentAccount(String name, String accountNumber, double accountBalance,String tradeLicenseNumber,double overdraft) {
		super(name, accountNumber, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
		this.overdraft = overdraft;
	}

	public void withdraw(double amount) {
		double allowedWithdrawal= getAccountBalance()+ overdraft;
		
		if(amount<=allowedWithdrawal) {
			setAccountBalance(getAccountBalance()-amount);
			System.out.println("amount "+ amount+" is withdrawn");
		}else
			System.out.println("You can not withdraw, dont have sufficient balance and overdraft limit  ...");
	}

	public double getBalance() {
		return getAccountBalance();
	}

	public String toString() {
		return super.toString()+
				"CurrentAccount [tradeLicenseNumber=" + tradeLicenseNumber + ", "
				+ "overdraft=" + overdraft + "]";
	}

	
}
