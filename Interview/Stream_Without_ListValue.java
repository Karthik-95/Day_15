package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Without_ListValue {
	public static void main(String[] args) {
		List<Integer>emp=Arrays.asList(1,2,3,4,5,6,5);
		emp.stream().filter(x->x==8).collect(Collectors.toList()).forEach(x->System.out.println(x));;
		System.out.println(emp);
	}

}
