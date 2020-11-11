<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Roproject</title>
</head>
<body>
<div align="center">
    <h1>Legg til ny utøver</h1>
    <form action="LeggTil" method="POST">

        <p>
            <label for="kjonn">Velg Kjønn:</label>
            <select id="kjonn" name="kjonn" required>
                <option value="Mann">Mann</option>
                <option value="Kvinne">Kvinne</option>
            </select>
        </p>
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
            Fødselsdato <input type="number" name="fodt" required />
        </p>
        <p>
            <input type="submit" value="RUN" />
        </p>
    </form>
</div>
</body>
</html>
