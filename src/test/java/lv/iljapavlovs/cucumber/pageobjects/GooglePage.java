package lv.iljapavlovs.cucumber.pageobjects;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {

    @FindBy(name = "q")
    private SelenideElement inputField;

    public GoogleSearchResultPage searchFor(String textToSearchFor) {
        inputField.val(textToSearchFor).pressEnter();
        return Selenide.page(GoogleSearchResultPage.class);
    }

}