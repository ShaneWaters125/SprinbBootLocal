package UIElements.Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

    @Test
    public void filmConstructor(){
        Film film = new Film();
        Assertions.assertTrue(true);
    }

    @Test
    public void filmGettersAndSetters(){
        Film film = new Film();
        film.setFilmId(1);
        film.setTitle("Title");
        film.setDescription("Description");
        film.setReleaseYear("1970");
        film.setLength("1");
        film.setRating("1");
        Assertions.assertEquals(1, film.getFilmId());
        Assertions.assertEquals("Title", film.getTitle());
        Assertions.assertEquals("Description", film.getDescription());
        Assertions.assertEquals("1970", film.getReleaseYear());
        Assertions.assertEquals("1", film.getLength());
        Assertions.assertEquals("1", film.getRating());
    }

}
