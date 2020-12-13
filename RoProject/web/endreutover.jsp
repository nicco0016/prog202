<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 08/11/2020
  Time: 19:15
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

    <form action="oppdaterUtover" method="GET"> <!-- Sender til TestresultatInsertServlet-->
        <p>
            <label for="klasse">Velg roklasse:</label>
            <select id="klasse" name="klasse" required>
                <option value="">Ikke valgt</option>
                <option value="Senior menn">Senior menn</option>
                <option value="Senior kvinner">Senior kvinner</option>
                <option value="Junior A gutter">Junior A gutter</option>
                <option value="Junior A jenter">Junior A jenter</option>
                <option value="Junior B gutter">Junior B gutter</option>
                <option value="Junior B jenter">Junior B jenter</option>
                <option value="Junior C gutter">Junior C gutter</option>
                <option value="Junior C jenter">Junior C jenter</option>
            </select>
        </p>
        <p>
            Fornavn <input type="text" name="fornavn" required />
        </p>
        <p>
            Etternavn <input type="text" name="etternavn" required />
        </p>

        <p>
            <input type="submit" value="RUN" type="button" onclick="history.back()" />
        </p>

        <FORM>
            <INPUT TYPE="button" onClick="history.back()" VALUE="Refresh">
        </FORM>
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
    <p>Copuritgh my website. Ingen kødder!</p>
</footer>
</body>
</html>
