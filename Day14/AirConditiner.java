package Day14;

public class AirConditiner {
	private String brand;
	private int price;
	private Compressor compressor;
			
	public void SetBrand(String brand) {
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
	public void setCompressor(Compressor compressor) {
		this.compressor=compressor;
	}
	public Compressor getCompressor() {
		return this.compressor;
	}

}
