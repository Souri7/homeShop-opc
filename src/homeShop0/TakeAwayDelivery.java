package homeShop0;

public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

	@Override
	public String getInfo() {

		return "Retrait 0.00";
	}
}
