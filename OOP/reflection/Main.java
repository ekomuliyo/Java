import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("Eko");
        createUserRequest.setPassword("Eko123");
        createUserRequest.setName("Eko Muliyo");

        validationReflection(createUserRequest);
    }
     

    public static void validationReflection(Object object) {

        // mengambil object class
        Class aClass = object.getClass();

        // mengambil semua field dari class
        Field[] fields = aClass.getDeclaredFields();

        // melakukan iterasi ke semua field
        for(var field : fields) {
            // mengatur field bisa diakses semua (private, protected)
            field.setAccessible(true);

            // memeriksa apakah field dari kelas memiliki anotation NotBlank
            if(field.getAnnotation(NotBlank.class) != null) {
                
                try{
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                }catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field : " + field.getName());
                }

            }
        }

    }
}

class CreateUserRequest {

    @NotBlank
    private String username;
    
    @NotBlank
    private String password;

    @NotBlank
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
}

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface NotBlank {

}