package Exception1;

public class IndexoutofBounds {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		String b="Karthik";
		int c=0;
		char d=0;
		try {
		c=a[4];
		d=b.charAt(7);
		}catch(StringIndexOutOfBoundsException az) {
			System.out.println(az);
		}catch(ArrayIndexOutOfBoundsException ax) {
			System.out.println(ax);
		}
		System.out.println(c);
		System.out.println(d);
	}

}
