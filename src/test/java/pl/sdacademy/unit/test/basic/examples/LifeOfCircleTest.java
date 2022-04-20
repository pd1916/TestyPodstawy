package pl.sdacademy.unit.test.basic.examples;

import org.junit.jupiter.api.*;

public class LifeOfCircleTest {

    @BeforeAll
    static void initGlobal() {
        System.out.println("Global init...");
    }

    @BeforeEach
    void init() {
        System.out.println("Init...");
    }

    @AfterEach
    void close() {
        System.out.println("CLosing...");
    }

    @AfterAll
    static void closeGlobal() {
        System.out.println("Global closing...");
    }

    @Test
    void firstTest() {
        System.out.println("Executing first test...");
    }

    @Test
    void secondTest() {
        System.out.println("Executing second test...");
    }
}