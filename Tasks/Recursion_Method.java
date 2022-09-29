package Tasks;

public class Recursion_Method {
	static int fact(int n) {
		if(n==1) {
			return n;
		}
		else {
			return (n*fact(n-1));
		}
	}
	public static void main(String[] args) {
		int n=8;
		System.out.println("Factorial of "+n+" is "+fact(n));
	}

}
