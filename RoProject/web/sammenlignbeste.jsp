<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 11/11/2020
  Time: 19:17
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
        <caption>Dine siste registrerte tester</caption>

        <br>

        <thead>
        <tr>
            <th>score</th>
            <th>UtoverID</th>
            <th>fornavn</th>
            <th>etternavn</th>
            <th>år</th>
            <th>uke</th>
            <th>klasseID</th>
            <th>watt_60</th>
            <th>bevegelighet</th>
            <th>watt_5000_m</th>
            <th>tid_5000_m</th>
            <th>watt_2000_m</th>
            <th>tid_2000_m</th>
            <th>prosent_ligg_ro</th>
            <th>kilo_ligg_ro</th>
            <th>Cm_Sargeant</th>
        </tr>
        </thead>

        <c:forEach var = "testresultat1" items = "${listsammenlign1}">
            <tr>
                <td>${testresultat1.score}</td>
                <td>${testresultat1.uID}</td>
                <td>${testresultat1.fornavn}</td>
                <td>${testresultat1.etternavn}</td>
                <td>${testresultat1.år}</td>
                <td>${testresultat1.uke}</td>
                <td>${testresultat1.klasseID}</td>
                <td>${testresultat1.watt_60}</td>
                <td>${testresultat1.bevegelighet}</td>
                <td>${testresultat1.watt_5000_m}</td>
                <td>${testresultat1.tid_5000_m}</td>
                <td>${testresultat1.watt_2000_m}</td>
                <td>${testresultat1.tid_2000_m}</td>
                <td>${testresultat1.prosent_ligg_ro}</td>
                <td>${testresultat1.kilo_ligg_ro}</td>
                <td>${testresultat1.cm_Sargeant}</td>

            </tr>

        </c:forEach>

    </table>

    <table>
        <caption>De 10 beste utøverne i din roklasse</caption>

        <br>

        <thead>
        <tr>
            <th>score</th>
            <th>UtoverID</th>
            <th>fornavn</th>
            <th>etternavn</th>
            <th>år</th>
            <th>uke</th>
            <th>klasseID</th>
            <th>watt_60</th>
            <th>bevegelighet</th>
            <th>watt_5000_m</th>
            <th>tid_5000_m</th>
            <th>watt_2000_m</th>
            <th>tid_2000_m</th>
            <th>prosent_ligg_ro</th>
            <th>kilo_ligg_ro</th>
            <th>Cm_Sargeant</th>
        </tr>
        </thead>

        <c:forEach var = "testresultat2" items = "${listsammenlign2}">
            <tr>
                <td>${testresultat2.score}</td>
                <td>${testresultat2.uID}</td>
                <td>${testresultat2.fornavn}</td>
                <td>${testresultat2.etternavn}</td>
                <td>${testresultat2.år}</td>
                <td>${testresultat2.uke}</td>
                <td>${testresultat2.klasseID}</td>
                <td>${testresultat2.watt_60}</td>
                <td>${testresultat2.bevegelighet}</td>
                <td>${testresultat2.watt_5000_m}</td>
                <td>${testresultat2.tid_5000_m}</td>
                <td>${testresultat2.watt_2000_m}</td>
                <td>${testresultat2.tid_2000_m}</td>
                <td>${testresultat2.prosent_ligg_ro}</td>
                <td>${testresultat2.kilo_ligg_ro}</td>
                <td>${testresultat2.cm_Sargeant}</td>

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
