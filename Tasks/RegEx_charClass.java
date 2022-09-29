package Tasks;

import java.util.regex.Pattern;

public class RegEx_charClass {
	public static void main(String[] args) {
		String a = "Karthik1Ravi";
		String b = "I think";
		String c = "1a2d3s4";

		String[] s = a.split("[0-9]");
		for (String i : s) {
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		String[] s1 = b.split("\\s");
		for (String i : s1) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		String[] s2 = c.split("[a-z]");
		for (String i : s2) {
			System.out.println(i);
		}

	}

}
