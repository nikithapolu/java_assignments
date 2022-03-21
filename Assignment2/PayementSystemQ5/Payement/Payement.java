package Assignment2.PayementSystemQ5.Payement;

public class Payement
{

	public static void main(String gg[])
	{
	Invoice in=new Invoice(50,"A4581","Laptops,HeadPhones",2000);
	System.out.println(in.toString());
    System.out.println("Total Amount : "+in.getPayement());
    System.out.println("********************************************************");
    Employee ep=new Employee(101,"Akshata Pukle",36665,12);
    System.out.println(ep.toString());
    System.out.println("Total Annual Salary : "+ep.getPayement());
    
}
}