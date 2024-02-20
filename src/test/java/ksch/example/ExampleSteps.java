package ksch.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Given("an example scenario")
    public void an_example_scenario() {
        System.out.println();
        applicationEventPublisher.publishEvent("Hello");
    }

    @When("all step definitions are implemented")
    public void all_step_definitions_are_implemented() {

    }

    @Then("the scenario passes")
    public void the_scenario_passes() {
        //throw new RuntimeException("Just a test");
    }
}
