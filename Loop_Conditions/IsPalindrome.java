package Loop_Conditions;

public class IsPalindrome {
	public static void main(String[] args) {
		String word="Amma";
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		if(word.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
