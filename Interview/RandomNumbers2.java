package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbers2 {
	public static void main(String[] args) {
		List<String>n=Arrays.asList("Karthik","Ravi","Sathya","Saravanan","Thrisha","Viji");
		Random ran=new Random();
		//IntStream ints=ran.ints(5,1000,6000);
		n.forEach(x->System.out.println("OTP for "+x+" is "+ran.nextInt(1000,2000)));
	}

}
