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
            <li><a href="<%=request.getContextPath()%>/getuiddropdown">Legg til testresultater V.2</a></li>
            <td><a href="<%=request.getContextPath()%>/klubbUtovere?roklubb=${KlubbNavn}">Utøvere i ${KlubbNavn} roklubb</a></td> <!-- Sender til v2utoverServlet -->
            <li><a href="HentUtTestresultaterTrener.jsp">Hent ut testresultater</a></li>
            <li><a href="AvslagTestresultater.jsp">Avlag på innrapportering</a></li>
        </ul>
    </div>
</nav>

<section id="showcase">
    <h2>TrenerID: ${KlubbId}</h2>
    <h2>Roklubb: ${KlubbNavn}</h2>

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
