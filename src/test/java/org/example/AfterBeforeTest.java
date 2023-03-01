package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class AfterBeforeTest {

    @BeforeAll
    static void setConnections() {
        DBConnectionManager.startConnection();
    }

    @BeforeEach
    void insertDataForTest() {
        DBConnectionManager.insertData(new Person("david", LocalDateTime.of(2000, 1, 1, 15, 0, 0)));
    }

    @AfterEach
    void removeDataFromTest() {
        DBConnectionManager.removeData(new Person("david", LocalDateTime.of(2000, 1, 1, 15, 0, 0)));
    }

    @Test
    void validateReturnData() {
        Assertions.assertTrue(true);
        System.out.println("test 1");
    }

    @Test
    void validateReturnDataTwo() {
        Assertions.assertFalse(false);
        System.out.println("test 2");
    }

    @AfterAll
    static void endConnections() {
        DBConnectionManager.stopConnection();
    }

}
