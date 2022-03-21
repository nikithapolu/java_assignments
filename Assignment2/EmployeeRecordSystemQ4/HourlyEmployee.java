package Assignment2.EmployeeRecordSystemQ4;
public class HourlyEmployee extends Employee
{
	private double hourlyRate;
	private int workedHour;
	public HourlyEmployee(int id, String name, double hourlyRate, int workedHour) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.workedHour = workedHour;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getWorkedHour() {
		return workedHour;
	}
	public void setWorkedHour(int workedHour) {
		this.workedHour = workedHour;
	}
	
	public double getPayment() {
		return hourlyRate*workedHour;
	}

	public String toString()
	{
		return super.toString()+
	" Worked Hour : "+workedHour+", Rate/Hour : "+hourlyRate+"]";
	}
	
}

