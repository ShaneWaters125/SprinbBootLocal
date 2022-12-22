package UIElements.Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmCategoryTest {

    @Test
    public void filmCategoryConstructor(){
        FilmCategory category = new FilmCategory();
        Assertions.assertTrue(true);
    }

    @Test
    public void filmCategoryGettersAndSetters(){
        FilmCategory filmCategory = new FilmCategory();
        Film film = new Film();
        Category category = new Category();
        filmCategory.setFilmId(film);
        filmCategory.setCategoryId(category);
        Assertions.assertEquals(category, filmCategory.getCategoryId());
        Assertions.assertEquals(film, filmCategory.getFilmId());
    }

}
