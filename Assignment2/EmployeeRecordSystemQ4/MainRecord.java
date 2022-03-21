package Assignment2.EmployeeRecordSystemQ4;
public class MainRecord 
{
	static Employee emp1,emp2,emp3;
	static String SalariedDetails,HourlyDetails,ComissionDetails;
	public static void main(String gg[])
	{
		emp1=new SalariedEmployee(101,"Akshata Pukle",36000);
		SalariedDetails=emp1.toString();
		System.out.print("Salaried Employee Details : "+SalariedDetails);
		System.out.println(" Salaried Employee Salary : "+emp1.getPayment());
		
		emp2=new HourlyEmployee(102,"Akshat Sharma",1000,9); 
		HourlyDetails=emp2.toString();
		System.out.print("Hourly Employee Details : "+HourlyDetails);
		System.out.println(" Hourly Employee Salary : "+emp2.getPayment());
		
	
		emp3=new ComissionEmployee(103,"Ajay Dhamonia",50,4500);  
		ComissionDetails=emp3.toString();
		System.out.print("Comission Employee Details : "+ComissionDetails);
		System.out.println(" Comission Employee Salary : "+emp3.getPayment());
	}
}