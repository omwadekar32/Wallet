<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <link rel="stylesheet" href="style.css">
    <title>Credit/Debit Wallet</title>
</head>
<body>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Credit/Debit Wallet</title>
</head>
<body>
      <form id="transaction-form" action="service.jsp">
    <div class="container">
        <h1>Wallet</h1>
        <div class="balance-section">
            <input type="submit" value="Check Balence" id=bal name="Balence">
        </div>
        <div class="actions-section">
            <h2>Actions</h2>
                <label for="amount">Amount:</label>
                <input type="number" id="amount" name=amt step="0.01" >
                <div class="link1">

                    <input type="submit" value="Deposit" id=depo name="Deposit">
                    <input type="submit" value="Withdraw" id=with  name="Withdraw">
                </div>
               
        </div>
        <div class="transaction-section">
            <h2>Transactions</h2>
            <ul id="transaction-list">
             <input type="submit" value="View Transation History" id="tran" name="Transation">
                <!-- Transaction history will be added dynamically here -->
            </ul>
        </div>
    </div>
            </form>
    <script src="script.js"></script>
</body>
</html>
