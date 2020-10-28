<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 19/10/2020
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Norges Roforbund</title>
    <link rel="stylesheet" type="text/css" href="UtoverInsert.css">
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
            <li><a href="HentUtTestresultater.jsp">Testresultater</a></li>
            <li><a href="Utover.jsp">Utøvere</a></li>
        </ul>
    </div>
</nav>

<section id="showcase">

    <form action="/RoProject/LeggTil" method="POST">
        <p>
            UtøverID <input type="number" name="uID" required />
        </p>
        <p>
            KjønnID <input type="text" name="kjonnID" required />
        </p>
        <p>
            KlubbID<input type="text" name="klubbID" required />
        </p>
        <p>
            KlasseID <input type="text" name="klasseID" required />
        </p>
        <p>
            Fornavn <input type="text" name="fornavn" required />
        </p>
        <p>
            Etternavn <input type="text" name="etternavn" required />
        </p>
        <p>
            Fødselsdato <input type="number" name="fodt" required />
        </p>
        <p>
            <input type="submit" value="RUN" />
        </p>
    </form>



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
