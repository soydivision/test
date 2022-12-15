import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class CommonCond {

    public final String MAIN_URL = "http://testingchallenges.thetestingmap.org/index.php";

    @BeforeSuite(alwaysRun = true)
    void beforeSuiteSetUp() {
    }

    @AfterClass(alwaysRun = true)
    public void clearBrowser() {
        open("https://example.com/");
        clearBrowserCookies();
    }
}
