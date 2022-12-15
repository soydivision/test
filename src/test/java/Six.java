import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class Six {

    SelenideElement dateAndTimeInput = element(Selectors.byAttribute("name", "date_time"));

    @Test
    public void checkInput() {
        open("http://testingchallenges.thetestingmap.org/challenge6.php");
        dateAndTimeInput.sendKeys();


    }


}
