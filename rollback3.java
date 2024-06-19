package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rollback3 {
	public static void main(String args[]) {
		// JDBC connection variables
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;

		try {
			// Registering the Driver (Optional in JDBC 4.0+)
			// DriverManager.registerDriver(new com.mysql.jdbc.Driver());

			// Establishing connection to the database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rollback1_db", "root", "oneplus11R");
			System.out.println("Connection established...");

			// Setting auto commit to false to manage transactions
			con.setAutoCommit(false);

			// Creating a statement object with scroll-sensitive and updatable result set
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// Retrieving and printing initial contents of the table
			rs = stmt.executeQuery("SELECT * FROM employee");
			System.out.println("Contents of the table initially:");
			while (rs.next()) {
				System.out.print("ID: " + rs.getInt("ID") + ", ");
				System.out.print("First_Name: " + rs.getString("First_Name") + ", ");
				System.out.print("Last_Name: " + rs.getString("Last_Name"));
				System.out.println();
			}

			// Inserting a new record into the employee table
			pstmt = con.prepareStatement("INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?)");
			pstmt.setInt(1, 8);
			pstmt.setString(2, "Aniket");
			pstmt.setString(3, "Ugale");
			pstmt.setNull(4, java.sql.Types.DATE); // Assuming Date_Of_Birth is nullable
			pstmt.setNull(5, java.sql.Types.VARCHAR); // Assuming Place_Of_Birth is nullable
			pstmt.setNull(6, java.sql.Types.VARCHAR); // Assuming Country is nullable
			pstmt.executeUpdate();

			// Committing the transaction
			con.commit();
			System.out.println("Transaction committed successfully.");

			// Deleting the newly inserted record (just for demonstration purposes)
			stmt.execute("DELETE FROM employee WHERE id = 8");
			System.out.println("Record deleted successfully.");

			// Rolling back the changes to the save point
			con.rollback();
			System.out.println("Rollback performed.");

			// Displaying the contents of the table after rollback
			rs = stmt.executeQuery("SELECT * FROM employee");
			System.out.println("Contents of the table after rollback:");
			while (rs.next()) {
				System.out.print("ID: " + rs.getInt("ID") + ", ");
				System.out.print("First_Name: " + rs.getString("First_Name") + ", ");
				System.out.print("Last_Name: " + rs.getString("Last_Name"));
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				// Rolling back in case of an exception
				if (con != null) {
					System.err.println("Transaction is being rolled back.");
					con.rollback();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} finally {
			// Closing resources in finally block
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
