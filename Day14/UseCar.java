package Day14;

public class UseCar {
	public static void main(String[] args) {
		Engine engine=new Engine();
		engine.brand="ford";
		engine.price=50000;
		engine.engineCc=500;
		Car car=new Car();
		car.brand="ford";
		car.color="Black";
		car.price=500000;
		car.engine=engine;
		System.out.println(car.engine.brand);
	}

}
