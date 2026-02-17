package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTests {

    @Test
    @Disabled("Disabled until bug #123 is fixed")
    void basicTest() {
        System.out.println("Running basic test");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        System.out.println("Running test for Windows only");
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        System.out.println("Running test for Mac only");
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly() {
        System.out.println("Running test for Mac and Windows only");
    }

    @Test
    @EnabledIfEnvironmentVariable(named="LUV2CODE_ENV", matches="DEV")
    void testOnlyForDevEnv() {
        System.out.println("Running test only for Dev Env");
    }

    @Test
    @EnabledIfSystemProperty(named="LUV2CODE_SYS", matches="CI_CD_DEPLOY")
    void testOnlyForSystemProperty() {
        System.out.println("Running test only for System Property");
    }
}
