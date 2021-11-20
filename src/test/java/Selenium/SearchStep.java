package Selenium;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStep extends SeleniumStep{

    @Given("^a web browser is at the Verint home page$")
    public void aWebBrowserIsAtTheHepsiburadaHomePage() {
        geturl();
    }

    @When("^the user click search icon$")
    public void theUserClickSearchIcon() {
        findElementClick("nav-toggle",Pather.id);
    }

    @And("^user enters search item$")
    public void userEnterSearchItem() {
        findElement("downshift-0-input",Pather.id,"").sendKeys("customer solution");
    }

    @Then("^user click search button$")
    public void userSeesTheRegistrationForm() {
        findElementClick("//button[@class='sj-input__button css-1k4nm74']",Pather.xPath);
    }

    @And("^scroll to contain content$")
    public void userScroolToResult(){
        PageScrolldown();
    }

    @And("^driver close$")
    public void driverClose() {
        DriverQuit();
    }
}
