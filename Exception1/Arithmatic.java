package Exception1;

public class Arithmatic {
	public static void main(String[] args) {
		System.out.println("Hi");
		int a=30;
		int b=0;
		int c=0;
		try {
		c=a/b;
		}catch(ArithmeticException az) {
			//System.out.println(az);
			System.out.println("Dont divide by Zero");
		}
		System.out.println(c);
		System.out.println("Hello");
	}

}
