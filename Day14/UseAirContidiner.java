package Day14;

public class UseAirContidiner {
	public static void main(String[] args) {
		Compressor compressor=new Compressor();
		compressor.setBrand("Bosch");
		compressor.setPrice(10000);
		compressor.setCapacity(2);
		AirConditiner ac=new AirConditiner();
		ac.SetBrand("VOLTAS");
		ac.setPrice(45000);
		ac.setCompressor(compressor);
		System.out.println(ac.getBrand()+"\n"+ac.getPrice()+"\n"+ac.getCompressor().getBrand());
		
		
	}

}
