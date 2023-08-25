<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="Cdwall.Credit" %>
   <%@ page import="Cdwall.GetBalence" %>
   <%@ page import="Cdwall.Debit" %>
   <%@ page import="Cdwall.UserDao" %>
   <%@ page import="java.util.ArrayList" %>
   <%@ page import="Cdwall.User" %>
   <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="sty.css">
<title>Insert title here</title>
</head>
<body>

<%



if(request.getParameter("Deposit") != null){
	Integer amount=Integer.valueOf(request.getParameter("amt"));
	
	Credit c=new Credit();
	c.userCredit(amount);
	%>
    <script>
        alert("Amount Deposited Successfully");
    </script>
	<%
	
	
}else if(request.getParameter("Withdraw") != null){
	out.println("Withdraw");
	Integer amount=Integer.valueOf(request.getParameter("amt"));
	Debit b=new Debit();
	b.userDebit(amount);
	%>
	 <script>
        alert("Amount Withdrawn Successfully");
    </script>
		<%
}else if(request.getParameter("Balence") != null){
	int balance = GetBalence.getBal();
	%>
	 <script>
       alert("Balence is"+ <%= balance%>);
   </script>
		<%
}
else if(request.getParameter("Transation") != null){
	UserDao U=new UserDao();
	List<User> li=new ArrayList<User>();
	
	li=U.getUserData("om");
	

	
%>
<table boarder="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Date and Time</th>
<th>Credit</th>
<th>Debit</th>
<th>Balence<th>
</tr>
<%  for(User u : li){ %>
<tr>
<td><%= u.getId() %></td>
<td><%= u.getname() %></td>
<td><%= u.getDate() %></td>
<td><%= u.getCredit() %></td>
<td><%= u.getDebit() %></td>
<td><%= u.getBalence() %></td>
</tr>
<%} %>
</table>
<%
}

%>
</body>
</html>