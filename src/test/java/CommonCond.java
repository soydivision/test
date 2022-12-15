import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.*;

public class CommonCond {
    SelenideElement submitButton = element(Selectors.byAttribute("type", "submit"));

    @BeforeSuite(alwaysRun = true)
    void beforeSuiteSetUp() {
    }

    @AfterClass(alwaysRun = true)
    public void clearBrowser() {
        open("https://example.com/");
        clearBrowserCookies();
    }
}
