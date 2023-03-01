package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTest {

    @Test
    void validateAccountThrow() {
        int[] firstThrow = {10, 20, 30, 40, 50};
        int[] secondThrow = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(firstThrow, secondThrow);
    }

    @Test
    void validateNullObject() {
        Person person = null;
        Assertions.assertNull(person);

        person = new Person("lucy", LocalDateTime.now());
        Assertions.assertNotNull(person);
    }

    @Test
    void validateDifferentTypeNumbers() {
        double value = 5.0;
        int valueTwo = 5;

        Assertions.assertEquals(value, valueTwo);
    }

    @Test
    void validateDifferentValues() {
        int x = 5;
        int y = 6;

        Assertions.assertNotEquals(x, y);
    }

    @Test
    void validateSomethingIsFalse() {
        boolean condition = 5 + 6 == 12;

        Assertions.assertFalse(condition);
    }

    @Test
    void validateSomethingIsTrue() {
        boolean condition = 6 + 6 == 12;

        Assertions.assertTrue(condition);
    }
}
