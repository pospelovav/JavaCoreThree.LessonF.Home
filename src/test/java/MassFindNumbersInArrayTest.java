import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassFindNumbersInArrayTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {true, new int[]{1, 1, 4, 4, 1, 1, 4, 1, 4}},
                {true, new int[]{1, 1, 4, 1, 1, 4, 1, 4, 1}},
                {false, new int[]{4, 4, 4, 4}},
                {false, new int[]{1, 1, 1, 1}}

        });
    }

    private boolean result;
    private int[] arr;
    public static final int NUMBER_FIND_ONE = 1;  //числа для поиска в массиве
    public static final int NUMBER_FIND_TWO = 4;

    public MassFindNumbersInArrayTest(boolean result, int[] arr){
        this.arr = arr;
        this.result = result;
    }

    FindNumbers findNumbers;

    @Before
    public void init() {
        findNumbers = new FindNumbers();
    }

    @Test
    public void massFindNumbersInArrayTest() {
        Assert.assertTrue(result == findNumbers.findNumbersInArray(arr, NUMBER_FIND_ONE, NUMBER_FIND_TWO));
    }

    @After
    public void shutdown() {
        System.out.println("end test");
    }
}
