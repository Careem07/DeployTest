<!DOCTYPE html>
<html>
<head>
    <title>ATM Login</title>
    <style>
        body {
            background-color: #f2f2f2;
        }

        h1 {
            font-size: 32px;
            text-align: center;
            margin-top: 50px;
            color: #555;
        }

        form {
            background-color: #fff;
            width: 400px;
            margin: 0 auto;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px #999;
            margin-top: 50px;
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-top: 10px;
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
<h1>ATM Login</h1>
<form action="login" method="post">
    <label for="username">Username</label>
    <input type="text" id="username" name="username" placeholder="Enter your username">

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Enter your password">

    <input type="submit" value="Login">
</form>
</body>
</html>
