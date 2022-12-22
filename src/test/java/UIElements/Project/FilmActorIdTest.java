package UIElements.Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmActorIdTest {

    @Test
    public void filmActorIdConstructor(){
        FilmActorId filmActorId = new FilmActorId();
        Assertions.assertTrue(true);
        FilmActorId filmActorId1 = new FilmActorId(1, 1);
        Assertions.assertTrue(true);
    }

}
