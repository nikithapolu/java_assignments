package Assignment2.BankingSystem;

public class Main {
   static Account ac1;
   static Account ac2;
	public static void main(String[] args) {	
			ac1=new SavingAccount("ravi", "4343433434", 30000, 5, 1000);
			System.out.println(ac1.toString());
			ac1.withdraw(4000);
			System.out.println("Account Balance in Account Number :"+ac1.getAccountNumber()+" is : "+ac1.getBalance());
			
	    	ac2=new CurrentAccount("rajiv", "543545445", 50000, "AB1234", 50000);	    
	    	System.out.println(ac2.toString());
	    	ac2.withdraw(2000);
	    	System.out.println("Account Balance in Account Number :"+ac2.getAccountNumber()+" is : "+ac2.getBalance());
	}
}