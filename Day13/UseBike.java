package Day13;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.brand="Honda";
		bike1.price=80000;
		bike1.speed=180;
		bike1.taxAmount=7500;
		Bike bike2=new Bike();
		bike2.brand="TVS";
		bike2.price=95000;
		bike2.speed=200;
		bike2.taxAmount=8200;
		Bike bike3=new Bike();
		bike3.brand="Hero";
		bike3.price=90000;
		bike3.speed=200;
		bike3.taxAmount=8000;
		Bike[] bikes= {bike1,bike2,bike3};
		bike1.bikeDetails(bikes);
		
	}

}
