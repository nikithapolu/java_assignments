package Assignment2.EmployeeRecordSystemQ4;
public class ComissionEmployee extends Employee
{
	private int percentage;
	private double fixedWeeklySalary;
	
	public ComissionEmployee(int id, String name, int percentage,double fixedWeeklySalary) {
		super(id, name);
		this.percentage = percentage;
		this.fixedWeeklySalary=fixedWeeklySalary;
	}

	
	public int getPercentage() {
		return percentage;
	}


	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}


	public double getFixedWeeklySalary() {
		return fixedWeeklySalary;
	}


	public void setFixedWeeklySalary(double fixedWeeklySalary) {
		this.fixedWeeklySalary = fixedWeeklySalary;
	}


	public double getPayment() 
	{
		return (percentage*fixedWeeklySalary)/100;
	}
	

	public String toString()
	{
		return super.toString()+" Fixed Salary : "+fixedWeeklySalary+", Percentage : "+percentage+"]";
	}
}


