package Interview;

public class FirstRepeatingChar {
	public static void main(String[] args) {
		String str="The King Maker";
		Boolean isFound=false;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)&& i!=j) {
					System.out.println(str.charAt(i)+" - is the first repeating Character");
					isFound=true;
					break;
				}
			}
			if(isFound) {
				break;
			}
		}
	}

}
