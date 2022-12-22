package UIElements.Project.cucumber;

import UIElements.Project.Actor;
import UIElements.Project.ActorRepository;
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

public class ShowFilmsForActorStepDef {

    @Autowired
    ActorRepository actorRepository;

    int actorid;
    Iterable<FilmsWithActorInterface> films;

    @Given("an actor exists with id {int} and has films")
    public void an_actor_exists_with_id_and_has_films(int id){
        this.actorid = id;
        this.actorRepository.findById(actorid).orElseThrow(() -> new ResourceAccessException("Actor with ID: " + actorid + " does not exist."));
    }

    @When("i request an actors films")
    public void i_request_an_actors_films(){
        films = this.actorRepository.getFilmsWithActor(actorid);
        Assertions.assertNotEquals(null, films, "Films were not retrieved for actor");
    }

    @Then("the webpage should show the actors {string} list")
    public void the_webpage_should_show_the_actors_films(String films){
        String correctdetails = films;
        String testdetails = "";
        for(FilmsWithActorInterface film : this.films){
            testdetails += film.gettitle();
        }
        Assertions.assertEquals(correctdetails, testdetails, "Films details for actor do not match");
    }

}
