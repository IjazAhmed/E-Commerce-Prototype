package payment;

import delivery.Courier;
import registration.Customer;
import store.Merchant;

public class PaymentGateway {
	
	private String name;
	
	public PaymentGateway(String name) {
		this.name=name;
	}
	
	
	public void processPurchaseTransaction(Merchant merchant,Customer customer, double amount) {
		
		customer.getCreditCard().setBalance(customer.getCreditCard().getBalance()-amount);
		merchant.getCreditdCard().setBalance(merchant.getCreditdCard().getBalance()+amount);
		
		System.out.println("An amount "+ amount + " is debited from customer "+
		customer.getUser().getName() + " Card and credited into Merchant "+ merchant.getName()+ " account");
		
		System.out.println("The new balance of Customer "+customer.getUser().getName()+ " is " +
		customer.getCreditCard().getBalance());
		
		System.out.println("The new balance of Merchant "+merchant.getName()+ " is " +
				merchant.getCreditdCard().getBalance());			
			
	}
	
	public void ProcessCourierFees(Merchant merchant, Courier courier, double amount) {
		
		merchant.getCreditdCard().setBalance(merchant.getCreditdCard().getBalance()-amount);
		courier.getCreditCard().setBalance(courier.getCreditCard().getBalance()+amount);
		System.out.println("The Merchant "+ merchant.getName() + " paid shipping fee " +
		amount + " to Courier "+ courier.getName());
		
		System.out.println("The new balance of Merchant "+merchant.getName()+ " is " +
						merchant.getCreditdCard().getBalance());	
		
		System.out.println("The new balance of Courier "+courier.getName()+ " is " +
				courier.getCreditCard().getBalance());	
		
		
	}
	
	
}
