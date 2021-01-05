package delivery;

import utility.CreditCard;

public class Courier {
	private String name;
	private String phone;
	private CreditCard cd;
	
public Courier(String name, String phone, CreditCard cd) {
	
	this.name= name;	
	this.phone=phone;
	this.cd=cd;
	
}

public void doShipping(String merchant_address, String customer_address) {
	
	System.out.println("The Courier "+ name + " picked item from Merchant address "+ merchant_address+
	" and delivering items to customer address "+ customer_address);
	
}

public CreditCard getCreditCard() {
	return cd;
	
}

public String getName() {
	return name;
}
	

}

