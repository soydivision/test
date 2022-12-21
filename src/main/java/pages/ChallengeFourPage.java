package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class ChallengeFourPage {

    private SelenideElement submit = element(Selectors.byAttribute("type", "submit"));
    private SelenideElement inputFieldForCNP = element(Selectors.byXpath("//input[@class='inputbox']"));
    private SelenideElement successfulCNPCount = element(Selectors.byXpath("//span[@class='values-tested']"));
    private SelenideElement finalSuccessMessage = element(Selectors.byText("YOU HAVE DONE IT. Please enter your name."));

    public ChallengeFourPage clickSubmit() {
        submit.click();
        return this;
    }

    public ChallengeFourPage setInputFieldForCNP(String value) {
        inputFieldForCNP.sendKeys(value);
        return this;
    }

    public String getSuccessfulCNPCount() {
        return successfulCNPCount.getText();
    }

    public String getFinalSuccessMessage() {
        return finalSuccessMessage.getText();
    }
}






















