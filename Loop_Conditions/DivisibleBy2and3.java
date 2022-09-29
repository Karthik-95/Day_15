package Loop_Conditions;

public class DivisibleBy2and3 {
	public static void main(String[] args) {
		int num=100;
		for(int i=0;i<=num;i++) {
			if(i%2==0&&i%3==0) {
				System.out.println(i);
				continue;
			}
			//System.out.println(i);
		}
	}

}
