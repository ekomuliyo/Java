import java.util.Objects;

/**
 * Main
 */
public class Main {

    public static class Data {
        String data;

        public Data(String data) {
            this.data = data;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((data == null) ? 0 : data.hashCode());
            return result;
        }

        @Override
        public String toString() {
            return "Data [data=" + data + "]";
        }
        
    }

    public static void main(String[] args) {
        execute(null);
    }               

    public static void execute(Data data) {
        
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
    
}