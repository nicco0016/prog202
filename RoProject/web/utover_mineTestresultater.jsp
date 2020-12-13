<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 22/10/2020
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.testresultater.alletestresultater.alleTestresultater"%>
<html>
<head>
    <title>Norges Roforbund</title>
    <link rel="stylesheet" type="text/css" href="HentUtTestresultaterUtover.css">
</head>
<body>
<header id="main-header">
    <div class="container">
        <h1>Norges Roforbund</h1>
    </div>
</header>

<nav id="navbar">
    <div class="container">
        <ul>
            <li><a href="<%=request.getContextPath()%>/sammenligbeste">Sammenlign mot klassens beste</a></li>
        </ul>
    </div>
</nav>

<section id="showcase">

    <table>
        <h2>Liste over mine testresultater fra Norges Roforbund</h2>
        <br>
        <thead>
        <tr>
            <th>År</th>
            <th>Uke</th>
            <th>Score</th>
            <th>Roklasse</th>
            <th>Watt_60</th>
            <th>Bevegelighet</th>
            <th>Watt_5000_m</th>
            <th>Tid_5000_m</th>
            <th>Watt_2000_m</th>
            <th>Tid_2000_m</th>
            <th>Prosent_ligg_ro</th>
            <th>Kilo_ligg_ro</th>
        </tr>
        </thead>
        <c:forEach var = "testresultat" items = "${listtestresultat}">
            <tr>
                <td>${testresultat.år}</td>
                <td>${testresultat.uke}</td>
                <td>${testresultat.score}</td>
                <td>${testresultat.klasseID}</td>
                <td>${testresultat.watt_60}</td>
                <td>${testresultat.bevegelighet}</td>
                <td>${testresultat.watt_5000_m}</td>
                <td>${testresultat.tid_5000_m}</td>
                <td>${testresultat.watt_2000_m}</td>
                <td>${testresultat.tid_2000_m}</td>
                <td>${testresultat.prosent_ligg_ro}</td>
                <td>${testresultat.kilo_ligg_ro}</td>
            </tr>
        </c:forEach>

    </table>

</section>
<div class="container">
    <section id="main">
        <h1>Velkommen</h1>
        <p>Teskt teskt teskt</p>
    </section>
    <aside id="sidebar">
        <p>Tekst tekst teskrt</p>
    </aside>
</div>

<footer id="main-footer">
    <p>Copuritgh my website. Ingen kødder!</p>
</footer>
</body>
</html>
