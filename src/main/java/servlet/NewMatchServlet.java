package servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.PlayersDatabase;

import java.io.IOException;

@WebServlet(name = "NewMatchServlet", value = "/new-match")

public class NewMatchServlet extends HttpServlet {
    private String nameFirstPlayer;
    private String nameSecondPlayer;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        nameFirstPlayer = request.getParameter("nameFirstPlayer");
        nameSecondPlayer = request.getParameter("nameSecondPlayer");
    }
    // Проверяем существование игроков в таблице Players, если нет создаем
    PlayersDatabase playersDatabase = new PlayersDatabase(nameFirstPlayer, nameSecondPlayer);




    // Plan
    // Создать таблицу с игроками Players.
    // Проверяет существование игроков в таблице Players. Если игрока с таким именем не существует, создаём
    // Создаём экземпляр класса Match (содержащий айди игроков и текущий счёт) и кладём в коллекцию текущих
    // матчей (существующую только в памяти приложения, либо в key-value storage). Ключом коллекции является UUID, значением - экземпляр класса Match

    // Редирект на страницу match-score?uuid=$match_id
}
