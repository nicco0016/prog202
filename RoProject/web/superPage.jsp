<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 28/10/2020
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Norges Roforbund</title>
    <link rel="stylesheet" type="text/css" href="superPage.css">
</head>
<body>
<header id="main-header">
    <div class="container">
        <h1>Norges Roforbund - Super</h1>
    </div>
</header>

<nav id="navbar">
    <div class="container">
        <ul>
            <li><a href="godkjenning.jsp">Godkjenning av testresultater</a></li>
            <li><a href="<%=request.getContextPath()%>/alleKlubber">Vis alle klubber</a></li>
        </ul>
    </div>
</nav>

<section id="showcase">
<h2>Hei og velkommen til Norges Roforbundet sin side for SuperBruker</h2>
    <h2>Her kan du se gjennom testresultater, godkjenne eller avslå</h2>

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
