package lv.iljapavlovs.cucumber.stepdefs;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lv.iljapavlovs.cucumber.pageobjects.GooglePage;
import lv.iljapavlovs.cucumber.pageobjects.GoogleSearchResultPage;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;
import static org.junit.Assert.fail;

public class GoogleStepdefs {
    private WebDriver driver;
    private GooglePage googlePage;
    private GoogleSearchResultPage googleSearchResultPage;


    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateToGoogleCom(String url) throws Throwable {
        googlePage = Selenide.open("https://" + url, GooglePage.class);
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String searchItem) throws Throwable {
        googleSearchResultPage = googlePage.searchFor(searchItem);
    }

    @Then("^first result should contain word \"([^\"]*)\"$")
    public void firstResultShouldContainWord(String searchResult) throws Throwable {
        googleSearchResultPage.getResults().get(0).shouldHave(text(searchResult));
    }

    @And("^I purposefully fail this scenario to get a screenshot")
    public void iPurposefullyFailThisFeature() throws Throwable {
        fail();
    }

    @And("^I wait for (\\d+) seconds$")
    public void iWaitForSeconds(int waitTimeInSeconds) throws Throwable {
        Thread.sleep(waitTimeInSeconds * 1000);
    }
}
