import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Dell on 03/29/2022.
 */
public class Train {

    private SimpleDateFormat sdf = new SimpleDateFormat("h:mm a", Locale.US);
    final String full = "Ticket is Full";
    final String sever = "Ticket is Sever";

    String getTicketType(String time1) {
        Date tTime = getDate(time1);
        if (tTime.before(getDate("9:30 Am")))
            return full;

        else if (tTime.before(getDate("4:01 Pm")))
            return sever;

        else if (tTime.before(getDate("7:31 Pm")))
            return full;

            // then Time after "7:30 Pm"
        else return sever;
    }

    private Date getDate(String time) {
        try {
            return sdf.parse(time);
        } catch (ParseException e) {
            System.out.println("Parse Exception: Unparseable date");
        }
        return new Date();
    }
}
