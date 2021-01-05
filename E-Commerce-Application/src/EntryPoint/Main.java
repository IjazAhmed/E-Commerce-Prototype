package EntryPoint;

import java.sql.Date;

import delivery.Courier;
import payment.PaymentGateway;
import registration.Customer;
import registration.User;
import store.Merchant;
import utility.CreditCard;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		User user= new User("ijaz", "ijaz.uma@gmail.com","03473044519", "vetrannovice", "abc123");
		CreditCard user_cd= new CreditCard("75601234567123",12, 2020, "055", 2100);
		Customer customer= new Customer(user,user_cd);
		
		CreditCard mt_cd= new CreditCard("75601234567123",12, 2020, "501", 0);
		Merchant merchant= new Merchant("MacDonald","03451234",mt_cd);
		
		
		CreditCard cr_cd= new CreditCard("75601234567123",12, 2020, "501", 0);
		Courier courier= new Courier ("TCS", "0300400123", cr_cd);
		
		PaymentGateway pg= new PaymentGateway("Money Link");
		
		if (customer.doLogin(customer,"vetrannovice", "abc123")) {
			
			double amount=customer.checkout(customer.purchasedItems(merchant));
			pg.processPurchaseTransaction(merchant, customer, amount);
			courier.doShipping("Barking London", "Illford London");
			pg.ProcessCourierFees(merchant, courier, 2);
			
			
		}
		

	}

}
