package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class parent_example {
	public static void main(String args[]) throws Exception

	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parent_db", "root",
				"oneplus11R");

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into parnet values (4, 'Aniket', 'Aniket@gmail.com','123456','near Ekant hotel')");

		int result = stmt.executeUpdate("update parnet set parnet_name='Aniket', email='Aniket@gmail.com' where id =1");
		result = stmt.executeUpdate("delete from parnet where id=8");

		System.out.println(result + " records affected");

		ResultSet resultSet = stmt.executeQuery("select * from parnet");

		while (resultSet.next())

		{

			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
					+ resultSet.getInt(4));

			connection.close();
		}
	}

}