package Loop_Conditions;

public class PositiveAndNegativeCount {
	public static void main(String[] args) {
		int[] values= {-2,-128,285,328,-239,54};
		int count=0;
		int count1=0;
		for(int i=0;i<values.length;i++) {
			if(values[i]>0) {
				//System.out.println(values[i]);
				count++;
			}
			else {
				//System.out.println(values[i]);
				count1++;
			}
		}
		System.out.println("positive count "+count);
		System.out.println("negative count "+count1);
	}

}
