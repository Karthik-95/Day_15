package Tasks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VariableArgs_2 {
	static void vovels(String ...vov) {
		for(String i:vov) {
			if(i.contains("a")||i.contains("e")||i.contains("i")||i.contains("o")||i.contains("u")) {
				System.out.println(i+" -contains vovel");
			}
			else {
				System.out.println(i+"- Not contains vovel");
			}
		}
	}
	public static void main(String[] args) {
		vovels("Karthik","Sathya","Ravi","Mani","Saravanan");
	}

}
