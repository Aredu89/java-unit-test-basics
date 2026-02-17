package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void beforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("Before Each executed test");
    };

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running After each");
    };

    @BeforeAll
    static void beforeAllFn() {
        System.out.println("Before all executed");
    };

    @AfterAll
    static void afterAllFn() {
        System.out.println("After all executed");
    };

    @Test
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must equal 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1 + 9 must not equal 6");
    }

    @Test
    void testNullAndNotNull() {
        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "Luv2Code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @Test
    void testSameAndNotSame() {
        System.out.println("Running test: testSameAndNotSame");

        String str1 = demoUtils.getAcademy();
        String str2 = demoUtils.getAcademyDuplicate();

        assertSame(str1, str2, "Objects should refer to the same object in memory");
        assertNotSame(new String("Luv2Code Academy"), demoUtils.getAcademy(), "Objects should not refer to the same object in memory");
    }

    @Test
    void testTrueFalse() {
        System.out.println("Running test: testTrueFalse");

        assertTrue(demoUtils.isGreater(5, 2), "5 is greater than 2");
        assertFalse(demoUtils.isGreater(2, 5), "2 is not greater than 5");
    }

    @Test
    void testArrayEquals() {
        System.out.println("Running test: testArrayEquals");

        String[] expected = {"A", "B", "C"};
        String[] actual = demoUtils.getFirstThreeLettersOfAlphabet();

        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    @Test
    void testIterableEquals() {
        System.out.println("Running test: testIterableEquals");

        Iterable<String> expected = List.of("luv", "2", "code");
        Iterable<String> actual = demoUtils.getAcademyInList();

        assertIterableEquals(expected, actual, "Iterables should be equal");
    }

     @Test
     void testThrows() {
         System.out.println("Running test: testThrows");

         assertThrows(Exception.class, () -> demoUtils.throwException(-1), "Should throw an exception for negative input");
         assertDoesNotThrow(() -> demoUtils.throwException(1), "Should not throw an exception for non-negative input");
     }

     @Test
     void testTimeout() {
         System.out.println("Running test: testTimeout");

         assertTimeoutPreemptively(java.time.Duration.ofSeconds(3), () -> demoUtils.checkTimeout(), "Method should complete within 3 seconds");
     }
}
