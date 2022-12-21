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
        return page.setInputFieldForCNP(value)
                .clickSubmit()
                .getSuccessfulCNPCount();
    }

    public ChallengeFourPage submitValue(String value) {
        return page.setInputFieldForCNP(value)
                .clickSubmit();
    }

    public String checkFinalMessage(String value) {
        return page.getFinalSuccessMessage();
    }

}
