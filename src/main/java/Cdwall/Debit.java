package Cdwall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Debit implements IUserDebit {

	@Override
	public int userDebit(int value) {
		// TODO Auto-generated method 

		int val=value;
		int bal=GetBalence.getBal();
		
		if(val < bal) {		
		try {
			
			bal=bal-val;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("here");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet","root","root");
			Statement st=con.createStatement();
			st.executeUpdate(" insert into userwallet value(null,'om',curdate(),0,"+val+","+bal+");");
			System.out.println("here");
			
			System.out.println("Daatabase sucess");
			
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Daatabase error");
		}
		return 0;
		}else {
			return 1;
		}
	}

}
