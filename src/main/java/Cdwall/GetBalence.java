package Cdwall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetBalence {
	
	private static int bal;

	public static int getBal() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("here");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("  select Balence from userwallet where Date <= CURRENT_TIMESTAMP GROUP BY UId ORDER BY Date DESC LIMIT 1;");
			rs.next();
			bal=rs.getInt(1);
			System.out.println(bal);
			
			System.out.println("Daatabase sucess");
			
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Daatabase error");
		}
		
		return bal;
	}

}
