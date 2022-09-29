package Day13;

public class UsePencil {
	public static void main(String[] args) {
		Pencil pencil1=new Pencil();
		pencil1.brand="Natraj";
		pencil1.color="Black";
		pencil1.price=20;
		Pencil pencil2=new Pencil();
		pencil2.brand="Apsara";
		pencil2.color="Red";
		pencil2.price=25;
		Pencil[] pencils= {pencil1,pencil2};
		pencil1.details(pencils);
	}

}
