package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class ChallengeFourPage {

    private SelenideElement submit = element(Selectors.byAttribute("type", "submit"));
    private SelenideElement input = element(Selectors.byXpath("//input[@class='inputbox']"));
    private SelenideElement success = element(Selectors.byXpath("//span[@class='values-tested']"));
    private SelenideElement finalMessage = element(Selectors.byText("YOU HAVE DONE IT. Please enter your name."));

    public ChallengeFourPage clickSubmit() {
        submit.click();
        return this;
    }

    public ChallengeFourPage setInput(String value) {
        input.sendKeys(value);
        return this;
    }

    public String getTextSuccessValues() {
        return success.getText();
    }

    public String getFinalMessage() {
        return finalMessage.getText();
    }
}






















