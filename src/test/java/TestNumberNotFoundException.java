import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestNumberNotFoundException {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {new int[]{1, 2, 5, 5, 2, 3, 5, 1, 7}},
                {new int[]{7, 8, 7, 8, 3, 6, 9, 2, 6}},
                {new int[]{3, 5, 6, 1, 7, 9, 2, 7}},
                {new int[]{6, 8, 1, 2, 3, 3, 7, 9, 6, 9, 2, 7}}
        });
    }
    private int[] arr;
    public static final int NUMBER_POINT = 4; //число для создания нового массива
    public TestNumberNotFoundException(int[] arr){
        this.arr = arr;
    }

    AfterNumberArray arrAfter;

    @Before
    public void init() {
        arrAfter = new AfterNumberArray();
    }

    @Test
    public void testNumberNotFoundException() {         //тест на выкидывания исключения NumberNotFoundException
        Assertions.assertThrows(NumberNotFoundException.class, () -> {
            arrAfter.afterNumberArray(arr, NUMBER_POINT);
        });

    }

    @After
    public void shutdown() {
        System.out.println("end test");
    }
}
