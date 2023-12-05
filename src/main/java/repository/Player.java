package repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Players")
public class Player {
    @Id
    int id;
    @NotNull
    String nameFirstPlayer;
    @NotNull
    String nameSecondPlayer;
}
