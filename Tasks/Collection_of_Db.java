package Tasks;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.bidi.Connection;

public class Collection_of_Db {
	public static void main(String[] args) throws SQLException {

		// 1)first create connection to data base
		java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik", "root",
				"root");
		// 2)create statement write on query

		Statement statement = connection.createStatement();

		// String ks="INSERT INTO bank_info VALUES(6,'chennai','ch65458')";
		// //insert add one data
		// String s="UPDATE bike_information SET bike_price=2500000 where id=5";
		// //update add one data
		// String s="DELETE FROM bike_information where id=6"; //delete one data

		String s = "select * FROM bank_info";
		// 3)execute the statement query and store data and result data
		// statement.execute(ks);
		ResultSet rs = statement.executeQuery(s);
		while (rs.next()) {
			int id = rs.getInt("id");
			String branch = rs.getString("branch");
			String ifsc_code = rs.getString("ifsc_code");

			System.out.println(id + "   " + branch + "  " + ifsc_code);
		}

		// 4)closed connection
		// connection.close();

		System.out.println("\n"+"Query Executed");
	}

}
