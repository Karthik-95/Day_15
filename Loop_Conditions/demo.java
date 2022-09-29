package Loop_Conditions;

public class demo {
	public static void main(String[] args) {
		int[] mark= {450,398,420,415,467,470,367,399,400,397
				};
		for(int i=0;i<mark.length;i++) {
			if(mark[i]>=400&&mark[i]<=450) {
				System.out.println(mark[i]);
			}
		}
	}

}
