package Loop_Conditions;

public class OddandEvennum {
	public static void main(String[] args) {
		int number=10;
		int oddCount=0;
		int evenCount=0;
		for(int i=0;i<=number;i++) {
			if(i%2==0) {
				evenCount=evenCount+1;
			}
			else {
				oddCount=oddCount+1;
			}
		}
		System.out.println("No of Even numbers "+evenCount);
		System.out.println("No of Odd numbers "+oddCount);
	}

}
