package Exception1;

public class Nullpoint {
	public static void main(String[] args) {
		String a=null;
		System.out.println(a);
		try {
		int b=a.length();
		}catch(NullPointerException az) {
			System.out.println(az);
		}
	}

}
