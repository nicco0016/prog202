<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 11/12/2020
  Time: 15:01
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
        <h3>Liste over alle testresultatene som Senior</h3>
        <br>

        <thead>
        <tr>

            <th>score</th>
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
            <th>prosent_knebøy</th>
            <th>kilo_knebøy</th>

        </tr>
        </thead>
        <c:forEach var = "testresultat" items = "${listSeniorResultat}">

            <tr>
                <td>${testresultat.score}</td>
                <td>${testresultat.år}</td>
                <td>${testresultat.uke}</td>
                <td>${testresultat.klasseID}</td>
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
            </tr>

        </c:forEach>

    </table>

    <table>
        <h3>Liste over alle testresultatene som Junior A</h3>


        <br>
        <thead>
        <tr>

            <th>score</th>
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

        <c:forEach var = "testresultat" items = "${listJuniorAResultat}">

            <tr>

                <td>${testresultat.score}</td>
                <td>${testresultat.år}</td>
                <td>${testresultat.uke}</td>
                <td>${testresultat.klasseID}</td>
                <td>${testresultat.watt_60}</td>
                <td>${testresultat.bevegelighet}</td>
                <td>${testresultat.watt_5000_m}</td>
                <td>${testresultat.tid_5000_m}</td>
                <td>${testresultat.watt_2000_m}</td>
                <td>${testresultat.tid_2000_m}</td>
                <td>${testresultat.prosent_ligg_ro}</td>
                <td>${testresultat.kilo_ligg_ro}</td>
                <td>${testresultat.cm_Sargeant}</td>

            </tr>
        </c:forEach>

    </table>

    <table>
        <h3>Liste over alle testresultatene som Junior B</h3>


        <br>

        <thead>
        <tr>
            <th>score</th>
            <th>år</th>
            <th>uke</th>
            <th>klasseID</th>
            <th>watt_60</th>
            <th>bevegelighet</th>
            <th>sek_3000_m</th>
            <th>min_3000_m</th>
            <th>watt_2000_m</th>
            <th>tid_2000_m</th>
            <th>antall_Kr_hev</th>
            <th>Cm_Sargeant</th>


        </tr>
        </thead>

        <c:forEach var = "testresultat" items = "${listJuniorBResultat}">

            <tr>
                <td>${testresultat.score}</td>
                <td>${testresultat.år}</td>
                <td>${testresultat.uke}</td>
                <td>${testresultat.klasseID}</td>
                <td>${testresultat.watt_60}</td>
                <td>${testresultat.bevegelighet}</td>
                <td>${testresultat.sek_3000_m}</td>
                <td>${testresultat.min_3000_m}</td>
                <td>${testresultat.watt_2000_m}</td>
                <td>${testresultat.tid_2000_m}</td>
                <td>${testresultat.antall_Kr_hev}</td>
                <td>${testresultat.cm_Sargeant}</td>

            </tr>

        </c:forEach>

    </table>

    <table>
        <h3>Liste over alle testresultatene som Junior C</h3>

        <br>

        <thead>
        <tr>

            <th>år</th>
            <th>uke</th>
            <th>klasseID</th>
            <th>score</th>
            <th>watt_60</th>
            <th>bevegelighet</th>
            <th>_3000_løp</th>
            <th>antall_Kr_hev</th>
            <th>Cm_Sargeant</th>

        </tr>
        </thead>
        <c:forEach var = "testresultat" items = "${listJuniorCResultat}">

            <tr>
                <td>${testresultat.år}</td>
                <td>${testresultat.uke}</td>
                <td>${testresultat.klasseID}</td>
                <td>${testresultat.score}</td>
                <td>${testresultat.watt_60}</td>
                <td>${testresultat.bevegelighet}</td>
                <td>${testresultat._3000_løp}</td>
                <td>${testresultat.antall_Kr_hev}</td>
                <td>${testresultat.cm_Sargeant}</td>


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

