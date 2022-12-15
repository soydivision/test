import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SecondCh extends CommonCond {
    String mockData = "";
    SelenideElement form = element(Selectors.byAttribute("type", "number"));

    @Test
    public void checkInput() {
        open("http://testingchallenges.thetestingmap.org/challenge2.php");
        form.sendKeys("545454");
        submitButton.click();
    }
}
