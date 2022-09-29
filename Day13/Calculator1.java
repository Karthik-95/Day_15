package Day13;

public class Calculator1 {
	/*public int add (int number,int number1) {
		return number+number1;
	}
	public static void main(String[] args) {
		Calculator1 calculator=new Calculator1();
		System.out.println(calculator.add(15,25));
	}*/
	/*public boolean max(int num,int num1) {
		return num>num1;
	}
	public static void main(String[] args) {
		Calculator1 calculator=new Calculator1();
		System.out.println(calculator.max(15, 25));
	}*/
	/*public String add(String name,String name1) {
		return name.concat(name1);
	}
	public static void main(String[] args) {
		Calculator1 calc=new Calculator1();
		System.out.println(calc.add("Karthik","Kumar" ));
	}*/
	public char check(String name,int name1) {
		return name.charAt(name1);
		
	}
	public static void main(String[] args) {
		Calculator1 calc=new Calculator1();
		System.out.println(calc.check("Karthik", 0));
	}

}
