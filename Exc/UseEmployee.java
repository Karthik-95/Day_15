package Exc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseEmployee {
	public static void main(String[] args) {
		List<Employee>emp=Arrays.asList(new Employee("Karthik",1101,27),new Employee("Ravi",1102,26),new Employee("Sathya",1103,26));
		Collections.sort(emp);;
		System.out.println(emp);
	}

}
