package UIElements.Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmActorTest {

    @Test
    public void filmActorConstructor(){
        FilmActor filmActor = new FilmActor();
        Assertions.assertTrue(true);
        Actor actor = new Actor();
        Film film = new Film();
        FilmActor filmActor1 = new FilmActor(actor, film);
        Assertions.assertTrue(true);
    }

    @Test
    public void filmActorGettersAndSetters(){
        FilmActor filmActor = new FilmActor();
        Actor actor = new Actor();
        Film film = new Film();
        filmActor.setActorId(actor);
        filmActor.setFilmId(film);
        Assertions.assertEquals(actor, filmActor.getActorId());
        Assertions.assertEquals(film, filmActor.getFilmId());
    }

}
