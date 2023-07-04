package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate 
{
	public static void main(String[] args) throws SQLException 
	{
		String dbUrl = "jdbc:mysql://localhost:3306/movies";
		String username = "root";
		String password = "root";
		String query = "UPDATE movies SET genre = 'comdey Drama' where title = 'Finding Nemo'";
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
