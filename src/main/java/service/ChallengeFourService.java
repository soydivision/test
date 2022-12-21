package service;

import pages.ChallengeFourPage;

import static com.codeborne.selenide.Selenide.open;

public class ChallengeFourService {
    private ChallengeFourPage page = new ChallengeFourPage();
    String HOME_URL = "http://testingchallenges.thetestingmap.org/challenge4.php";

    public void openHome() {
        open(HOME_URL);
    }

    public String checkCNP(String value) {
        return page.setInput(value)
                .clickSubmit()
                .getTextSuccessValues();
    }

    public ChallengeFourPage submitValue(String value) {
        return page.setInput(value)
                .clickSubmit();
    }

    public String checkFinalMessage(String value) {
        return page.getFinalMessage();
    }

}
