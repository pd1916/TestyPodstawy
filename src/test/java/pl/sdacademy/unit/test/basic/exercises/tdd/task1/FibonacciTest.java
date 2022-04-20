package pl.sdacademy.unit.test.basic.exercises.tdd.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    private static Fibonacci fibonacci;

    @BeforeAll
    static void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    void shouldReturnTheSameValueAsInput1() {
        //given
        int input = 0;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(input, result);
        assertThat(result).isEqualTo(input);
    }

    @Test
    void shouldReturnTheSameValueAsInput2() {
        //given
        int input = 1;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(input, result);
        assertThat(result).isEqualTo(input);
    }

    @Test
    void shouldReturnCorrectValue1() {
        //given
        int input = 4;
        int expectedResult = 3;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectValue2() {
        //given
        int input = 6;
        int expectedResult = 8;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectValue3() {
        //given
        int input = 8;
        int expectedResult = 21;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }
}