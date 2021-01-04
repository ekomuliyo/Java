public class Main {

    public static void main(String[] args) {
        connectDatabase("eko", "123");
        System.out.println("sukses");
    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect ke database");
        }
    }
}

class DatabaseError extends Error {
    public DatabaseError(String message) {
        super(message);
    }
}
