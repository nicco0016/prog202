<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 30/10/2020
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="LoggInn.css">
</head>
<body>
<form action="login" method="post">

    <div class="container">
        <label for="brukernavn"><b>Brukernavn:</b></label>
        <input type="text"  id="brukernavn" name="brukernavn" required>

        <label for="passord"><b>Passord:</b></label>
        <input type="password" id="passord" name="passord" required>

        <button type="submit">Logg inn</button>
    </div>
</form>
</body>
</html>
