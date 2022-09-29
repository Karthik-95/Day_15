package Loop_Conditions;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=25;
		String isPrime="";
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime="yes";
			}
		}
		if(isPrime.equals("yes")) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
