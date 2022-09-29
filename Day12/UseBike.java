package Day12;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.brand = "HERO";
		bike1.speed = 120;
		bike1.color = "Black";
		bike1.regnum = "TN31MY2536";
		Bike bike2 = new Bike();
		bike2.brand = "TVS";
		bike2.speed = 200;
		bike2.color = "Red";
		bike2.regnum = "KL23AP6536";
		Bike bike3 = new Bike();
		bike3.brand = "BAJAJ";
		bike3.speed = 300;
		bike3.color = "Blue";
		bike3.regnum = "TN36TJ9654";
		Bike[] bikes = { bike1, bike2, bike3 };
		for (int i = 0; i < bikes.length; i++) {
			if (bikes[i].regnum.startsWith("TN")) {
				System.out.println("Bike Name = " + bikes[i].brand + "\n" + "Bike Speed = " + bikes[i].speed + "\n"
						+ "Bike Register Number = " + bikes[i].regnum);
				System.out.println("\n");
			}
		}
	}

}
