package belajar.unit.test;

import belajar.unit.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
// @DisplayName("Test untuk Calculator class")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each");
    }

    @Test
    // @DisplayName("Test skenario success untuk method add(Integer, Integer)")
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    // @DisplayName("Test skenario success untuk method divide(Integer, Integer)")
    public void testDivideSuccess() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    // @DisplayName("Test skenario error untuk method divide(Integer, Integer)")
    public void testDivideError() {
        assertThrows(IllegalArgumentException.class, () -> {
           calculator.divide(10, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon() {
    }

    @Test
    public void testAborted() {
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)) {
            throw new TestAbortedException("Test dibatalkan karena buka DEV");
        }

        // unit test untuk DEV
    }

    @Test
    public void testAssumtion() {
        assumeTrue("DEV".equals(System.getenv("PROFILE")));

        // unit test untuk DEV
    }



}
