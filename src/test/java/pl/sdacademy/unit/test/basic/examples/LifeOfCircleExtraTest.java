package pl.sdacademy.unit.test.basic.examples;

import org.junit.jupiter.api.Test;

public class LifeOfCircleExtraTest {

    private int counter;

    @Test
    public void firstTest() {
        counter++;
        System.out.println("firstTest counter: " + counter);
        System.out.println("firstTest: " + this);
    }

    @Test
    void secondTest() {
        counter++;
        System.out.println("secondTest counter: " + counter);
        System.out.println("secondTest: " + this);
    }
}