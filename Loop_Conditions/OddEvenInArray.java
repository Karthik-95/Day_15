package Loop_Conditions;

public class OddEvenInArray {
	public static void main(String[] args) {
		int[] num= {10,25,62,52,85,100};
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.println("Even Num "+num[i]);
			}
			else {
				System.out.println("Odd Num "+num[i]);
			}
		}
	}

}
