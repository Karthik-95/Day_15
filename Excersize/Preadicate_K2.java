package Excersize;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Preadicate_K2 {
	public static void main(String[] args) {
		List<String>names=Arrays.asList("Karthik","Kavi","Keerthana","Maha","Thrisha","Viji","Santhiya","Sathya");
		Predicate<String>p=(k)->k.startsWith("K");
		for(String s:names) {
			if(p.test(s))System.out.println(s);
		}
	}

}
