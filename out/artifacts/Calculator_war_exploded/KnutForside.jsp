<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 23/10/2020
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="KnutForside.css">
</head>

<body>
<div class="container">
    <button class="btn btn1"><a href="<%=request.getContextPath()%>/hentEn">Utøver</a></button>
    <button class="btn btn3"><a href="trenerpage.jsp">Trener</a></button>
    <button class="btn btn2"><a href="superPage.jsp">Superadmin</a></button>
</div>
</body>
</html>
