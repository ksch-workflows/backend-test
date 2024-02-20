package ksch.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {

    @Given("an example scenario")
    public void an_example_scenario() {

    }

    @When("all step definitions are implemented")
    public void all_step_definitions_are_implemented() {

    }

    @Then("the scenario passes")
    public void the_scenario_passes() {
        throw new RuntimeException("Just a test");
    }
}
