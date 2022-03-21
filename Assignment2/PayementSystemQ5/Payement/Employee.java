package Assignment2.PayementSystemQ5.Payement;
import Assignment2.PayementSystemQ5.Interface.*;
public class Employee implements Payeable
{
	private int EmpNo;
	private String EmpName;
	private double salaryPerMonth;
	private int month;
	

	public Employee(int empNo, String empName, double salaryPerMonth, int month) {
		this.EmpNo = empNo;
		this.EmpName = empName;
		this.salaryPerMonth=salaryPerMonth;
		this.month=month;
 	}

	
	public int getEmpNo() {
		return EmpNo;
	}


	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}


	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}
	

	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}

	public double getPayement()
	{
	return salaryPerMonth*month;
	}
	
	public String toString() {
		return "Employee Details [Employee no. : " + EmpNo + ", Employee Name : " + EmpName + ", Monthy Salary : " + salaryPerMonth + " Month : "+ month +" ]";
	}
}