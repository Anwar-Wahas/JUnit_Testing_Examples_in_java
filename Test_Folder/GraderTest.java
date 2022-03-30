import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dell on 03/30/2022.
 */
public class GraderTest {
    Grader grader;

    @Before
    public void setUp() throws Exception {
        grader = new Grader();

    }

    @Test
    public void grade_is_A_Boundary1() {
        char result = grader.determineLetterGrade(90);
        assertEquals('A', result);
    }

    @Test
    public void grade_is_A() {
        char result = grader.determineLetterGrade(95);
        assertEquals('A', result);
    }

    @Test
    public void grade_is_A_Boundary2() {
        char result = grader.determineLetterGrade(100);
        assertEquals('A', result);
    }
    //////////////////////////////////////////////////////////////

    @Test
    public void grade_is_B_Boundary1() {
        char result = grader.determineLetterGrade(80);
        assertEquals('B', result);
    }

    @Test
    public void grade_is_B() {
        char result = grader.determineLetterGrade(84);
        assertEquals('B', result);
    }

    @Test
    public void grade_is_B_Boundary2() {
        char result = grader.determineLetterGrade(89);
        assertEquals('B', result);
    }

    //////////////////////////////////////////////////////////////////////
    @Test
    public void grade_is_C_Boundary1() {
        char result = grader.determineLetterGrade(70);
        assertEquals('C', result);
    }

    @Test
    public void grade_is_C() {
        char result = grader.determineLetterGrade(76);
        assertEquals('C', result);
    }

    @Test
    public void grade_is_C_Boundary2() {
        char result = grader.determineLetterGrade(79);
        assertEquals('C', result);
    }

    //////////////////////////////////////////////////////////////
    @Test
    public void grade_is_D_Boundary1() {
        char result = grader.determineLetterGrade(60);
        assertEquals('D', result);
    }

    @Test
    public void grade_is_D() {
        char result = grader.determineLetterGrade(66);
        assertEquals('D', result);
    }

    @Test
    public void grade_is_D_Boundary2() {
        char result = grader.determineLetterGrade(69);
        assertEquals('D', result);
    }

    ////////////////////////////////////////////////////////////////
    @Test
    public void grade_is_F_Boundary1() {
        char result = grader.determineLetterGrade(0);
        assertEquals('F', result);
    }

    @Test
    public void grade_is_F() {
        char result = grader.determineLetterGrade(22);
        assertEquals('F', result);
    }

    @Test
    public void grade_is_F_Boundary2() {
        char result = grader.determineLetterGrade(59);
        assertEquals('F', result);
    }
    ///////////////////////////////////////////////////////////////

    @Test(expected = IllegalArgumentException.class)
    public void grade_is_less_than_0() {
        grader.determineLetterGrade(-1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void grade_is_more_than_100() {
        grader.determineLetterGrade(101);
    }
}