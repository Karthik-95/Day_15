package Day14;

public class Fan {
	private String brand;
	private int price;
	private Coil coil;

	public Fan(String brand, int price, Coil coil) {
		this.brand = brand;
		this.price = price;
		this.coil = coil;
	}

	public String toString() {
		return brand +"\n"+ price + coil;
	}
}
