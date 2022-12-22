package UIElements.Project.cucumber;

import UIElements.Project.Film;
import UIElements.Project.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ScenarioScope
public class ShowSingleFilmStepDef {

    @Autowired
    FilmRepository filmRepository;

    int filmid;
    Film film;

    @Given("a film exists with id {int}")
    public void a_film_exists_with_id(int id){
        this.filmid = id;
        this.filmRepository.findById(filmid).orElseThrow(() -> new ResourceAccessException("Film with ID: " + filmid + " does not exist."));
    }

    @When("i request a films details")
    public void i_requst_a_films_details(){
        film = this.filmRepository.findById(filmid).orElseThrow(() -> new ResourceAccessException("Film with ID: " + filmid + " does not exist."));
        Assertions.assertNotEquals(null, film, "Film was not retrieved");
    }

    @Then("the webpage should show the films {string}")
    public void the_webpage_should_show_the_films_title(String title){
        String correctdetails = title;
        String testdetails = film.getTitle();
        Assertions.assertEquals(correctdetails, testdetails, "Films details do not match");
    }
}
