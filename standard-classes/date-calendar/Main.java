import java.util.Calendar;
import java.util.Date;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.HOUR, 11);
        calendar.set(Calendar.MINUTE, 30);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}