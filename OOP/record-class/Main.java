
public class Main {
    public static void main(String[] args) {
        
        LoginRequest login = new LoginRequest("Eko", "password");

        System.out.println(login);
        System.out.println(login.username());
        System.out.println(login.password());
        
        
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("eko"));
        System.out.println(new LoginRequest("eko", "password"));
    }
}

record LoginRequest(String username, String password) { 
    
    // Constructor
    LoginRequest {
        System.out.println("ini constructor class record");
    }

    // Overloading constructor 
    LoginRequest(String username) {
        this(username, "");
    }

    LoginRequest() {
        this("", "");
    }

}