package Day13;

public class Car1 {
	String brand;
	String color;
	int price;
	int taxAmount;
	int netPrice;
	public int findNetPrice(Car1 car1) {
		return car1.price+car1.taxAmount;
		
		
	}

}
