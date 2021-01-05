package utility;
public class CreditCard {
	private String number;
	private int expiry_month, expiry_year;
	private String ccv_code;
	private double balance;
	
public CreditCard(String number, int expiry_month, int expiry_year, String ccv_code, double balance) {
	this.number=number;
	this.expiry_month=expiry_month;
	this.setExpiry_year(expiry_year);
	this.ccv_code=ccv_code;
	this.balance=balance;
}
	
	public String getNumber() {
		return number;
	}

	public String getCcv_code() {
		return ccv_code;
	}
	public void setCcv_code(String ccv_code) {
		this.ccv_code = ccv_code;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double d) {
		balance=d;
	}

	public int getExpiry_year() {
		return expiry_year;
	}

	public void setExpiry_year(int expiry_year) {
		this.expiry_year = expiry_year;
	}
	

}
