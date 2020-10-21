<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 19/10/2020
  Time: 18:35
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
            År <input type="number" name="år" required />
        </p>
        <p>
            Uke<input type="number" name="uke" required />
        </p>
        <p>
            KlasseID <input type="number" name="klasseID" required />
        </p>
        <p>
            Watt_60 <input type="number" name="watt_60" required />
        </p>
        <p>
            Bevegelighet <input type="text" name="etternavn" required />
        </p>
        <p>
            watt_5000_m <input type="number" name="watt_5000_m" required />
        </p>
        <p>
            tid_5000_m <input type="number" name="tid_5000_m" required />
        </p>
        <p>
            watt_2000_m <input type="number" name="watt_2000_m" required />
        </p>
        <p>
            tid_2000_m <input type="number" name="tid_2000_m" required />
        </p>
        <p>
            prosent_ligg_ro <input type="number" name="prosent_ligg_ro" required />
        </p>
        <p>
            kilo_ligg_ro <input type="number" name="kilo_ligg_ro" required />
        </p>
        <p>
            prosent_knebøy <input type="number" name="prosent_knebøy" required />
        </p>
        <p>
            kilo_knebøy <input type="number" name="kilo_knebøy" required />
        </p>
        <p>
            Cm_Sargeant <input type="number" name="Cm_Sargeant" required />
        </p>
        <p>
            sek_3000_m <input type="number" name="sek_3000_m" required />
        </p>
        <p>
            min_3000_m <input type="number" name="min_3000_m" required />
        </p>
        <p>
            antall_Kr_hev <input type="number" name="antall_Kr_hev" required />
        </p>
        <p>
            _3000_løp <input type="number" name="_3000_løp" required />
        </p>
        <p>
            score <input type="number" name="score" required />
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
    <p>Copuritgh my website. Ingen kødder!</p>
</footer>
</body>
</html>
