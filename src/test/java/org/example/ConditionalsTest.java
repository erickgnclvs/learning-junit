package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.*;

public class ConditionalsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "erick")
    void validateSomethingOnlyOnUserErick() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validateSomethingIfNotRoot() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void validateSomethingIfOnLinux() {
        Assertions.assertNull(null);
    }

    @Test
    @DisabledOnOs(OS.MAC)
    void validateSomethingButNotIfOnMac() {
        Assertions.assertNull(null);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void validateSomethingIfOnLinuxAndMac() {
        Assertions.assertNull(null);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void validateSomethingIfOnSpecificJRE() {
        Assertions.assertNull(null);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void validateSomethingIfOnSpecificJRERange() {
        Assertions.assertNull(null);
    }

}
