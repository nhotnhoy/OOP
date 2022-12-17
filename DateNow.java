
package OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class DateNow {
    Calendar cal = Calendar.getInstance();
    Date date = cal.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
}
