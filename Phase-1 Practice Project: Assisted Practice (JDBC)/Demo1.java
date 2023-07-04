package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/movies"; //connection string
		String username="root";
		String password = "root";
		String query = "Call SelectAllMovies;";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password); //connecting DB
		Statement stmt = con.createStatement(); //Execute the query
		ResultSet rs =  (stmt).executeQuery(query); //Save the result after executing the query
		
		while (rs.next())
		{
			System.out.print("Title: " + rs.getString("title") + "\t");
			System.out.print("Genre: " + rs.getString("genre") + "\t");
			System.out.print("Director: " + rs.getString("Director") + "\t");
			System.out.println("Release Year: " + rs.getString("release_year"));
		}
		
		
	}
	}


