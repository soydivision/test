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
        String expectedValueOne = "1"; // firstCNP expected success rate
        String testOne = challengeFourService.checkCNP(DataGenerator.generateCNP());
        //Assert.assertEquals(testOne, expectedValueOne);
    }

    @Test(dependsOnMethods = "validateFirstCNP")
    public void checkInputTwo() {
        String expectedValueTwo = "2";
        String testOne = challengeFourService.checkCNP(DataGenerator.generateCNP());
        // Assert.assertEquals(testOne, expectedValueTwo);
    }

    @Test(dependsOnMethods = "checkInputTwo")
    public void checkInputThree() {
        String expectedValueTwo = "3";
        String testOne = challengeFourService.checkCNP(DataGenerator.generateCNP());
        //  Assert.assertEquals(testOne, expectedValueTwo);
    }

    @Test(dependsOnMethods = "checkInputThree")
    public void checkInputFour() {
        String expectedValueTwo = "4";
        String testOne = challengeFourService.checkCNP(DataGenerator.generateCNP());
        //  Assert.assertEquals(testOne, expectedValueTwo);
    }

    @Test(dependsOnMethods = "checkInputFour")
    public void checkInputFive() {
        String expectedValueTwo = "";
        String textone = challengeFourService.submitValue(DataGenerator.generateCNP()).getFinalMessage();
        Assert.assertEquals(textone, "YOU HAVE DONE IT. Please enter your name.");
    }
}
