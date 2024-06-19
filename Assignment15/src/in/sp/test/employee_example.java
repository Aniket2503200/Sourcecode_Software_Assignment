package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class employee_example {
	public static void main(String args[]) throws Exception

	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe_db", "root",
				"oneplus11R");

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into employe values (7, 'Shubham',5200)");

		int result = stmt.executeUpdate("update employe set FirstName='Aniket', Salary=20000 where id =1");
		result = stmt.executeUpdate("delete from employe where id=4");

		System.out.println(result + " records affected");

		ResultSet resultSet = stmt.executeQuery("select * from employe");

		while (resultSet.next())

		{

			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
					+ resultSet.getInt(4));

			connection.close();
		}
	}

}