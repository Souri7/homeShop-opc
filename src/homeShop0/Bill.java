package homeShop0;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer client;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Customer client, Delivery delivery) {
        this.client = client;
        this.delivery = delivery;
    }

    public void addProduct(Product product, int quantity) {
        this.products.put(product, quantity);
    }

    public Customer getClient() {
        return client;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public double  getTotal() {
    	return 17.2;
}

	public void generate(Writer writerMock) {
		// TODO Auto-generated method stub
		
	}}