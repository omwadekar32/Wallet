package Cdwall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Statement;


public class UserDao implements IUserDao {

	@Override
	public List<User> getUserData(String str) {
		// TODO Auto-generated method stub
		
		List<User> list=new ArrayList <User>();
		System.out.println("here");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("here");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from userwallet;");
			System.out.println("here");
			while(rs.next()) {
				String name=rs.getString("UName");
				Date date=rs.getDate("Date");
				int bal=rs.getInt("Balence");
				int cre=rs.getInt("Credit");
				int deb=rs.getInt("Debit");
				int Id=rs.getInt("UId");
				User e=new User(Id,name,date,cre,deb,bal);
				list.add(e);
			}
			
			System.out.println("Daatabase sucess");
			
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Daatabase error in dao");
		}
		
		
	        
		
		return list;
	
		
	}

}
