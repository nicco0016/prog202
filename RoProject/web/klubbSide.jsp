<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 12/12/2020
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.utover.alleutovere.objekter.Utover" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Norges Roforbund</title>
    <link rel="stylesheet" type="text/css" href="MineUtovereTrener.css">
</head>
<body>
<header id="main-header">
    <div class="container">
        <h1>Norges Roforbund - Trener</h1>
    </div>
</header>

<nav id="navbar">
    <div class="container">
        <ul>

            <li><a href="nyKlubb.jsp">Legg til ny klubb</a></li>

        </ul>
    </div>
</nav>

<section id="showcase">

    <table>
        <h2>List over alle klubber!</h2>

        <br>


        <thead>
        <tr>
            <th>Klubbnavn</th>
            <th>Antall medlemmer</th>

        </tr>
        </thead>

        <c:forEach var = "klubb" items = "${klubber}">

            <tr>

                <td>${klubb.klubbNavn}</td>
                <td>${klubb.antall}</td>


            </tr>



        </c:forEach>

    </table>

</section>
<div class="container">
    <section id="main">


    </section>
    <aside id="sidebar">
        <p>Tekst tekst teskrt</p>
    </aside>
</div>

<footer id="main-footer">
    <p>Copuritgh my website. </p>
</footer>
</body>
</html>
