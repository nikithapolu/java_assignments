package Assignment2.PayementSystemQ5.Payement;
import Assignment2.PayementSystemQ5.Interface.*;
public class Invoice implements Payeable
{
	private int quantity;
	private String partNum;
	private String partDescription;
	private double pricePerItem;
	
	public Invoice(int quantity, String partNum, String partDescription,double pricePerItem) {
		this.quantity = quantity;
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.pricePerItem=pricePerItem;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public double getPricePerItem() {
		System.out.println(quantity*pricePerItem);
		return quantity*pricePerItem;
		}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public double getPayement()
	{
		return quantity*pricePerItem;
	}
	
	public String toString() {
		return "Invoice Details [Part Num. : " + partNum + ", Part Descreption : " + partDescription + ", Quantity : " + quantity+ ", Price/Item :"+ pricePerItem+" ]";
	}
}