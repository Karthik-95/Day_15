package Loop_Conditions;

public class StringArray {
	public static void main(String[] args) {
		String[] day= {"mon","TUE","wed"};
		int count=0;
		for(int i=0;i<day.length;i++) {
			if(day[i].equals(day[i].toUpperCase())) {
				count=count+1;
		
			}
		
		}
		System.out.println(count);
	}

}
