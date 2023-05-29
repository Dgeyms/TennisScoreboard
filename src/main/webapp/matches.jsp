<%--
  Created by IntelliJ IDEA.
  User: Dgeym
  Date: 16.05.2023
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>MATCHES PAGE</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <h1>MATCHES PAGE</h1>
        <p></p>

        <form action="/matches" method="get">
            <label for="playerName">Name player:</label>
            <input type="text" id="playerName" name="playerName">
            <button type="submit">Search</button>
        </form>
        <p></p>
        <h3>List of found matches</h3>
    </body>
</html>
