package Day14;

public class Computer {
	private String brand;
	private int price;
	private CPU cpu;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setCPU(CPU cpu) {
		this.cpu=cpu;
	}
	public CPU getCPU() {
		return this.cpu;
	}

}
