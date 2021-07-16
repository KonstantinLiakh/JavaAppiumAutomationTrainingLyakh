import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass class1 = new MainClass();

    int checkNumber = 14;
    int actual1 = class1.getLocalNumber(16);
    @Test
    public void testGetLocalNumber() {
        if (checkNumber != actual1) {
            Assert.fail("Method return not 14 value");
        }
            else {
                System.out.println("Success");
            }
        }
}
