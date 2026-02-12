package com.luv2code.junitdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void beforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("Before Each executed test");
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
}
