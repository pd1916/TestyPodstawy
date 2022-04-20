package pl.sdacademy.unit.test.basic.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsExamplesTest {

    @Test
    void shouldReturnCorrectSum() {
        //given
        int expectedResult = 5;
        AssertionsExamples examples = new AssertionsExamples();
        //when
        int result = examples.sum(2, 3);
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnIncorrectSum() {
        //given
        int expectedDummyResult = 0;
        AssertionsExamples examples = new AssertionsExamples();
        //when
        int result = examples.sum(2, 3);
        //then
        assertNotEquals(expectedDummyResult, result);
    }

    @Test
    void shouldReturnTrueForEvenDigit() {
        //given
        AssertionsExamples examples = new AssertionsExamples();
        //when
        boolean result = examples.ifDigitIsEven(4);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForNotEvenDigit() {
        //given
        AssertionsExamples examples = new AssertionsExamples();
        //when
        boolean result = examples.ifDigitIsEven(5);
        //then
        assertFalse(result);
    }

    @Test
    void shouldStringBeNull() {
        //given
        String inputStr = null;
        //then
        assertNull(inputStr);
    }

    @Test
    void shouldStringBeNotNull() {
        //given
        String inputStr = "dummy value";
        //then
        assertNotNull(inputStr);
    }

    @Test
    void shouldTwoObjectBeTheSame() {
        //given
        AssertionsExamples o1 = new AssertionsExamples();
        AssertionsExamples o2 = o1;
        //then
        assertSame(o1, o2);
    }

    @Test
    void shouldTwoObjectNotBeTheSame() {
        //given
        AssertionsExamples o1 = new AssertionsExamples();
        AssertionsExamples o2 = new AssertionsExamples();
        //then
        assertNotSame(o1, o2);
    }

    @Test
    void shouldFailTest() {
        fail("failed from some reason");
    }

    @Test
    void arraysShouldBeTheEqual() {
        //given
        int[] intsA = {1, 2, 3};
        int[] intsB = {1, 2, 3};
        //then
        assertArrayEquals(intsA, intsB);
    }

    @Test
    void verifyArrayStructure() {
        //given
        int[] ints = {1, 2, 3};
        //then
        assertAll(
                () -> assertEquals(3, ints.length),
                () -> assertEquals(2, ints[1])
        );
    }
}