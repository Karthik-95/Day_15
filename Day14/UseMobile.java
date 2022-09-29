package Day14;

public class UseMobile {
	public static void main(String[] args) {
		Battery bat=new Battery();
		bat.setBrand("ALVO");
		bat.setPrice(1500);
		bat.setCapacity(5000);
		Mobile mobile=new Mobile();
		mobile.setBrand("REDMI");
		mobile.setColor("BLACK");
		mobile.setPrice(14000);
		mobile.setBattery(bat);
		System.out.println(mobile.getBrand()+"\n"+bat.getBrand());
		System.out.println(mobile.getBattery().getBrand());
	}

}
