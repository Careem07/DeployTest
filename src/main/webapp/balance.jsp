<%--
  Created by IntelliJ IDEA.
  User: karee
  Date: 3/25/2023
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Balance</title>
  <style>
    body {
      background-color: #f2f2f2;
      font-family: Arial, sans-serif;
      font-size: 16px;
    }

    .card {
      background-color: #fff;
      width: 300px;
      margin: 50px auto;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 0 10px #999;
      text-align: center;
      cursor: pointer;
    }

    .card:hover {
      box-shadow: 0 0 20px #666;
    }

    h2 {
      font-size: 24px;
      margin-bottom: 20px;
      color: #555;
    }

    form {
      display: flex;
      flex-direction: column;
      align-items: center;
      margin-top: 20px;
    }

    label {
      font-size: 18px;
      margin-bottom: 10px;
      color: #555;
    }

    input[type="text"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 20px;
      border: none;
      border-radius: 4px;
      box-sizing: border-box;
      box-shadow: 0 0 5px #ccc;
    }

    input[type="submit"] {
      background-color: #4CAF50;
      color: #fff;
      padding: 10px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-size: 18px;
      width: 100%;
    }
  </style>
</head>
<body>
  <div class="card">
    <h2>Your Balance is ${balance}</h2>
  </div>
</body>
</html>
