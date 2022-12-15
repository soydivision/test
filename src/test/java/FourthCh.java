import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.getFocusedElement;
import static com.codeborne.selenide.Selenide.open;

public class FourthCh {
    StringBuilder CNP = new StringBuilder(100);

    @Test
    public void checkInput() {
        //open("http://testingchallenges.thetestingmap.org/challenge4.php");
        CNP.append(RandomNumberGen.getRandomNumber(1, 9));

        CNP.append(RandomNumberGen.getRandomNumber(0, 12));

        CNP.append(RandomNumberGen.getRandomNumber(0, 9));
        CNP.append(RandomNumberGen.getRandomNumber(0, 9));
        CNP.append(RandomNumberGen.getRandomNumber(0, 9));
        CNP.append(RandomNumberGen.getRandomNumber(0, 9));
        System.out.println(CNP);
    }


}
