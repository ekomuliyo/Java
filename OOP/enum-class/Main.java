
public class Main {
    public static void main(String[] args) {
        
        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());
        
        // Enum ke String
        String levelName = Level.VIP.name();
        System.out.println(levelName);
        
        // String ke Enum class
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);
        
        System.out.println("--- isi enum ---");
        // Menampilkan seluruh data class enum
        for(var value: Level.values()) {
            System.out.println(value);
        }


    }    
}

class Customer {
    private String name;

    private Level level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}

enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    // Constructor
    Level(String description) {
        this.description = description;
    }

    String getDescription() {
        return this.description;
    }
}