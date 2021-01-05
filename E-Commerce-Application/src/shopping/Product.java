package shopping;

public class Product implements Cloneable{

	private String name;
	private int ID;
	private double price;
	
	public Product(String name, double d) {
		this.name=name;
		this.price=d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product clone() {
		try 
		{
			return (Product) super.clone();
		} 
		catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
}
