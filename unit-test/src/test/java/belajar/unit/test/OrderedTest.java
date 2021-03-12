package belajar.unit.test;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    private int counter = 0;

    @BeforeAll
    void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    void afterAll() {
        System.out.println("After all");
    }


    @Test
    @Order(1)
    void tes3() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(2)
    void tes2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(3)
    void tes1() {
        counter++;
        System.out.println(counter);
    }

}
