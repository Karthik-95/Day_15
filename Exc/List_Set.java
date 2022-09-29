package Exc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class List_Set {
	public static void main(String[] args) {
		List<String>name=Arrays.asList("Karthik","Ravi","Mani","Mani");
		//Set<String>set=new HashSet<>(name);
		//System.out.println(set);
		Set<String>set=name.stream().collect(Collectors.toSet());
		System.out.println(set);
	}

}
