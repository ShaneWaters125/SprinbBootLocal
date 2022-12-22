package UIElements.Project;

import java.io.Serializable;
import java.util.Objects;

public class FilmCategoryId implements Serializable {

    private int filmId;

    private int categoryId;

    public FilmCategoryId(int filmId, int categoryId){
        this.filmId = filmId;
        this.categoryId = categoryId;
    }

    public FilmCategoryId(){}
}
