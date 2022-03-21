package Assignment2.EmployeeQ1;

import java.util.Scanner;

public class Employee
{
   private int id,salary;
   private String firstName,lastName;
	
   public Employee() {
	    this.id = 0;
		this.salary = 0;
		this.firstName = null;
		this.lastName = null;
		}

public void setId(int id) {
	this.id = id;
}
public int getId() {
	return id;
}

public void setSalary(int salary) {
	this.salary=salary;
}
public int getSalary() {
	return salary;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getFirstName() {
	return firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getLastName() {
	return lastName;
}

public int raiseSalary(int percent)
{
	int newSalary=(percent*salary)/100;
	newSalary+=salary;
	return newSalary;
}

public String toString()
{
	return "Employee[id="+getId()+", name="+getFirstName()+" "+getLastName()+", salary="+getSalary()+"]";
}


public static void main(String gg[])
{
	Scanner sc=new Scanner(System.in);
	Employee e1=new Employee();
	System.out.println("Enter your Id : ");
	e1.setId(sc.nextInt());
	System.out.println("Enter your salary : ");
	e1.setSalary(sc.nextInt());
	System.out.println("Enter your First Name : ");
	e1.setFirstName(sc.next());
	System.out.println("Enter your Last Name : ");
	e1.setLastName(sc.next());
	
	System.out.println("Name : "+e1.getFirstName()+" "+e1.getLastName());
	System.out.println("Annual Salary : "+(e1.getSalary()*12));
	System.out.println("New Salary : "+e1.raiseSalary(5));
    System.out.println(e1.toString());	
	sc.close();
	
}
}