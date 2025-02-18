package unidad4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploConexionBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try	{
			Class.forName("com.mysqul.jdc.Driver"); 
	
		(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/frigopie", "root", "usuario");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from  empleados");
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				System.out.print("ID: " + rs.getInt("id"));
				System.out.print(", Age: " + rs.getInt("age"));
				System.out.print(", First: " + rs.getString("first"));
				System.out.println(", Last: " + rs.getString("last"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
