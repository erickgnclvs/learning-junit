package org.example;

import java.util.logging.Logger;

public class DBConnectionManager {

    private static final Logger LOGGER = Logger.getLogger(DBConnectionManager.class.getName());

    public static void startConnection() {
        //do something
        LOGGER.info("Connection started");
    }

    public static void stopConnection() {
        //do something
        LOGGER.info("Connection stopped");
    }

    public static void insertData(Person person) {
        //insert person on DB
        LOGGER.info("data inserted");
    }

    public static void removeData(Person person) {
        //remove person from DB
        LOGGER.info("data removed");
    }
}