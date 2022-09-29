package Tasks;

public class VariableArgumends {
	static void add(int ...nums) {
		for(int i:nums) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		add(1,3,6,8,5,6,5);
	}

}
