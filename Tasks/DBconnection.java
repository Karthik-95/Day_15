package Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBconnection {
	public static void main(String[] args) {
		try {
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","root");
	System.out.println("Connection With DataBase Successfully done");
	PreparedStatement pre=connection.prepareStatement("insert in to karthik value()");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error while connecting to the DB");
		}
	}
}
