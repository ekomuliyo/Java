package anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Class, interface (including annotation type), enum, or record
@Target(value = {ElementType.TYPE}) 

// Source = hanya berguna di kodingan, informasi tidak berguna saat compile
// Class = hanya bisa dimasukan pada class, tidak berguna di dalam code program
// Runtime = akan dimasukan ke dalam class hasil compile, dan informasi bisa diambil saat runtime / aplikasi dijalankan
@Retention(value = RetentionPolicy.RUNTIME) 

public @interface Fancy {

    String name();

    String[] tags() default {};
}