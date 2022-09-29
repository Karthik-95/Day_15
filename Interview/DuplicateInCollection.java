package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInCollection {
	public static void main(String[] args) {
		List<String>name=Arrays.asList("Karthik","Sathya","Saravanan","Karthik");
		name.stream().filter(x->Collections.frequency(name, x)).forEach(System.out::println);
	}

}
