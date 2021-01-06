public class Main {
    
    public static void main(String[] args) {

        try {
            sampleError();
        }catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                "Eko", "Andi", "Budi"
            };
    
            System.out.println(names[100]);
        }catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
