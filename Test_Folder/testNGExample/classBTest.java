package testNGExample;

import org.testng.annotations.Test;

/**
 * Created by Dell on 04/05/2022.
 */
public class classBTest {
    @Test(groups = {"group1"})
    public void testCalculatingInterest() {
        classB b=new classB();
        b.funB();
    }
}