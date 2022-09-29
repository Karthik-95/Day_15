package Exception1;

public class NumberFormat {
	public static void main(String[] args) {
		String a="hi";
		int b=0;
		try {
		b=Integer.parseInt(a);
		}catch(NumberFormatException az) {
			System.out.println(az);
		}
		System.out.println(b);
	}

}
