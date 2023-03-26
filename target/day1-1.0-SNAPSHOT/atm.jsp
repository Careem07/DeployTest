<%--
  Created by IntelliJ IDEA.
  User: karee
  Date: 3/25/2023
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>ATM Operations</title>
    <style>
        body {
            background-color: #f2f2f2;
            font-family: Arial, sans-serif;
            font-size: 16px;
        }

        h1 {
            font-size: 32px;
            text-align: center;
            margin-top: 50px;
            color: #555;
        }

        .container {
            display: flex;
            flex-wrap: wrap;
            margin: 0 auto;
            max-width: 800px;
            justify-content: center;
            margin-top: 50px;
        }

        .card {
            background-color: #fff;
            width: 300px;
            margin: 20px;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px #999;
            text-align: center;
            cursor: pointer;
        }

        .card:hover {
            box-shadow: 0 0 20px #666;
        }

        .card h2 {
            font-size: 24px;
            margin-bottom: 20px;
            color: #555;
        }

        .card p {
            font-size: 16px;
            margin-bottom: 20px;
            color: #777;
        }
    </style>
</head>
<body>
<h1>${user}</h1>
<div class="container">
    <a href="withdraw.jsp">
    <div class="card">
        <h2>Withdraw</h2>
        <p>Select this option to withdraw cash from your account</p>
    </div>
    </a>
    <a href="deposite.jsp">
    <div class="card">
        <h2>Deposit</h2>
        <p>Select this option to deposit cash or checks into your account</p>
    </div>
    </a>
    <a href="balance">
    <div class="card">
        <h2>Balance Inquiry</h2>
        <p>Select this option to check your account balance</p>
    </div>
    </a>
    <div class="card">
        <h2>Transfer</h2>
        <p>Select this option to transfer money between accounts or to another person</p>
    </div>
</div>
</body>
</html>

