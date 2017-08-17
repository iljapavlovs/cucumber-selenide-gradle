package lv.iljapavlovs.cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:build/cucumber/eggs", "json:build/cucumber/cucumber-eggs.json"},
        features = {"src/test/resources/features"},
        tags = {"@eggs"},
        glue = {"lv.iljapavlovs.cucumber.stepdefs", "lv.iljapavlovs.cucumber.hooks"}
)
public class RunCukesEggsTest {

}
