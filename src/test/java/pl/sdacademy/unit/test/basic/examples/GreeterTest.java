package pl.sdacademy.unit.test.basic.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterTest {

    @Test
    public void shouldReturnCorrectWelcomeMessage() {
        //given
        String expectedWelcomeMsg = "Hello World!";
        Greeter greeter = new Greeter();
        //when
        String welcomeMsg = greeter.getWelcomeMessage();
        //then
        assertEquals(expectedWelcomeMsg, welcomeMsg);
    }
}