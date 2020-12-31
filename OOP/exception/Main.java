public class Main {
    public static void main(String[] args) {
        
        LoginRequest loginRequest = new LoginRequest("Eko", null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Pesan error : " +e.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
    }
}

class ValidationUtil {
    
    static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }
}

class ValidationException extends Throwable {
    
    ValidationException(String message) {
        super(message);
    }
}

class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
}

record LoginRequest(String username, String password) { 
    
    // Constructor
    LoginRequest {
        System.out.println("membuat object LoginRequest");
    }

    // Overloading constructor 
    LoginRequest(String username) {
        this(username, "");
    }

    LoginRequest() {
        this("", "");
    }

}

