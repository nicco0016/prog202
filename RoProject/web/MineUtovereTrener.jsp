<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 23/10/2020
  Time: 09:42
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.utover.alleutovere.Utover" %>
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
            <li><a href="<%=request.getContextPath()%>/alleutovere">Mine utøvere</a></li>
            <li><a href="HentUtTestresultaterTrener.jsp">Hent ut testresultater</a></li>
            <li><a href="LeggInnTestResTrenerV2.jsp">Legg til testresultater</a></li>

        </ul>
    </div>
</nav>

<section id="showcase">

    <table>
        <h2>List over alle utovere i Ormsund roklubb</h2>

        <br>


        <thead>
        <tr>
            <th>UtoverID</th>
            <th>Kjonn</th>
            <th>Klubb</th>
            <th>Klasse</th>
            <th>Fornavn</th>
            <th>Etternavn</th>
            <th>Fodt</th>
        </tr>
        </thead>



        <c:forEach var = "utover" items = "${listUtovere}">

            <tr>


                <td>${utover.uID}</td>
                <td>${utover.kjonnID}</td>
                <td>${utover.klubbID}</td>
                <td>${utover.klasseID}</td>
                <td>${utover.fornavn}</td>
                <td>${utover.etternavn}</td>
                <td>${utover.fodt}</td>


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
