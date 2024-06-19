package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class resultset_example3 {
	public static void main(String[] args) {
		// SQL query to execute
		String query = "SELECT * FROM products";

		try {
			// Establish a connection to the database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/result_db", "root",
					"oneplus11R");

			// Create a statement to execute the query
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			// Execute the query and get the result set
			ResultSet resultSet = preparedStatement.executeQuery();

			// Get metadata from the result set
			ResultSetMetaData metaData = resultSet.getMetaData();

			// Get the number of columns
			int columnCount = metaData.getColumnCount();
			System.out.println("Number of Columns: " + columnCount);

			// Iterate through columns to get metadata
			for (int i = 1; i <= columnCount; i++) {
				// Get column name
				String columnName = metaData.getColumnName(i);
				System.out.println("Column Name: " + columnName);

				// Get column type
				int columnType = metaData.getColumnType(i);
				System.out.println("Column Type (int): " + columnType);

				// Get column type name
				String columnTypeName = metaData.getColumnTypeName(i);
				System.out.println("Column Type Name: " + columnTypeName);

				// Get table name
				String tableName = metaData.getTableName(i);
				System.out.println("Table Name: " + tableName);

				System.out.println("------------------------------");
			}

			// Close the result set, statement, and connection
			resultSet.close();
			preparedStatement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}