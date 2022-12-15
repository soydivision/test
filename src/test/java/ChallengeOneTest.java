import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ChallengeOneTest extends CommonCond {
    String mockName = "Michael101";
    SelenideElement firstName = element(Selectors.byId("firstname"));
    SelenideElement submitButton = element(Selectors.byAttribute("type", "submit"));
    SelenideElement confirmation = element(Selectors.byXpath("//*[contains(text()," + mockName + " from Norway)]"));

    @Test
    public void checkName() {
        open(MAIN_URL);
        firstName.sendKeys(mockName);
        submitButton.click();
        confirmation.should(Condition.exist);


    }
}
