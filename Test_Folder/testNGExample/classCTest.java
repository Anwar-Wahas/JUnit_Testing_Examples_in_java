package testNGExample;

import org.testng.annotations.Test;


/**
 * Created by Dell on 04/05/2022.
 */
public class classCTest {
    @Test(groups = {"group1"})
    public void testCalculatingInterest(){
        classC c=new classC();
        c.funC();
    }

}