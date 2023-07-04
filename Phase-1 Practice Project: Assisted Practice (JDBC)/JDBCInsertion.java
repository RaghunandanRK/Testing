package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertion {

	public static void main(String[] args) throws SQLException 
	{
		String dbUrl = "jdbc:mysql://localhost:3306/movies";
		String username = "root";
		String password = "root";
		String query = "INSERT INTO movies VALUE(\"Finding Nemo\", \"Comedy-Drama\", \"Andrew Stanton\", 2003);";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(dbUrl,username,password);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally {
			con.close();
		}
	}

}
