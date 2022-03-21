package Assignment2.EmployeeRecordSystemQ4;
public class SalariedEmployee extends Employee{

	private double fixedWeeklySalary;
	public SalariedEmployee(int id, String name, double fixedWeeklySalary) {
		super(id, name);
		this.fixedWeeklySalary=fixedWeeklySalary;
	}
	
	
	public double getPayment() {
		return fixedWeeklySalary;
	}

	public String toString()
	{
		return super.toString()+
				" Fixed Salary : "+fixedWeeklySalary+"]";
	}
}
