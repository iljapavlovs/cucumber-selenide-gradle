package lv.iljapavlovs.cucumber.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;


public class GoogleSearchResultPage {

    @FindBy(className = "g")
    private ElementsCollection searchResultElements;

    public ElementsCollection getResults() {
        return searchResultElements;
    }
}
