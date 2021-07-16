import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass main = new MainClass();

    int checkNumber = 14;
    int actualNumber = main.getLocalNumber(16);

    @Test
    public void testGetLocalNumber() {
        if (checkNumber != actualNumber) {
            Assert.fail("Method to return number equal 14 doesn't work correcly");
        }
            else {
                System.out.println("Test Passed");
            }
        }
}
