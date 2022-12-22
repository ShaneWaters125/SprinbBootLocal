package UIElements.Project.cucumber;

import UIElements.Project.Actor;
import UIElements.Project.ActorRepository;
import UIElements.Project.FilmRepository;
import UIElements.Project.ReturnInterfaces.FilmWithActorInterface;
import UIElements.Project.ReturnInterfaces.FilmsWithActorInterface;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ShowActorsForFilmStepDef {

    @Autowired
    FilmRepository filmRepository;

    int filmid;
    Iterable<FilmWithActorInterface> actors;

    @Given("a film exists with id {int} and has actors")
    public void an_film_exists_with_id_and_has_actors(int id){
        this.filmid = id;
        this.filmRepository.findById(filmid).orElseThrow(() -> new ResourceAccessException("Film with ID: " + filmid + " does not exist."));
    }

    @When("i request a films actors")
    public void i_request_a_films_actors(){
        actors = this.filmRepository.matchFilmWithActors(filmid);
        Assertions.assertNotEquals(null, actors, "Actors were not retrieved for film");
    }

    @Then("the webpage should show the films {string} list")
    public void the_webpage_should_show_the_films_actors(String actors){
        String correctdetails = actors;
        String testdetails = "";
        for(FilmWithActorInterface actor : this.actors){
            testdetails += actor.getfirst_name() + " " + actor.getlast_name();
        }
        Assertions.assertEquals(correctdetails, testdetails, "Actors details for film do not match");
    }

}
