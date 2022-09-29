package Day14;

public class Coil {
	private String brand;
	private int price;
	private String material;
	public Coil(String brand,int price,String material) {
		this.brand=brand;
		this.price=price;
		this.material=material;
	}
	public String toString() {
		return brand+price+material;
		
	}

}
