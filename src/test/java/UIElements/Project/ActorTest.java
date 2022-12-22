package UIElements.Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    @Test
    public void actorConstructor(){
        Actor actor = new Actor();
        Assertions.assertTrue(true);
        Actor actor2 = new Actor("John", "Doe");
        Assertions.assertTrue(true);
    }

    @Test
    public void actorGettersAndSetters(){
        Actor actor = new Actor();
        actor.setActorId(1);
        actor.setFirstName("John");
        actor.setLastName("Doe");
        Assertions.assertEquals("John", actor.getFirstName());
        Assertions.assertEquals("Doe", actor.getLastName());
        Assertions.assertEquals(1, actor.getActorId());
    }

}
