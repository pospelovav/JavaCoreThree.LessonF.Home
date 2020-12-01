import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassAfterNumberArrayTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {new int[]{1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}},
                {new int[]{9, 2, 6}, new int[]{7, 4, 4, 8, 3, 4, 9, 2, 6}},
                {new int[]{7, 9, 2, 7}, new int[]{3, 5, 6, 4, 7, 9, 2, 7}},
                {new int[]{2, 9, 7}, new int[]{6, 8, 1, 4, 3, 4, 7, 9, 6, 4, 2, 9, 7}}
        });
    }

    private int[] arrResult;
    private int[] arr;
    public static final int NUMBER_POINT = 4; //число для создания новго массива

    public MassAfterNumberArrayTest(int[] arrResult, int[] arr){
        this.arrResult = arrResult;
        this.arr = arr;
    }

    AfterNumberArray arrAfter;

    @Before
    public void init() {
        arrAfter = new AfterNumberArray();
    }

    @Test
    public void massTestAfterNumberArray() {
        Assert.assertArrayEquals(arrResult, arrAfter.afterNumberArray(arr, NUMBER_POINT));
    }

    @After
    public void shutdown() {
        System.out.println("end test");
    }
}
