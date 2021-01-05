package store;

import java.util.ArrayList;
import shopping.Product;
import utility.CreditCard;

public class Merchant {
	private String ID;
	private String Name;
	private String phone;
	private CreditCard cd;
	private ArrayList<Product> offered_items;
	
	public Merchant(String Name, String Phone, CreditCard cd ) {
		this.Name=Name;
		this.phone=Phone;
		this.cd=cd;
		offered_items= new ArrayList<Product>();
		
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public ArrayList<Product> getOfferedItems() {
		
		Product pd= new Product("Burger", 10.5);
		Product pd1= new Product("Fries", 3);
		Product pd2= new Product ("Drink",1);
		
		offered_items.add(pd);
		offered_items.add(pd1);
		offered_items.add(pd2);
		return offered_items;
		 
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public CreditCard getCreditdCard() {
		return cd;
	}

	public void setCreditCard(CreditCard cd) {
		this.cd = cd;
	}
	
	
}
