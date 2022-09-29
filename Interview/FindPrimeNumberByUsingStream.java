package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindPrimeNumberByUsingStream {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>(Arrays.asList(1,5,6,2,61,3,8,6,9,5,7,58,65,71,78,65,32,1,12,25,18,64,66));
		List<Integer>k=l.stream().filter(X->X!=1).distinct().filter(FindPrimeNumberByUsingStream::isPrime).collect(Collectors.toList());
		Collections.sort(k);
		System.out.println(k);
		
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
			return false;
			}
		}
		return true;
	}

}
