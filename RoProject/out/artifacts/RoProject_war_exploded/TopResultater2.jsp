<%--
  Created by IntelliJ IDEA.
  User: Julie
  Date: 13.11.2020
  Time: 00:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Top score</title>
</head>
<body>
<sql:setDataSource
        var="roprosjekt"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/roprosjekt"
        user="root" password="Semester3!"
/>

<sql:query var="list_testresultater" dataSource="${roprosjekt}">
    SELECT * FROM score;
</sql:query>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>Score</h2></caption>
        <tr>
            <th>score</th>

        </tr>
        <tr>
        <c:forEach var="testresultater" items="${listTestresultater.rows}">
            <c:out value="${score}" />
        </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>
