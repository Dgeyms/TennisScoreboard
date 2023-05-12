package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewMatchServlet", urlPatterns = { "/new-match" })

public class NewMatchServlet extends HttpServlet {
    private String nameFirstPlayer;
    private String nameSecondPlayer;

    public void setNameFirstPlayer(String nameFirstPlayer) {
        this.nameFirstPlayer = nameFirstPlayer;
    }
    public void setNameSecondPlayer(String nameSecondPlayer) {
        this.nameSecondPlayer = nameSecondPlayer;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        setNameFirstPlayer(request.getParameter("nameFirstPlayer"));
        setNameSecondPlayer(request.getParameter("nameSecondPlayer"));


    }
    // Проверяем существование игроков в таблице Players


    // Метод проверяет существование игроков в таблице Players
    private boolean checkPlayerExistence(String name){


        return true;
    }

    // Plan
    // Создать таблицу с игроками Players.
    // Проверяет существование игроков в таблице Players. Если игрока с таким именем не существует, создаём
    // Создаём экземпляр класса Match (содержащий айди игроков и текущий счёт) и кладём в коллекцию текущих
    // матчей (существующую только в памяти приложения, либо в key-value storage). Ключом коллекции является UUID, значением - экземпляр класса Match

    // Редирект на страницу match-score?uuid=$match_id
}
