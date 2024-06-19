package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String args[]) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newmorning", "root", "oneplus11R");

		PreparedStatement ps = con.prepareStatement("insert into student values('kishor','kathar')");
		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("Update success");
		} else {
			System.out.println("Fail");
		}
		con.close();

	}
}