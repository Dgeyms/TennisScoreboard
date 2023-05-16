<%--
  Created by IntelliJ IDEA.
  User: Dgeym
  Date: 16.05.2023
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>NEW MATCH</title>
    <link rel="stylesheet" type="text/css" href="css/style-new-match.css">
  </head>
  <body>
    <h1>NEW MATCH</h1>

    <div id="image-container">
      <img src="images/Two players.jpg" alt="Two players">
    </div>
    <p></p>

    <div id="newMatch-container">
      <form action="new-match" method="POST">
        <label for="nameFirstPlayer">Enter name first player:</label>
        <input type="text" id="nameFirstPlayer" name="nameFirstPlayer">
        <label for="nameSecondPlayer">Enter name second player:</label>
        <input type="text" id="nameSecondPlayer" name="nameSecondPlayer">
        <button type="submit">Start</button>
      </form>
    </div>
  </body>
</html>
