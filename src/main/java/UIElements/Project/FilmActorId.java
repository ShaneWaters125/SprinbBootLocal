package UIElements.Project;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

class FilmActorId implements Serializable {

    private int filmId;

    private int actorId;

    public FilmActorId(int filmId, int actorId){
        this.filmId = filmId;
        this.actorId = actorId;
    }
    public FilmActorId(){}
}
