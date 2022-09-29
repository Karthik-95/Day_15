package Loop_Conditions;

public class HighLengthString {
	public static void main(String[] args) {
		String[] name= {"karthik","ravi","selva","mani","prem","mugil","manibarathi"};
		String max=name[0];
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>max.length()) {
			//if(name[i].length()<max.length()){
				max=name[i];
			}
		}
		System.out.println(max);
		System.out.println(max.length());
	}

}
