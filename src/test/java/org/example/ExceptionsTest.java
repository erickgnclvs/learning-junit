package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validateExceptionOnTransfer() {
        Account origin = new Account("545444", 0);
        Account destination = new Account("32433", 100);

        TransferBetweenAccounts transfer = new TransferBetweenAccounts();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transfer.transfer(origin, destination, -1));

        Assertions.assertDoesNotThrow(() -> transfer.transfer(origin, destination, 20));
    }
}
