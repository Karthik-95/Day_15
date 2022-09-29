package Loop_Conditions;

public class JumbingContinue {
	public static void main(String[] args) {
		int num=10;
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
