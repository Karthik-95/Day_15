package Enhanced_Forloop;

public class Fibonacy1 {
	public static void main(String[] args) {
		int num1=0;
		int num2=20;
		int num3=0;
		System.out.println(num3);
		for(int i=1;i<=10;i++) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}

}
