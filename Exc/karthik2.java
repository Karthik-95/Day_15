package Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class karthik2 {
	public static void main(String[] args) {
		int []a= {1,4,7,8,456,989,98,07};
		List<Integer>k=Arrays.asList(1,4,3,43,45,66,67,98,56);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-2]);
		Collections.sort(k);
		System.out.println(k);
		System.out.println(k.get(k.size()-2));
	}

}
