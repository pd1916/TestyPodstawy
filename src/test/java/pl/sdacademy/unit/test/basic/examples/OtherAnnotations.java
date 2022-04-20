package pl.sdacademy.unit.test.basic.examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OtherAnnotations {

    @Test
    @DisplayName("New test name")
    void testWithNewName() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void disabledTest() {
        System.out.println("Disabled test");
    }

    @Test
    void normalTest() {
        System.out.println("Normal test");
    }
}
