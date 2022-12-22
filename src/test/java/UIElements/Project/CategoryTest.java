package UIElements.Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void filmConstructor(){
        Category category = new Category();
        Assertions.assertTrue(true);
    }

    @Test
    public void filmGettersAndSetters(){
        Category category = new Category();
        category.setCategoryId(1);
        category.setName("Name");
        Assertions.assertEquals(1, category.getCategoryId());
        Assertions.assertEquals("Name", category.getName());
    }

}
