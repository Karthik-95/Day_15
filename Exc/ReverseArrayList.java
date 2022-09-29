package Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayList {
	public static void main(String[] args) {
		List<Integer>num=new ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer>rev=new ArrayList<>();
		for(int i=num.size()-1;i>=0;i--) {
			rev.add(num.get(i));
		}
		System.out.println(rev);
	}

}
