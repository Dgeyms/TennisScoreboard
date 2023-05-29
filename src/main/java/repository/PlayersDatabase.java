package repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Players")
public class PlayersDatabase {
    @Id
    private int id;
    private String namePlayer;
    @Transient
    private final String nameFirstPlayer;
    @Transient
    private final String nameSecondPlayer;

    public PlayersDatabase(String nameFirstPlayer, String nameSecondPlayer) {
        this.nameFirstPlayer = nameFirstPlayer;
        this.nameSecondPlayer = nameSecondPlayer;
    }


    // Метод проверяет существование игроков в таблице Players
    private boolean checkPlayerExistence(){


        return true;
    }

}
