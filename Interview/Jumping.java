package Interview;

import java.util.Arrays;
import java.util.List;

public class Jumping {
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(0,0,0,1,0,0,1,0);
		int count=0;
		for(int i=0;i<l.size();i++) {
			if(i%2==0) {
				continue;
			}
			else if(i%2!=0 && l.get(i)!=1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
