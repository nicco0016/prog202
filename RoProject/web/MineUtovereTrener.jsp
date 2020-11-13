<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 23/10/2020
  Time: 09:42
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.utover.alleutovere.objekter.Utover" %>
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
            <td><a href="<%=request.getContextPath()%>/testresultater?id=${utoverid}">Mine testresultater</a></td> <!--Sender til UtoverresultServlet-->
            <td><a href="<%=request.getContextPath()%>/klubbUtovere?roklubb=${roklubb}">Utøvere i ${roklubb} roklubb</a></td> <!-- Sender til v2utoverServlet -->
            <li><a href="InsertPage.jsp">Legg til ny utøver</a></li>

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
            <th>Action</th>
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
                <td><a href="<%=request.getContextPath()%>/seresultater?id=${utover.uID}">Se testresultater</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="<%=request.getContextPath()%>/sammenlign?id2=${utover.uID}">Sammenlign testresultater</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="<%=request.getContextPath()%>/endreutover?id=${utover.uID}">Endre utøver</a></td>


            </tr>



        </c:forEach>

    </table>

</section>
<div class="container">
    <section id="main">
        <button onClick="history.go(2);">Refresh Page</button>


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
