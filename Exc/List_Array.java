package Exc;

import java.util.ArrayList;
import java.util.List;

public class List_Array {
	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("Karthik");
		name.add("Sathya");
		name.add("Mani");
		name.add("Ravi");
		Object[] names=name.toArray();
		for(Object i:names) {
			System.out.println(i);
		}
		
	}

}
