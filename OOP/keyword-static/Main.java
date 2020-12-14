public class Main {
    public static void main(String[] args) {
    
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
            MathUtil.sum(10, 10, 10, 20)
        );

        Country.City city = new Country.City();
        city.setName("Palembang");
        System.out.println(city.getName());


        System.out.println(Application.PROCESSORS);
    }
}

class Constant {
    public static final String APPLICATION = "Belajar OOP JAVA";
    public static final int VERSION = 1;
}

class MathUtil {
    
    public static int sum(int... values) {
        int total = 0;
        for(var value: values) {
            total += value;
        }
        return total;
    }
}

class Country {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class City {
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

}