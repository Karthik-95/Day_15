package Day13;

public class UseCar1 {
	public static void main(String[] args) {
		Car1 car1=new Car1();
		car1.brand="BMW";
		car1.color="Black";
		car1.price=500000;
		car1.taxAmount=5000;
		//car1.netPrice=(car1.price+car1.taxAmount);
		System.out.println(car1.findNetPrice(car1));
	}

}
