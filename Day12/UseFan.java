package Day12;

public class UseFan {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.brand = "Usha";
		fan1.price = 2000;
		fan1.color = "brown";
		fan1.isWarranty = true;
		Fan fan2 = new Fan();
		fan2.brand = "Orient";
		fan2.price = 2500;
		fan2.color = "Black";
		fan2.isWarranty = true;
		Fan fan3 = new Fan();
		fan3.brand = "G fan";
		fan3.price = 1500;
		fan3.color = "White";
		fan3.isWarranty = false;
		/*
		 * Fan[] fans = new Fan[3]; fans[0] = fan1; fans[1] = fan2; fans[2] = fan3;
		*/
		Fan[] fans = { fan1, fan2, fan3 };
		int maxPrice = 0;
		int I = 0;
		for (int i = 0; i < fans.length; i++) {
			if (fans[i].price > maxPrice) {
				maxPrice = fans[i].price;
				I = i;
			}
		}
		// maxPrice = maxPrice - (maxPrice * 5 / 100);
		// System.out.println("The Highest Price is " + maxPrice);
		maxPrice = maxPrice + (maxPrice * 5 / 100);
		System.out.println("The highest price is " + maxPrice + "\n" + "The Brand Name is " + fans[I].brand + "\n"
				+ "Colour " + fans[I].color + "\n" + "Warranty " + fans[I].isWarranty);
	
	
		
	
	
	}

}
