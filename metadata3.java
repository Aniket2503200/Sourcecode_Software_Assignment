package in.sp.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class metadata3 {
	public static void main(String[] args) {
		Connection connection = null;
		ResultSet tables = null;
		ResultSet columns = null;
		ResultSet types = null;
		ResultSet primaryKeys = null;
		ResultSet procedures = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/metadata_db", "root", "oneplus11R");
			DatabaseMetaData metaData = connection.getMetaData();

			// Get tables
			tables = metaData.getTables(null, null, "%", new String[] { "TABLE" });
			System.out.println("Tables:");
			while (tables.next()) {
				String tableName = tables.getString("TABLE_NAME");
				System.out.println(" - " + tableName);
			}

			// Get columns for a specific table
			String specificTable = "metadata2"; // Name of table ************************
			columns = metaData.getColumns(null, null, specificTable, "%");
			System.out.println("\nColumns in " + specificTable + ":");
			while (columns.next()) {
				String columnName = columns.getString("COLUMN_NAME");
				String columnType = columns.getString("TYPE_NAME");
				int columnSize = columns.getInt("COLUMN_SIZE");
				System.out.println(" - " + columnName + " (" + columnType + "(" + columnSize + "))");
			}

			// Get type info
			types = metaData.getTypeInfo();
			System.out.println("\nTypes:");
			while (types.next()) {
				String typeName = types.getString("TYPE_NAME");
				System.out.println(" - " + typeName);
			}

			// Get primary keys for a specific table
			primaryKeys = metaData.getPrimaryKeys(null, null, specificTable);
			System.out.println("\nPrimary keys in " + specificTable + ":");
			while (primaryKeys.next()) {
				String primaryKeyColumn = primaryKeys.getString("COLUMN_NAME");
				System.out.println(" - " + primaryKeyColumn);
			}

			// Get procedures
			procedures = metaData.getProcedures(null, null, "%");
			System.out.println("\nProcedures:");
			while (procedures.next()) {
				String procedureName = procedures.getString("PROCEDURE_NAME");
				System.out.println(" - " + procedureName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (tables != null)
					tables.close();
				if (columns != null)
					columns.close();
				if (types != null)
					types.close();
				if (primaryKeys != null)
					primaryKeys.close();
				if (procedures != null)
					procedures.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
