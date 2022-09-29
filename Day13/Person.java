package Day13;

public class Person {
	public void details(String name, int age, float weight, long number, boolean isMale) {
		System.out.println(name + "\n" + age + "\n" + weight + "\n" + number + "\n" + isMale + "\n");
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.details("Karthik", 25, 60.76f, 9600635501l, true);
		p1.details("Pream", 23, 60.15f, 8365956736l, true);
		/*Person p2 = new Person();
		p2.details("Ravi", 24, 57.65f, 9555366710l, true);*/
	}
	/*
	 * public void details() { String name; int age; float weight; long number;
	 * boolean isMale; }
	 */

}
