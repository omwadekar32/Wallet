package Cdwall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Credit implements IUserCredit {

	@Override
	public int userCredit(int value) {
		// TODO Auto-generated method stub
		
		int val=value;
		int bal=GetBalence.getBal();
		bal=bal+val;
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("here");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet","root","root");
			Statement st=con.createStatement();
			st.executeUpdate(" insert into userwallet value(null,'om',curdate(),"+val+",0,"+bal+");");
			System.out.println("here");
			
			System.out.println("Daatabase sucess");
			
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Daatabase error");
		}
		
		return 0;
	}

}
