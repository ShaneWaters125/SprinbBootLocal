package UIElements.Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmCategoryIdTest {

    @Test
    public void filmActorIdConstructor(){
        FilmCategoryId filmCategoryId = new FilmCategoryId();
        Assertions.assertTrue(true);
        FilmCategoryId filmCategoryId1 = new FilmCategoryId(1, 1);
        Assertions.assertTrue(true);
    }

    @Test
    public void filmActorIdEquals(){
        FilmCategoryId filmCategoryId1 = new FilmCategoryId(1, 1);
        FilmCategoryId filmCategoryId2 = new FilmCategoryId(1, 1);
        Assertions.assertEquals(filmCategoryId1, filmCategoryId2);
    }

}
