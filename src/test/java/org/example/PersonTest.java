package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PersonTest {

    @Test  // test annotation
    void shouldCalculateAgeCorrectly() {

        // create a scenario
        Person julia = new Person("julia", LocalDateTime.of(2000, 1, 1, 15, 0, 0));

        // run validations
        Assertions.assertEquals(23, julia.getAge());
    }

    @Test
    void shouldReturnIsAdult() {
        Person julia = new Person("julia", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
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
