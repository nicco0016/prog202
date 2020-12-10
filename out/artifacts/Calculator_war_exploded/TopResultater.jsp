<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Julie
  Date: 12.11.2020
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<sql:setDataSource
    var="roprosjekt"
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/roprosjekt"
    user="root" password="Semester3!"
/>

<sql:query var="list_testresultater" dataSource="${roprosjekt}">
    SELECT * FROM score;
</sql:query>

<c:forEach var="testresultater" items="${listTestresultater.rows}">
    <c:out value="${score}" />
</c:forEach>


<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
