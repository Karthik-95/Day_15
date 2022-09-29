package Day13;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="Honda";
		car1.color="Black";
		car1.price=5000000;
		car1.discountPercentage=5;
		Car car2=new Car();
		car2.brand="BMW";
		car2.color="Red";
		car2.price=6000000;
		car2.discountPercentage=4;
		Car car3=new Car();
		car3.brand="Audi";
		car3.color="Blue";
		car3.price=7000000;
		car3.discountPercentage=6;
		Car[] cars= {car1,car2,car3};
		car1.carNetPrice(cars);
	}

}
