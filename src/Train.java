import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Dell on 03/29/2022.
 */
public class Train {

    private SimpleDateFormat sdf = new SimpleDateFormat("h:mm a", Locale.US);

    String getTicketType(String time1) {
        Date tTime = getDate(time1);
        if (tTime.before(getDate("9:30 Am")))
            return "Ticket is Full";

        else if (tTime.after(getDate("9:29 Am")) && tTime.before(getDate("4:01 Pm")))
            return "Ticket is Sever";

        else if (tTime.after(getDate("4:00 Pm")) && tTime.before(getDate("7:31 Pm")))
            return "Ticket is Full";

            // then Time after "7:30 Pm"
        else return "Ticket is Sever";
    }

    private Date getDate(String time) {
        try {
            return sdf.parse(time);
        } catch (ParseException e) {
            System.out.println( "Parse Exception: Unparseable date");
        }return new Date();
    }
}
