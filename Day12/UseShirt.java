package Day12;

public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt1 = new Shirt();
		shirt1.brand = "OTTO";
		shirt1.price = 700;
		shirt1.color = "Black";
		shirt1.isChecked = false;
		Shirt shirt2 = new Shirt();
		shirt2.brand = "POLO";
		shirt2.price = 1000;
		shirt2.color = "Blue";
		shirt2.isChecked = true;
		Shirt shirt3 = new Shirt();
		shirt3.brand = "RAMRAJ";
		shirt3.price = 500;
		shirt3.color = "White";
		shirt3.isChecked = false;
		Shirt[] shirts = { shirt1, shirt2, shirt3 };
		int lowPrice = shirt1.price;
		Shirt lowShirt = null;
		//Shirt vow = null;
		for (Shirt i : shirts) {
			/*
			 * if (lowPrice < shirt.price) { lowPrice = shirt.price; lowShirt = shirt;
			 */
			if (i.brand.contains("A") || i.brand.contains("E") || i.brand.contains("O") || i.brand.contains("U")) {
				System.out.println(i.brand+" is contains vowel");
			}
		}
		//System.out.println(lowShirt.brand);
		// System.out.println("The lowest shirt "+lowShirt.brand+"\n"+"Price
		// "+lowShirt.price+"\n"+"Colour "+lowShirt.color+"\n"+"Checked
		// "+lowShirt.isChecked);
	}

}
