import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Main
 */


class MyDateUtil{
    static final String TARGET_DATE_PATTERN = "mm/dd/yyyy";

    public static String getFormatDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(TARGET_DATE_PATTERN);
        return sdf.format(date);
    }
}

class MyAddSub{
    int value;

    public void set(int x){
        value = x;
    }

    public int get(){
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        
        // static
        Date now = new Date();
        String formatDate = MyDateUtil.getFormatDate(now);
        System.out.println(formatDate);
        
        // non-static
        MyAddSub myAddSub = new MyAddSub();
        myAddSub.set(10);
        System.out.println(myAddSub.get());
    }
}