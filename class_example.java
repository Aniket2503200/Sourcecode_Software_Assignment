package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class class_example {
	public static void main(String args[]) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_db", "root",
				"oneplus11R");

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into class values (9, 'Math 101', 'Sanap sir','5:00:00','C102')");

		int result = stmt.executeUpdate(
				"update class set teacher_name='Omkar', room_number='1010',class_name='Math' where id =8");
		result = stmt.executeUpdate("delete from class where id=7");

		System.out.println(result + " records affected");

		ResultSet resultSet = stmt.executeQuery("select * from class");

		while (resultSet.next())

		{

			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
					+ resultSet.getInt(4));

			connection.close();
		}
	}

}