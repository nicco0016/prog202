<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 22/10/2020
  Time: 19:56
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
            <li><a href="innrappSkjema.jsp">Legg til testresultater</a></li>
            <li><a href="HentUtTestresultaterTrener.jsp">Hent ut testresultater</a></li>
            <li><a href="AvslagTestresultater.jsp">Avlag på innrapportering</a></li>

        </ul>
    </div>
</nav>

<section id="showcase">


    <form action="parameter" method="GET">

        <label for="år">Velg år:</label>
        <select id="år" name="år" required>
            <option value="">Ikke valgt</option>
            <option value="2020">2020</option>
            <option value="2019">2019</option>
            <option value="2018">2018</option>
        </select>
        <label for="uke">Velg uke:</label>
        <select id="uke" name="uke" required>
            <option value="">Ikke valgt</option>
            <option value="2">2</option>
            <option value="11">11</option>
            <option value="44">44</option>
        </select>
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
        <p>
            <input type="submit" value="send">
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
