package Tasks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day_getDay {
	public static void main(String[] args) throws ParseException {
		String date="11-01-1996";
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
		Date d=format.parse(date);
		System.out.println(d);
	}
}