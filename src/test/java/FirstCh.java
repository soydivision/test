import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FirstCh extends CommonCond {
    String mockName = "Michael101";
    SelenideElement firstName = element(Selectors.byId("firstname"));
    SelenideElement submitButton = element(Selectors.byAttribute("type", "submit"));
    SelenideElement confirmation = element(Selectors.byXpath("//*[contains(text()," + mockName + ")]"));

    @Test
    public void checkName() {
        open("http://testingchallenges.thetestingmap.org/index.php");
        firstName.sendKeys(mockName);
        submitButton.click();
        confirmation.should(Condition.exist);
    }
}
