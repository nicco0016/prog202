<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 28/10/2020
  Time: 15:54
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
        <caption>Liste over alle testresultater</caption>


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
            <th>_3000_løp</th>
            <th>antall_Kr_hev</th>
            <th>Cm_Sargeant</th>
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
                <td>${testresultat._3000_løp}</td>
                <td>${testresultat.antall_Kr_hev}</td>
                <td>${testresultat.cm_Sargeant}</td>
                <td><a href="<%=request.getContextPath()%>/godkjent?id=<c:out value ='${testresultat.uID}'/>">Godkjent</a></td>
                <td><a href="<%=request.getContextPath()%>/ikkegodkjent?id=<c:out value ='${testresultat.uID}'/>">Avlså</a></td>



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
