package Loop_Conditions;

public class demo3 {
	public static void main(String[] args) {
		int count=0;
		String[] word= {"boxes","flowers","ship","wishes"};
		for(int i=0;i<word.length;i++) {
			if(word[i].endsWith("s")||word[i].endsWith("es")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
