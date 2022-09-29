package Exc;

import java.util.ArrayList;
import java.util.List;

public class Remove_duplicates {
	public static void main(String[] args) {
		List<Integer>num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(2);
		num.add(1);
		List<Integer>num_new=new ArrayList<>();
		num.forEach(x->{
			if(!num_new.contains(x)) {
				num_new.add(x);
			}
		});
		System.out.println(num_new);
	}

}
