import org.junit.Assert;
import org.junit.Test;

public class SomeTest {
    @Test(expected = ArithmeticException.class)
    public void doSmth() {
        int i = 2;
        int b = i / 0;
    }

    @Test
    public void doOther() {
        int i = 2;
        Assert.assertEquals(i * i, 4);
    }

    @Test
    public void doFail() {
        Assert.fail("fail here!!");
    }
}
