package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Random.class)
public class OrderingTests {

    //  @Order(4)
    @Test
    void validateSomethingA() {
        assertTrue(true);
    }

    //  @Order(3)
    @Test
    void validateSomethingB() {
        assertTrue(true);
    }

    //  @Order(2)
    @Test
    void validateSomethingC() {
        assertTrue(true);
    }

    //  @Order(1)
    @Test
    void validateSomethingD() {
        assertTrue(true);
    }
}
