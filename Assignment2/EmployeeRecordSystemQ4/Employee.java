package Assignment2.EmployeeRecordSystemQ4;
abstract class Employee{
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	abstract public double getPayment() ;
	
	public String toString() {
		return "[id : " + id + ", name : " + name+",";
	}
	
}