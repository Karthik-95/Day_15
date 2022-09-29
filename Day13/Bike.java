package Day13;

public class Bike {
	String brand;
	int price;
	int speed;
	int taxAmount;
	public void bikeDetails(Bike[] bikes) {
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i].brand+" "+(bikes[i].price+bikes[i].taxAmount));
		}
	}
}


