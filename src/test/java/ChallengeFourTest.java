import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.ChallengeFourService;
import utils.DataGenerator;

public class ChallengeFourTest {
    private ChallengeFourService challengeFourService = new ChallengeFourService();

    @BeforeClass
    public void openApplicationTestingPage() {
        challengeFourService.openHome();
    }

    @Test
    public void validateFirstCNP() {
        String expectedValue = "1"; // firstCNP expected success rate
        String testOne = challengeFourService.checkCNP(DataGenerator.generateCNP());
        Assert.assertEquals(testOne, expectedValue);
    }

    @Test(dependsOnMethods = "validateFirstCNP")
    public void checkInputTwo() {
        String expectedValue = "2";
        String testOne = challengeFourService.checkCNP(DataGenerator.generateCNP());
        Assert.assertEquals(testOne, expectedValue);
    }

    @Test(dependsOnMethods = "checkInputTwo")
    public void checkInputThree() {
        String expectedValue = "3";
        String testOne = challengeFourService.checkCNP(DataGenerator.generateCNP());
        Assert.assertEquals(testOne, expectedValue);
    }

    @Test(dependsOnMethods = "checkInputThree")
    public void checkInputFour() {
        String expectedValue = "4";
        String testOne = challengeFourService.checkCNP(DataGenerator.generateCNP());
        Assert.assertEquals(testOne, expectedValue);
    }

    @Test(dependsOnMethods = "checkInputFour")
    public void checkInputFive() {
        String expectedMessage = "YOU HAVE DONE IT. Please enter your name.";
        String successMessage = challengeFourService.submitValue(DataGenerator.generateCNP()).getFinalSuccessMessage();
        Assert.assertEquals(successMessage, expectedMessage);
    }
}
