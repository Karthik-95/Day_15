package Excersize;

import java.util.ArrayList;
import java.util.List;

public class Karthik_k {
	public static void main(String[] args) {
		int []a= {1,2,3,1,5,4,8,5,6,6,5,7,8};
		List<Integer>temp=new ArrayList<>();
		List<Integer>newx=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			/*int tempx=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i!=j) {
					tempx=a[i];
				}
			}*/
			temp.add(a[i]);
		}
		System.out.println(temp);
		temp.stream().distinct().forEach(x->newx.add(x));
		System.out.println(newx);
	}

}
