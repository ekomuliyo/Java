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

    static int num;
    static String mystr;
    static{
        System.out.println("this is static block 1");
        num = 96;
        mystr = "static keyword 1";
    }
    static{
        System.out.println("this is static block 2");
        num = 100;
        mystr = "static keyword 2";
    }

    static int var1 = 10;
    static String var2 = "hello static keyword";

    static void display(){
        System.out.println("var1 is : " + var1);
        System.out.println("var2 is : " + var2);
    }

    static int var3 = 66;
    String var4;

    public static void main(String[] args) {
        
        // static
        Date now = new Date();
        String formatDate = MyDateUtil.getFormatDate(now);
        System.out.println(formatDate);
        
        System.out.println();
        // non-static
        MyAddSub myAddSub = new MyAddSub();
        myAddSub.set(10);
        System.out.println(myAddSub.get());

        System.out.println();
        // multiple static block
        System.out.println("value num : "+ num);
        System.out.println("value mystr : "+ mystr);

        System.out.println();
        // mengakses variabel static di method static
        display();

        System.out.println();
        // variabel static akan dibagi ketika ada beberapa instansiasi dari class nya / ditimpa
        Main main1 = new Main();
        Main main2 = new Main();

        main1.var3 = 100;
        main1.var4 = "saya object main1";

        main2.var3 = 200;
        main2.var4 = "saya object main2";

        // variabel var3 akan di overite setiap ada perubahan nilai di instansiasi baru
        System.out.println("main1 int : "+ main1.var3);
        System.out.println("main1 String : "+ main1.var4);
        System.out.println("main2 int : "+ main2.var3);
        System.out.println("main2 String :"+ main2.var4);
    }
}