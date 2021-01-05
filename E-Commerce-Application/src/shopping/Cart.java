package shopping;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> purchased_items;
	
public Cart() {
	purchased_items= new ArrayList<Product>();
}

public void addItem(Product pd) {
	purchased_items.add(pd);
}

public ArrayList<Product> getPurchasedItems(){
	return purchased_items;
}
	
}
