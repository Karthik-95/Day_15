package Loop_Conditions;

import java.util.Arrays;

public class demo5 {
	public static void main(String[] args) {
		String[] a= {"5","6","9"};
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=Integer.parseInt(a[i]);
		}
		System.out.println(Arrays.toString(b));
	}

}
