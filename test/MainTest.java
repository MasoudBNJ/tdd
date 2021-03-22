import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testHelloWorld() {
        Assert.assertEquals(Main.getHelloWorld(), "Hello World!");
    }
}
