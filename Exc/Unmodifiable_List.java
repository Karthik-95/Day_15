package Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Unmodifiable_List {
	public static void main(String[] args) {
		List<Integer>num=new ArrayList<>(Arrays.asList(1,2,3,4));
		num.add(5);
		try {
		List<Integer>un=Collections.unmodifiableList(num);
		un.add(6);
		System.out.println(un);
		}catch(UnsupportedOperationException e) {
			System.out.println("Exception : "+e);
		}

	}

}
