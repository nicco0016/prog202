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
    <h2>Fornavn: Ola</h2>
    <h2>Etternavn:Nordmann </h2>
    <h2>Kjønn: Mann</h2>
    <h2>Roklubb: Ordmsund</h2>
    <h2>Rolle: Trener</h2>
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
