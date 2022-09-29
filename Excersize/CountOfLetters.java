package Excersize;

public class CountOfLetters {
	public static void main(String[] args) {
		String a="Karthik.Smart,1106";
		char[] b=a.toCharArray();
		int x=0;
		int y=0;
		int z=0;
		int w=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]>='a'&&b[i]<='z') {
				x++;
			}
			else if(b[i]>='A'&&b[i]<='Z') {
				y++;
			}
			else if(b[i]>='0'&&b[i]<='9') {
				w++;
			}
			else {
				z++;
			}
		}
		System.out.println("Upper Case Count : "+y+"\n"+"Lower Case Count : "+x+"\n"+"Special Caracter Count : "+z+"\n"+"Numbers Count : "+w);
		
	}

}
