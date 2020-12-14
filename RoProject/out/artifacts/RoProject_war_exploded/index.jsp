<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
  <link rel="stylesheet" type="text/css" href="LoggInn2.css">
</head>
<body>
<div class="formWrapper">
  <h2>Logg inn</h2>

  <form action="login" method="post">
    <div class="inputWrapper">
      <input type="text"  id="username" name="brukernavn" required>
      <label for="username">Brukernavn</label>
    </div>
    <div class="inputWrapper">
      <input type="password" id="password" name="passord" required>
      <label for="password">Passord</label>
    </div>

    <button type="submit">Logg inn</button>
  </form>
</div>
</body>
</html>

