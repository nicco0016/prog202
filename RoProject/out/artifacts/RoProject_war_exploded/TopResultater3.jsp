<%--
  Created by IntelliJ IDEA.
  User: Julie
  Date: 13.11.2020
  Time: 00:24
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Top score</title>
</head>
<body>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String Host = "jdbc:mysql://localhost:3306/roprosjekt";
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        connection = DriverManager.getConnection(Host, "root", "Semester3!");
        statement = connection.createStatement();
        String Data = "SELECT MAX(score)FROM roprosjekt";
        rs = statement.executeQuery(Data);
%>
<TABLE border="1">
    <tr width="10" bgcolor="#9979">
        <td>maximum score</td>
    </tr>
    <%
        while (rs.next()) {
    %>
    <TR>
        <TD><%=rs.getString("MAX(score)")%></TD>
    </TR>
    <%   }    %>
</table>
<%
        rs.close();
        statement.close();
        connection.close();
    } catch (Exception ex) {
        out.println("Can’t connect to database.");
    }
%>
</body>
</html>