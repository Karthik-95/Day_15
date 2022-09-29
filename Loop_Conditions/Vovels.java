package Loop_Conditions;

public class Vovels {
	public static void main(String[] args) {
		String word="karthik";
		int vovelsCount=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
				vovelsCount=vovelsCount+1;
			}
		}
		System.out.println(vovelsCount);
	}

}
