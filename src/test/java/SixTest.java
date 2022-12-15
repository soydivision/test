import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static com.codeborne.selenide.Selenide.*;

public class SixTest extends CommonCond {

    SelenideElement dateAndTimeInput = element(Selectors.byAttribute("name", "date_time"));

    @Test
    public void checkInput() {
        open("http://testingchallenges.thetestingmap.org/challenge6.php");
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("Europe/Amsterdam"));
        String dateAmsterdam = df.format(date);
        System.out.println(dateAmsterdam);
        dateAndTimeInput.clear();
        sleep(5000);
        dateAndTimeInput.sendKeys(dateAmsterdam);
        submitButton.click();
    }
}
