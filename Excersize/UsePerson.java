package Excersize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UsePerson {
	public static void main(String[] args) {
		List<Person>p=new ArrayList<>();
		p.add(new Person("Karthik",27));
		p.add(new Person("Sathya",26));
		p.add(new Person("Ravi",27));
		p.add(new Person("Saravanan",25));
		Collections.sort(p,Collections.reverseOrder());
		for(Person i:p) {
			System.out.println(i);
		}
	}

}
