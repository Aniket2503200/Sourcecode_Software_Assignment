package in.sp.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rollback2 {
	public static void main(String args[]) throws SQLException {
		// Registering the Driver
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rollback1_db", "root", "oneplus11R");
		System.out.println("Connection established......");
		// Setting the auto commit false
		con.setAutoCommit(false);
		// Creating a Statement object
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		// Retrieving the data
		ResultSet rs = stmt.executeQuery("select * from student2");
		System.out.println("Contents of the table initially");
		while (rs.next()) {
			System.out.print("ID: " + rs.getString("ID") + ", ");
			System.out.print("First_Name: " + rs.getString("First_Name") + ", ");
			System.out.print("Last_Name: " + rs.getString("Last_Name") + ", ");
			System.out.print("Date_Of_Birth: " + rs.getString("Date_Of_Birth") + ", ");
			System.out.print("Place_Of_Birth: " + rs.getString("Place_Of_Birth") + ", ");
			System.out.print("Country: " + rs.getString("Country"));
			System.out.println("");
		}
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO student2 VALUES (?, ?, ?, ?, ?, ?)");
		pstmt.setInt(1, 8);
		pstmt.setString(2, "Aniket");
		pstmt.setString(3, "Ugale");
		pstmt.setDate(4, new Date(386194400000L));
		pstmt.setString(5, "Nashik");
		pstmt.setString(6, "india");
		pstmt.executeUpdate();
		// Committing the transaction
		con.commit();
		// Deleting the record
		stmt.execute("Delete from student2 where id = 8");
		// Rolling back to the save point
		con.rollback();
		// Contents of the table after the roll-back
		System.out.println("Contents of the table");
		rs = stmt.executeQuery("select * from student2");
		while (rs.next()) {
			System.out.print("ID: " + rs.getString("ID") + ", ");
			System.out.print("First_Name: " + rs.getString("First_Name") + ", ");
			System.out.print("Last_Name: " + rs.getString("Last_Name") + ", ");
			System.out.print("Date_Of_Birth: " + rs.getString("Date_Of_Birth") + ", ");
			System.out.print("Place_Of_Birth: " + rs.getString("Place_Of_Birth") + ", ");
			System.out.print("Country: " + rs.getString("Country"));
			System.out.println("");
		}
	}
}