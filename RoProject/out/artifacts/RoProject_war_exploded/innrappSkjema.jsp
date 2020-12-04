<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nicolaibjorntvedt
  Date: 02/11/2020
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Legg inn resultater</title>
    <link rel="stylesheet" type="text/css" href="Innrapportering.css">
</head>
<body>

<h2>Senior</h2>
<form method="post" action="insertSenior">
    <div class="formWrapper">
        <fieldset>
            <legend></legend>
            <label for="ar">År:</label>
            <select class="select-css" name="ar">
                <option selected disabled value="">Velg</option>
                <option value="2020">2020</option>
                <option value="2021">2021</option>
            </select>
            <label for="uke">Uke:</label>
            <select class="select-css" name="uke">
                <option selected disabled value="">Velg</option>
                <option value="2">2</option>
                <option value="11">11</option>
                <option value="44">44</option>
            </select>
        </fieldset>
    </div>

    <table id="Senior">
        <thead>
        <th>Utøver</th>
        <th>60" Watt</th>
        <th>Bevegelighet</th>
        <th>5000m Watt</th>
        <th>5000m Tid</th>
        <th>2000m Watt</th>
        <th>2000m Tid</th>
        <th>Liggro (%)</th>
        <th>Liggro (kg)</th>
        <th>Knebøy (%)</th>
        <th>Knebøy (kg)</th>
        </thead>
        <tr>
            <td>

                <select name="utoverID" >
                    <c:forEach var = "id" items = "${uidliste}">
                    <option value="${id.klubbID}">${id.klubbID}</option>
                    </c:forEach>
                </select>

            </td>

            <!--<td contenteditable="true" name="watt_60"></td> -->
             <td><input type="number" name="watt_60" required></td>
            <td>
                <select class="1select" id="bevegelighet" name="bevegelighet">
                    <option selected disabled value="">Velg</option>
                    <option value="0">0</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </td>
            <!--<td contenteditable="true" name="watt_5000_m"></td>-->
            <td><input type="number" name="watt_5000_m" required></td>
            <td>
                <select class="2select" name="5000Min">
                    <option selected disabled value="">min</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
                <select class="2select" name="5000Sek">
                    <option selected disabled value="">sek</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
            </td>
           <!-- <td contenteditable="true" name="watt_2000"></td>-->
            <td><input type="number" name="watt_2000" required></td>

            <td>
                <select class="2select" name="2000Min">
                    <option selected disabled value="">min</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
                <select class="2select" name="2000Sek">
                    <option selected disabled value="">sek</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
            </td>
           <!-- <td contenteditable="true" name="Liggro(%)"></td>-->
            <td><input type="number" name="Liggro(%)" required></td>
           <!-- <td contenteditable="true" name="Liggro(kg)"></td>-->
            <td><input type="number" name="Liggro(kg)" required></td>
           <!-- <td contenteditable="true" name="Knebøy(%)"></td>-->
            <td><input type="number" name="Kneboy(%)" required></td>
           <!-- <td contenteditable="true" name="Knebøy(kg)"></td>-->
            <td><input type="number" name="Kneboy(kg)" required></td>
            <td><input type="button" value="Slett" onclick="deleteRowSenior(this)"></td>
        </tr>
    </table>
    <br>
    <div class="wrapper">
        <input type="submit" value="Send inn">
    </div>
</form>
<br>

<div class="wrapper">
    <button type="button" onclick="addSenior()">Legg til rad</button>
</div>

<h2>Junior A</h2>

<form method="post" action="">

    <div class="formWrapper">
        <fieldset>
            <legend></legend>
            <label for="år">År:</label>
            <select class="select-css" name="ar">
                <option selected disabled value="">Velg</option>
                <option value="2020">2020</option>
                <option value="2021">2021</option>
            </select>
            <label for="uke">Uke:</label>
            <select class="select-css" name="uke">
                <option selected disabled value="">Velg</option>
                <option value="2">2</option>
                <option value="11">11</option>
                <option value="44">44</option>
            </select>
            <label for="kjønn">Kjønn:</label>
            <select class="select-css" name="kjonn">
                <option selected disabled value="">Velg</option>
                <option value="menn">Menn</option>
                <option value="kvinner">Kvinner</option>
            </select>
        </fieldset>
    </div>

    <table id="JuniorA">
        <thead>
        <th>Utøver</th>
        <th>60" Watt</th>
        <th>Bevegelighet</th>
        <th>5000m Watt</th>
        <th>5000m Tid</th>
        <th>2000m Watt</th>
        <th>2000m Tid</th>
        <th>Liggro (%)</th>
        <th>Liggro (kg)</th>
        <th>Sargeant</th>
        </thead>
        <tr>
            <td>
                <select class="1select" name="utøver">
                    <option value="dnf">Uferdig</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td>
                <select class="1select" name="bevegelighet">
                    <option selected disabled value="">Velg</option>
                    <option value="0">0</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td>
                <select class="2select" name="5000Min">
                    <option selected disabled value="">min</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
                <select class="2select" name="5000Sek">
                    <option selected disabled value="">sek</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td>
                <select class="2select" name="2000Min">
                    <option selected disabled value="">min</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
                <select class="2select" name="2000Sek">
                    <option selected disabled value="">sek</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td contenteditable="true"></td>
            <td contenteditable="true"></td>
            <td><input type="button" value="Slett" onclick="deleteRowJuniorA(this)"></td>
        </tr>
    </table>
    <br>
    <div class="wrapper">
        <input type="submit" value="Send inn">
    </div>
</form>
<br>

<div class="wrapper">
    <button type="button" onclick="addJuniorA()">Legg til rad</button>
</div>

<h2>Junior B</h2>

<div class="formWrapper">
    <fieldset>
        <legend></legend>
        <label for="år">År:</label>
        <select class="select-css" name="år">
            <option selected disabled value="">Velg</option>
            <option value="2020">2020</option>
            <option value="2021">2021</option>
        </select>
        <label for="uke">Uke:</label>
        <select class="select-css" name="uke">
            <option selected disabled value="">Velg</option>
            <option value="2">2</option>
            <option value="11">11</option>
            <option value="44">44</option>
        </select>
        <label for="kjønn">Kjønn:</label>
        <select class="select-css" name="kjønn">
            <option selected disabled value="">Velg</option>
            <option value="menn">Menn</option>
            <option value="kvinner">Kvinner</option>
        </select>
    </fieldset>
</div>


<form method="post" action="">
    <table id="JuniorB">
        <thead>
        <th>Utøver</th>
        <th>60" Watt</th>
        <th>Bevegelighet</th>
        <th>3000m Sek</th>
        <th>3000m Tid</th>
        <th>2000m Watt</th>
        <th>2000m Tid</th>
        <th>Kroppshev</th>
        <th>Sargeant</th>
        </thead>
        <tr>
            <td>
                <select class="1select" name="utøver">
                    <option value="dnf">Uferdig</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td>
                <select class="1select" name="bevegelighet">
                    <option selected disabled value="">Velg</option>
                    <option value="0">0</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td>
                <select class="2select" name="3000Min">
                    <option selected disabled value="">min</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
                <select class="2select" name="3000Sek">
                    <option selected disabled value="">sek</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td>
                <select class="2select" name="2000Min">
                    <option selected disabled value="">min</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
                <select class="2select" name="2000Sek">
                    <option selected disabled value="">sek</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td contenteditable="true"></td>
            <td><input type="button" value="Slett" onclick="deleteRowJuniorB(this)"></td>
        </tr>
    </table>
    <br>
    <div class="wrapper">
        <input type="submit" value="Send inn">
    </div>
</form>
<br>

<div class="wrapper">
    <button type="button" onclick="addJuniorB()">Legg til rad</button>
</div>

<h2>Junior C</h2>

<form method="post" action="">

    <div class="formWrapper">
        <fieldset>
            <legend></legend>
            <label for="år">År:</label>
            <select class="select-css" name="år">
                <option selected disabled value="">Velg</option>
                <option value="2020">2020</option>
                <option value="2021">2021</option>
            </select>
            <label for="uke">Uke:</label>
            <select class="select-css" name="uke">
                <option selected disabled value="">Velg</option>
                <option value="2">2</option>
                <option value="11">11</option>
                <option value="44">44</option>
            </select>
            <label for="kjønn">Kjønn:</label>
            <select class="select-css" name="kjønn">
                <option selected disabled value="">Velg</option>
                <option value="menn">Menn</option>
                <option value="kvinner">Kvinner</option>
            </select>
        </fieldset>
    </div>

    <table id="JuniorC">




        <thead>
        <th>Utøver</th>
        <th>60"Watt</th>
        <th>Bevegelighet</th>
        <th>3000m løp</th>
        <th>Kroppshev</th>
        <th>Sargeant</th>
        </thead>
        <tr>
            <td>
                <select class="1select" name="utøver">
                    <option value="dnf">Uferdig</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td>
                <select class="1select" name="bevegelighet">
                    <option selected disabled value="">Velg</option>
                    <option value="0">0</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </td>
            <td>
                <select class="2select" name="3000løpMin">
                    <option selected disabled value="">min</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
                <select class="2select" name="3000løpSek">
                    <option selected disabled value="">sek</option>
                    <option value="00">00</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                    <option value="32">32</option>
                    <option value="33">33</option>
                    <option value="34">34</option>
                    <option value="35">35</option>
                    <option value="36">36</option>
                    <option value="37">37</option>
                    <option value="38">38</option>
                    <option value="39">39</option>
                    <option value="40">40</option>
                    <option value="41">41</option>
                    <option value="42">42</option>
                    <option value="43">43</option>
                    <option value="44">44</option>
                    <option value="45">45</option>
                    <option value="46">46</option>
                    <option value="47">47</option>
                    <option value="48">48</option>
                    <option value="49">49</option>
                    <option value="50">50</option>
                    <option value="51">51</option>
                    <option value="52">52</option>
                    <option value="53">53</option>
                    <option value="54">54</option>
                    <option value="55">55</option>
                    <option value="56">56</option>
                    <option value="57">57</option>
                    <option value="58">58</option>
                    <option value="59">59</option>
                </select>
            </td>
            <td contenteditable="true"></td>
            <td contenteditable="true"></td>
            <td><input type="button" value="Slett" onclick="deleteRowJuniorC(this)"></td>
        </tr>
    </table>
    <br>
    <div class="wrapper">
        <input type="submit" value="Send inn">
    </div>
</form>
<br>

<div class="wrapper">
    <button type="button" onclick="addJuniorC()">Legg til rad</button>
</div>
<script>
    function addSenior() {
        var table = document.getElementById("Senior");
        var row = table.insertRow(1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        var cell5 = row.insertCell(4);
        var cell6 = row.insertCell(5);
        var cell7 = row.insertCell(6);
        var cell8 = row.insertCell(7);
        var cell9 = row.insertCell(8);
        var cell10 = row.insertCell(9);
        var cell11 = row.insertCell(10);
        var cell12 = row.insertCell(11);
        cell1.innerHTML = "<select class=\"1select\" id=\"utøver\" name=\"utøver\">\n" +
            "            <option value=\"dnf\">Uferdig</option>\n" +
            "        </select>";
        cell2.setAttribute('contentEditable', 'true');
        cell3.innerHTML = "<select class=\"1select\" id=\"bevegelighet\" name=\"bevegelighet\">\n" +
            "                <option selected disabled value=\"\">Velg</option>\n" +
            "                <option value=\"0\">0</option>\n" +
            "                <option value=\"1\">1</option>\n" +
            "                <option value=\"2\">2</option>\n" +
            "                <option value=\"3\">3</option>\n" +
            "            </select>";
        cell4.setAttribute('contentEditable', 'true');
        cell5.innerHTML = "<select class=\"2select\" name=\"5000Min\">\n" +
            "                <option selected disabled value=\"\">min</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>\n" +
            "            <select class=\"2select\" name=\"5000Sek\">\n" +
            "                <option selected disabled value=\"\">sek</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>";
        cell6.setAttribute('contentEditable', 'true');
        cell7.innerHTML = "<select class=\"2select\" name=\"2000Min\">\n" +
            "                <option selected disabled value=\"\">min</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>\n" +
            "            <select class=\"2select\" name=\"2000Sek\">\n" +
            "                <option selected disabled value=\"\">sek</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>";
        cell8.setAttribute('contentEditable', 'true');
        cell9.setAttribute('contentEditable', 'true');
        cell10.setAttribute('contentEditable', 'true');
        cell11.setAttribute('contentEditable', 'true');
        cell12.innerHTML = "<input type=\"button\" value=\"Slett\" onclick=\"deleteRowSenior(this)\">"
    }
    function addJuniorA() {
        var table = document.getElementById("JuniorA");
        var row = table.insertRow(1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        var cell5 = row.insertCell(4);
        var cell6 = row.insertCell(5);
        var cell7 = row.insertCell(6);
        var cell8 = row.insertCell(7);
        var cell9 = row.insertCell(8);
        var cell10 = row.insertCell(9);
        var cell11 = row.insertCell(10);
        cell1.innerHTML = "<select class=\"1select\" id=\"utøver\" name=\"utøver\">\n" +
            "            <option value=\"dnf\">Uferdig</option>\n" +
            "        </select>";
        cell2.setAttribute('contentEditable', 'true');
        cell3.innerHTML = "<select class=\"1select\" name=\"bevegelighet\">\n" +
            "                <option selected disabled value=\"\">Velg</option>\n" +
            "                <option value=\"0\">0</option>\n" +
            "                <option value=\"1\">1</option>\n" +
            "                <option value=\"2\">2</option>\n" +
            "                <option value=\"3\">3</option>\n" +
            "            </select>";
        cell4.setAttribute('contentEditable', 'true');
        cell5.innerHTML = "<select class=\"2select\" name=\"5000Min\">\n" +
            "                <option selected disabled value=\"\">min</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>\n" +
            "            <select class=\"2select\" name=\"5000Sek\">\n" +
            "                <option selected disabled value=\"\">sek</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>";
        cell6.setAttribute('contentEditable', 'true');
        cell7.innerHTML = "<select class=\"2select\" name=\"2000Min\">\n" +
            "                <option selected disabled value=\"\">min</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>\n" +
            "            <select class=\"2select\" name=\"2000Sek\">\n" +
            "                <option selected disabled value=\"\">sek</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>";
        cell8.setAttribute('contentEditable', 'true');
        cell9.setAttribute('contentEditable', 'true');
        cell10.setAttribute('contentEditable', 'true');
        cell11.innerHTML = "<input type=\"button\" value=\"Slett\" onclick=\"deleteRowJuniorA(this)\">"
    }
    function addJuniorB() {
        var table = document.getElementById("JuniorB");
        var row = table.insertRow(1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        var cell5 = row.insertCell(4);
        var cell6 = row.insertCell(5);
        var cell7 = row.insertCell(6);
        var cell8 = row.insertCell(7);
        var cell9 = row.insertCell(8);
        var cell10 = row.insertCell(9);
        cell1.innerHTML = "<select class=\"1select\" id=\"utøver\" name=\"utøver\">\n" +
            "            <option value=\"dnf\">Uferdig</option>\n" +
            "        </select>";
        cell2.setAttribute('contentEditable', 'true');
        cell3.innerHTML = "<select class=\"1select\" name=\"bevegelighet\">\n" +
            "                <option selected disabled value=\"\">Velg</option>\n" +
            "                <option value=\"0\">0</option>\n" +
            "                <option value=\"1\">1</option>\n" +
            "                <option value=\"2\">2</option>\n" +
            "                <option value=\"3\">3</option>\n" +
            "            </select>";
        cell4.setAttribute('contentEditable', 'true');
        cell5.innerHTML = "<select class=\"2select\" name=\"3000Min\">\n" +
            "                <option selected disabled value=\"\">min</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>\n" +
            "            <select class=\"2select\" name=\"3000Sek\">\n" +
            "                <option selected disabled value=\"\">sek</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>";
        cell6.setAttribute('contentEditable', 'true');
        cell7.innerHTML = "<select class=\"2select\" name=\"2000Min\">\n" +
            "                <option selected disabled value=\"\">min</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>\n" +
            "            <select class=\"2select\" name=\"2000Sek\">\n" +
            "                <option selected disabled value=\"\">sek</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>";
        cell8.setAttribute('contentEditable', 'true');
        cell9.setAttribute('contentEditable', 'true');
        cell10.innerHTML = "<input type=\"button\" value=\"Slett\" onclick=\"deleteRowJuniorB(this)\">"
    }
    function addJuniorC() {
        var table = document.getElementById("JuniorC");
        var row = table.insertRow(1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        var cell5 = row.insertCell(4);
        var cell6 = row.insertCell(5);
        var cell7 = row.insertCell(6);
        cell1.innerHTML = "<select class=\"1select\" id=\"utøver\" name=\"utøver\">\n" +
            "            <option value=\"dnf\">Uferdig</option>\n" +
            "        </select>";
        cell2.setAttribute('contentEditable', 'true');
        cell3.innerHTML = "<select class=\"1select\" name=\"bevegelighet\">\n" +
            "                <option selected disabled value=\"\">Velg</option>\n" +
            "                <option value=\"0\">0</option>\n" +
            "                <option value=\"1\">1</option>\n" +
            "                <option value=\"2\">2</option>\n" +
            "                <option value=\"3\">3</option>\n" +
            "            </select>";
        cell4.innerHTML = "<select class=\"2select\" name=\"3000løpMin\">\n" +
            "                <option selected disabled value=\"\">min</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>\n" +
            "            <select class=\"2select\" name=\"3000løpSek\">\n" +
            "                <option selected disabled value=\"\">sek</option>\n" +
            "                <option value=\"00\">00</option>\n" +
            "                <option value=\"01\">01</option>\n" +
            "                <option value=\"02\">02</option>\n" +
            "                <option value=\"03\">03</option>\n" +
            "                <option value=\"04\">04</option>\n" +
            "                <option value=\"05\">05</option>\n" +
            "                <option value=\"06\">06</option>\n" +
            "                <option value=\"07\">07</option>\n" +
            "                <option value=\"08\">08</option>\n" +
            "                <option value=\"09\">09</option>\n" +
            "                <option value=\"10\">10</option>\n" +
            "                <option value=\"11\">11</option>\n" +
            "                <option value=\"12\">12</option>\n" +
            "                <option value=\"13\">13</option>\n" +
            "                <option value=\"14\">14</option>\n" +
            "                <option value=\"15\">15</option>\n" +
            "                <option value=\"16\">16</option>\n" +
            "                <option value=\"17\">17</option>\n" +
            "                <option value=\"18\">18</option>\n" +
            "                <option value=\"19\">19</option>\n" +
            "                <option value=\"20\">20</option>\n" +
            "                <option value=\"21\">21</option>\n" +
            "                <option value=\"22\">22</option>\n" +
            "                <option value=\"23\">23</option>\n" +
            "                <option value=\"24\">24</option>\n" +
            "                <option value=\"25\">25</option>\n" +
            "                <option value=\"26\">26</option>\n" +
            "                <option value=\"27\">27</option>\n" +
            "                <option value=\"28\">28</option>\n" +
            "                <option value=\"29\">29</option>\n" +
            "                <option value=\"30\">30</option>\n" +
            "                <option value=\"31\">31</option>\n" +
            "                <option value=\"32\">32</option>\n" +
            "                <option value=\"33\">33</option>\n" +
            "                <option value=\"34\">34</option>\n" +
            "                <option value=\"35\">35</option>\n" +
            "                <option value=\"36\">36</option>\n" +
            "                <option value=\"37\">37</option>\n" +
            "                <option value=\"38\">38</option>\n" +
            "                <option value=\"39\">39</option>\n" +
            "                <option value=\"40\">40</option>\n" +
            "                <option value=\"41\">41</option>\n" +
            "                <option value=\"42\">42</option>\n" +
            "                <option value=\"43\">43</option>\n" +
            "                <option value=\"44\">44</option>\n" +
            "                <option value=\"45\">45</option>\n" +
            "                <option value=\"46\">46</option>\n" +
            "                <option value=\"47\">47</option>\n" +
            "                <option value=\"48\">48</option>\n" +
            "                <option value=\"49\">49</option>\n" +
            "                <option value=\"50\">50</option>\n" +
            "                <option value=\"51\">51</option>\n" +
            "                <option value=\"52\">52</option>\n" +
            "                <option value=\"53\">53</option>\n" +
            "                <option value=\"54\">54</option>\n" +
            "                <option value=\"55\">55</option>\n" +
            "                <option value=\"56\">56</option>\n" +
            "                <option value=\"57\">57</option>\n" +
            "                <option value=\"58\">58</option>\n" +
            "                <option value=\"59\">59</option>\n" +
            "            </select>";
        cell5.setAttribute('contentEditable', 'true');
        cell6.setAttribute('contentEditable', 'true');
        cell7.innerHTML = "<input type=\"button\" value=\"Slett\" onclick=\"deleteRowJuniorC(this)\">"
    }
    function deleteRowSenior(r) { // https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_table_deleterow2
        var i = r.parentNode.parentNode.rowIndex;
        document.getElementById("Senior").deleteRow(i);
    }
    function deleteRowJuniorA(r) {
        var i = r.parentNode.parentNode.rowIndex;
        document.getElementById("JuniorA").deleteRow(i);
    }
    function deleteRowJuniorB(r) {
        var i = r.parentNode.parentNode.rowIndex;
        document.getElementById("JuniorB").deleteRow(i);
    }
    function deleteRowJuniorC(r) {
        var i = r.parentNode.parentNode.rowIndex;
        document.getElementById("JuniorC").deleteRow(i);
    }
</script>
</table>
</body>
</html>