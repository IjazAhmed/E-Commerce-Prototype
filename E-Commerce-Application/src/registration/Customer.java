package registration;

import shopping.Cart;
import shopping.Product;
import store.Merchant;
import utility.CreditCard;

public class Customer {
	private User user;
	private CreditCard credit_card;

	public Customer(User user,CreditCard credit_card ) {
		this.user=user;
		this.credit_card=credit_card;
	}
	
	public CreditCard getCreditCard() {
		return credit_card;
	}

	public void setCreditCard(CreditCard credit_card) {
		this.credit_card = credit_card;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public double checkout(Cart cart) {
		float total=0;
		for (Product pd : cart.getPurchasedItems()) { 		      
	        	total += pd.getPrice();
	   }
		return total;
	}

	public boolean doLogin(Customer customer, String string, String string2) {
		
		return true;
	}

	public Cart purchasedItems(Merchant merchant) {
		Cart cart=new Cart();
		
		for (Product pd : merchant.getOfferedItems()) { 		      
			cart.addItem(pd.clone());
			System.out.println("Customer "+ user.getName() + " purchased "+ pd.getName()+
					" from Merchant "+ merchant.getName() + " at the price "+ pd.getPrice());
		}
		return cart;
		
	}
	
}
