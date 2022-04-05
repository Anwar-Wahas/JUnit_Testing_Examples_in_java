import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Dell on 04/04/2022.
 */

public class BankTest {
    Bank bank;
    double delta = 3 * 0.003333;

    @Before
    public void setUp() throws Exception {
        bank = new Bank();
    }

    @Test(expected = IllegalArgumentException.class)
    public void balanceLessThan0Boundary() throws IllegalArgumentException {
         bank.calculatingInterest(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void balanceLessThan0() throws IllegalArgumentException {
        bank.calculatingInterest(-20.00);
    }

    ////////////////////////////////////////////////////////////////////
    @Test
    public void balanceLessBetween0And100Boundary1() {
        double result = bank.calculatingInterest(0.00);
        assertEquals(0.00, result, delta);

    }

    @Test
    public void balanceLessBetween0And100() {
        double result = bank.calculatingInterest(50.00);
        assertEquals(51.50, result, delta);

    }

    @Test
    public void balanceLessBetween0And100Boundary2() {
        double result = bank.calculatingInterest(100.00);
        assertEquals(103.00, result, delta);

    }

    ////////////////////////////////////////////////////////
    @Test
    public void balanceLessBetween100And1000Boundary1() {
        double result = bank.calculatingInterest(100.01);
        assertEquals(105.01, result, delta);

    }

    @Test
    public void balanceLessBetween100And1000() {
        double result = bank.calculatingInterest(300.00);
        assertEquals(315.00, result, delta);

    }

    @Test
    public void balanceLessBetween100And1000Boundary2() {
        double result = bank.calculatingInterest(999.99);
        assertEquals(1049.98, result, delta);

    }

    //////////////////////////////////////////////////////////////
    @Test
    public void balanceMoreOrEqualeThan1000Boundary() {
        double result = bank.calculatingInterest(1000.00);
        assertEquals(1070.00, result, delta);

    }

    @Test
    public void balanceMoreOrEqualeThan1000() {
        double result = bank.calculatingInterest(1200.00);
        assertEquals(1284.00, result, delta);

    }
}
