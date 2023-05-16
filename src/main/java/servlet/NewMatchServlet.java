package servlet;

import database.H2InMemoryDatabase;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewMatchServlet", value = "/new-match")

public class NewMatchServlet extends HttpServlet {
    private String nameFirstPlayer;
    private String nameSecondPlayer;

    public String getNameFirstPlayer() {
        return nameFirstPlayer;
    }

    public String getNameSecondPlayer() {
        return nameSecondPlayer;
    }

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
    H2InMemoryDatabase database = new H2InMemoryDatabase(getNameFirstPlayer(),getNameSecondPlayer());
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
