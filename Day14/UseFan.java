package Day14;

public class UseFan {
	public static void main(String[] args) {
		Coil coil=new Coil("Orient",800,"Copper");
		Fan fan=new Fan("Orient",1400,coil);
		System.out.println(fan);
		//System.out.println(coil);
		
	}

}
