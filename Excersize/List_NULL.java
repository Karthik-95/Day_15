package Excersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class List_NULL {
	public static void main(String[] args) {
		List<String>names=new ArrayList<>(
		Arrays.asList("KARTHIK",null,"Sathya",null,"Thrisha",null));
		System.out.println(names);
		while(names.remove(null)){
		}
		System.out.println(names);
		Set<String>k=names.stream().collect(Collectors.toSet()).forEach(x->x.sys);
		
	}

}
