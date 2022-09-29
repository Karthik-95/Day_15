package Day12;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap1 = new Laptop();
		lap1.brand = "LENOVO";
		lap1.price = 35000;
		lap1.model = "L36";
		lap1.isTouchscreen = true;
		Laptop lap2 = new Laptop();
		lap2.brand = "HCL";
		lap2.price = 30000;
		lap2.model = "Hc25";
		lap2.isTouchscreen = false;
		Laptop lap3 = new Laptop();
		lap3.brand = "ACER";
		lap3.price = 32000;
		lap3.model = "A2M";
		lap3.isTouchscreen = false;
		Laptop lap4 = new Laptop();
		lap4.brand = "HP";
		lap4.price = 36000;
		lap4.model = "HP36";
		lap4.isTouchscreen = true;
		Laptop[] laps = { lap1, lap2, lap3, lap4 };
		for (int i = 0; i < laps.length; i++) {
			if (laps[i].isTouchscreen) {
				System.out.println("Touch Screen Laptop : " + laps[i].brand + "\n" + "Price : " + laps[i].price);
			}
		}
	}

}
