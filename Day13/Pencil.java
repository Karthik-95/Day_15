package Day13;

public class Pencil {
	String brand;
	String color;
	int price;
	public void details(Pencil[] pencils) {
		for(int i=0;i<pencils.length;i++) {
			if(pencils[i].price>20) {
				System.out.println(pencils[i].brand);
			}
			else {
				System.out.println(pencils[i].color);
			}
		}
	}

}
