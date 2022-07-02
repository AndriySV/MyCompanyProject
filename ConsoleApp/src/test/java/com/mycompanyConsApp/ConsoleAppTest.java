package com.mycompanyConsApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsoleAppTest {

    @Test
    public void fullNameTest() {
        Assertions.assertEquals("Andrii Svyryd", ConsoleApp.getFullName());
    }
}
