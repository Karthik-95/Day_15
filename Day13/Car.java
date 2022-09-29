package Day13;

public class Car {
	String brand;
	String color;
	int price;
	int discountPercentage;
	
	public void carNetPrice(Car[]cars) {
		int max=0;
		int x=0;
		for(int i=0;i<cars.length;i++) {
			if(cars[i].price>max) {
			max=cars[i].price;
			x=i;
			}
		}
			System.out.println(cars[x].brand);
			//System.out.println(cars[i].brand+"-"+(cars[i].price+cars[i].price*cars[i].discountPercentage/100));
		
	}
}
	


