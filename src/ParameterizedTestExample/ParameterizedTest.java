package ParameterizedTestExample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dell on 04/05/2022.
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {
    private ParameterizedClass p;
    private boolean result;
    private int number;


    public ParameterizedTest(int number, boolean result) {
        super();
        this.number = number;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        p = new ParameterizedClass();

    }


    @Parameterized.Parameters
    public static Collection checkIfOddNumber() {
        return Arrays.asList(new Object[][]{
                {11, true}, {24, false}, {45, true}, {67, true}, {82, false},});
    }

    @Test
    public void checkIfOddNumbeTest() throws Exception {
        System.out.println("parameter number is:" + number+"\tIs it odd? "+result);
        assertEquals(result, p.checkIfOddNumber(number));
    }
}
