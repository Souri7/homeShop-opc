package homeShop0;

public class Main {
	public static void main(String[] arg) {
	Product cafe = new Product("senseo", "noire, une ou deux tasse", 45 );
	Fridge frigo = new Fridge ("curtiss", "blanc, 130L, A+", 299 , 130, true);
	
	Customer client = new Customer ("jean jean", "ici ou la bas");
	
	Bill bill = new Bill (client, null);
	
	bill.addProduct(frigo, 2);
	bill.addProduct(cafe, 1);
	
}
}