package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class student_example {
	public static void main(String args[]) throws Exception

	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root",
				"oneplus11R");

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into student values (7,'jayesh','24')");

		int result = stmt.executeUpdate("update student set name='shubham', age='29' where id =2");
		result = stmt.executeUpdate("delete from student where id=4");

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