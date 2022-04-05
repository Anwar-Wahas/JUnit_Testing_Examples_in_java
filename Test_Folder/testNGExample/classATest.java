package testNGExample;

import org.testng.annotations.Test;

/**
 * Created by Dell on 04/05/2022.
 */
public class classATest {
    @Test(groups = {"group1"})
    public void testCalculatingInterest(){
       classA a=new classA();
        a.funA();
    }
}