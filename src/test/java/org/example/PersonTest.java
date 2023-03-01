package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PersonTest {

    @Test
    void shouldCalculateAgeCorrectly() {
        Person julia = new Person("julia", LocalDate.of(2000, 1, 1).atStartOfDay());
        Assertions.assertEquals(23, julia.getAge());
    }

    @Test
    void shouldReturnIsAdult() {
        Person julia = new Person("julia", LocalDate.of(2000, 1, 1).atStartOfDay());
        Assertions.assertTrue(julia.isAdult());

        Person john = new Person("john", LocalDateTime.now());
        Assertions.assertFalse(john.isAdult());
    }

    @Test
    void validateSameAge() {
        Person person = new Person("person 1", LocalDateTime.now());
        Assertions.assertSame(person, person);
    }

}
