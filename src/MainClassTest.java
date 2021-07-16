import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass main = new MainClass();

    int checkNumber = 14;
    int actualNumber = main.getLocalNumber(16);

    int classNumber = main.getClassNumber();

    @Test
    public void testGetLocalNumber() {
        if (checkNumber != actualNumber) {
            Assert.fail("Method to return number equal 14 doesn't work correcly");
        }
            else {
                System.out.println("Test Passed");
            }
        }

    @Test
    public void testGetClassNumber() {
        if (classNumber > 45) {
            System.out.println("Test passed");
        }
        else {
            Assert.fail("class_number is actually les than 45");
        }
    }

    @Test
    public void testGetClassString() {
        if (main.getClassString().contains("hello") || main.getClassString().contains("Hello")) {
            System.out.println("Test passed");
        }
        else {
            Assert.fail("Sting doesn't contain words: hello, Hello");
        }
    }

}
