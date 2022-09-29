package Loop_Conditions;

public class UpperCaseCount {
	public static void main(String[] args) {
		String name="KarthiK";
		int count=0;
		int count1=0;
		String conName=name.toUpperCase();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==conName.charAt(i)) {
				count=count+1;
			}
			else {
			count1=count1+1;
			}
		}
		System.out.println("no of uppercase "+count);
		System.out.println("no of lowecase "+count1);
	}

}
