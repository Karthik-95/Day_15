package Interview;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbers {
	public static void main(String[] args) {
		Random r=new Random();
		/*for(int i=0;i<10;i++) {
		System.out.println(r.nextInt());
		}
		IntStream ints=r.ints(10,20000,30000);
		ints.forEach(x->System.out.println(x));*/
		int i=0;
		while(i<11) {
			System.out.println(r.nextInt(212100,212110));
			i++;
		}
	}

}
