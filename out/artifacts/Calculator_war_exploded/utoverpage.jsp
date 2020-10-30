<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 22/10/2020
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Norges Roforbund</title>
    <link rel="stylesheet" type="text/css" href="utoverpagecss.css">
</head>
<body>
<header id="main-header">
    <div class="container">
        <h1>Norges Roforbund</h1><h3>${fornavn} ${etternavn}</h3>
    </div>
</header>

<nav id="navbar">
    <div class="container">
        <ul>
            <li><a href="<%=request.getContextPath()%>/testresultater">Mine testresultater</a></li>
            <li><a href="LeggInnTestresultater.jsp">Min klubb</a></li>
            <li><a href="Utover.jsp">Utøvere</a></li>
        </ul>
    </div>
</nav>

<section id="showcase">
    <h2>UtøverID: ${utoverid}</h2>
    <h2>Fornavn: ${fornavn}</h2>
    <h2>Etternavn: ${etternavn}</h2>
    <h2>Kjønn: ${kjonn}</h2>
    <h2>Roklubb: ${roklubb}</h2>
    <h2>Roklasse: ${roklasse}</h2>
    <h2>Årskull: ${fodt}</h2>
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
