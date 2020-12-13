<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 28/10/2020
  Time: 14:38
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
        <h1>Norges Roforbund - Super</h1>
    </div>
</header>

<nav id="navbar">
    <div class="container">
        <ul>

        </ul>
    </div>
</nav>

<section id="showcase">


    <form action="testresmid" method="GET">

        <label for="klasse">Velg roklasse:</label> <!-- Sender til alleTestresultaterMidServlet -->
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
