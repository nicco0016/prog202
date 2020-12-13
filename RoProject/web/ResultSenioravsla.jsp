<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 29/10/2020
  Time: 15:06
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
        </ul>
    </div>
</nav>

<section id="showcase">

    <table>
        <h1>Liste over alle testresulatter for Senior</h1>


        <br>




        <thead>
        <tr>


            <th>UtoverID</th>
            <th>fornavn</th>
            <th>etternavn</th>
            <th>år</th>
            <th>uke</th>
            <th>klasseID</th>
            <th>score</th>
            <th>watt_60</th>
            <th>bevegelighet</th>
            <th>watt_5000_m</th>
            <th>tid_5000_m</th>
            <th>watt_2000_m</th>
            <th>tid_2000_m</th>
            <th>prosent_ligg_ro</th>
            <th>kilo_ligg_ro</th>
            <th>prosent_knebøy</th>
            <th>kilo_knebøy</th>
            <th>Handling</th>

        </tr>
        </thead>



        <c:forEach var = "testresultat" items = "${listTestresultater}">

            <tr>


                <td>${testresultat.uID}</td>
                <td>${testresultat.fornavn}</td>
                <td>${testresultat.etternavn}</td>
                <td>${testresultat.år}</td>
                <td>${testresultat.uke}</td>
                <td>${testresultat.klasseID}</td>
                <td>${testresultat.score}</td>
                <td>${testresultat.watt_60}</td>
                <td>${testresultat.bevegelighet}</td>
                <td>${testresultat.watt_5000_m}</td>
                <td>${testresultat.tid_5000_m}</td>
                <td>${testresultat.watt_2000_m}</td>
                <td>${testresultat.tid_2000_m}</td>
                <td>${testresultat.prosent_ligg_ro}</td>
                <td>${testresultat.kilo_ligg_ro}</td>
                <td>${testresultat.prosent_knebøy}</td>
                <td>${testresultat.kilo_knebøy}</td>
                <td><a href="<%=request.getContextPath()%>/endreTestresultat?id=<c:out value ='${testresultat.uID}'/>">Endre</a></td>








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
    <p>Copuritgh my website. </p>
</footer>
</body>
</html>
