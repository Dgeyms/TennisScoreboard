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
        <title>MATCH SCORE</title>
        <link rel="stylesheet" type="text/css" href="css/style-match-score.css">
    </head>
    <body>
        <h1>MATCH SCORE</h1>
        <div id="image-container">
            <img src="images/Tennis Step.jpg" alt="Tennis table">
        </div>
        <p></p>

        <table class="players" border="1">
            <tr>
                <td colspan="2">PLAYERS</td>
                <td>SETS</td>
                <td>CHECK</td>
            </tr>
            <tr>
                <td colspan="2">PLAYERS</td>
                <td>SETS</td>
                <td>CHECK</td>
            </tr>
            <tr>
                <td colspan="2">PLAYERS</td>
                <td>SETS</td>
                <td>CHECK</td>
            </tr>
        </table>

        <p></p>

        <h2>Choose which player won the point</h2>

        <div id="buttons-container">
            <form action="match-score" method="POST">
                <button type="submit">Player 1 won the current point</button>
                <button type="submit">Player 2 won the current point</button>
            </form>
        </div>
    </body>
</html>
