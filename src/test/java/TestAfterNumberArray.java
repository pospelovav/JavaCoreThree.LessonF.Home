import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAfterNumberArray {

    Main main;

    @Before
    public void init() {
        System.out.println("init");
        main = new Main();
    }

    @Test
    public void testAfterNumberArray1() {
        Assert.assertArrayEquals(new int[]{1, 7}, main.afterNumberArray(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, 4));
    }

    @After
    public void shutdown() {
        System.out.println("end");
    }
}
