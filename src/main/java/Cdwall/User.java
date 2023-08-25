package Cdwall;

import java.util.Date;

public class User {

	private Date date;
	private double Debit;
	private static double Balence;
	private String Uname;
	private int Id;
	
	
	public String getUname() {
		return Uname;
	}


	public void setUname(String uname) {
		Uname = uname;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public static void setBalence(double balence) {
		Balence = balence;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	private double Credit;
	public double getCredit() {
		return Credit;
	}


	public void setCredit(double credit) {
		Credit = credit;
	}


	public double getDebit() {
		return Debit;
	}


	public void setDebit(double debit) {
		Debit = debit;
	}


	
	
	public User(int id, String name, Date date, int cre, int deb, int bal) {

		// TODO Auto-generated constructor stub
		
		this.Uname=name;
		this.date=date;
		this.Credit=cre;
		this.Debit=deb;
		this.Balence=bal;
		this.Id=id;
		
	}


	public String getname() {
		// TODO Auto-generated method stub
		return Uname;
	}


	public static double getBalence() {
		// TODO Auto-generated method stub
		return Balence;
	}


	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}
}
