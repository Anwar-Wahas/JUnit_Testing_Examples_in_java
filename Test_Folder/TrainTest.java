import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dell on 03/29/2022.
 */
public class TrainTest {

    private Train train;

    @Before
    public void setUp() throws Exception {
        train = new Train();
    }

    @Test
    public void time_Before_9_30Am_Boundary() {
        String result = train.getTicketType("9:29 Am");
        assertEquals("Ticket is Full", result);
    }

    @Test
    public void time_Before_9_30Am() {
        String result = train.getTicketType("8:35 Am");
        assertEquals("Ticket is Full", result);
    }

    //////////////////////////////////////////////////////////////
    @Test
    public void time_Between_9_30Am_And_4_00Pm_Boundary1() {
        String result = train.getTicketType("9:30 Am");
        assertEquals("Ticket is Sever", result);
    }

    @Test
    public void time_Between_9_30Am_And_4_00Pm() {
        String result = train.getTicketType("12:30 Pm");
        assertEquals("Ticket is Sever", result);
    }

    @Test
    public void time_Between_9_30Am_And_4_00Pm__Boundary2() {
        String result = train.getTicketType("04:00 Pm");
        assertEquals("Ticket is Sever", result);
    }

    //////////////////////////////////////////////////////////////////
    @Test
    public void time_After_04_00Pm_Until_07_30Pm__Boundary1() {
        String result = train.getTicketType("04:01 Pm");
        assertEquals("Ticket is Full", result);
    }

    @Test
    public void time_After_04_00Pm_Until_07_30Pm_Cases2() {
        String result = train.getTicketType("06:22 Pm");
        assertEquals("Ticket is Full", result);
    }

    @Test
    public void time_After_04_00Pm_Until_07_30Pm_Boundary2() {
        String result = train.getTicketType("07:30 Pm");
        assertEquals("Ticket is Full", result);
    }

    //////////////////////////////////////////////////////////////////
    @Test
    public void time_After_07_30Pm_Boundary() {
        String result = train.getTicketType("07:31 Pm");
        assertEquals("Ticket is Sever", result);
    }

    @Test
    public void time_After_07_30Pm() {
        String result = train.getTicketType("10:20 Pm");
        assertEquals("Ticket is Sever", result);
    }

    @Test
    public void invalid_Date_Format() throws ParseException {
        train.getTicketType("19:45");
    }
}