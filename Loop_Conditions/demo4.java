package Loop_Conditions;

import java.util.Arrays;

public class demo4 {
	public static void main(String[] args) {
		int[] num= {20,40,60,80,10,17,100};
		int max=num[0];
		int max1=0;
		int max2=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
			//if(num[i]<max) {
				max=num[i];
			}
		}
		Arrays.sort(num);
				System.out.println(Arrays.toString(num));
		System.out.println(num[num.length-3]);
		System.out.println(max);
	}

}
