package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @BeforeAll
    static void init() {}

    @Test
    void shouldAddTwoValues() {
        //given
        Calculator calculator = new Calculator();
        int expected = 5;
        //when
        int result = calculator.add(2, 3);
        //then
        assertEquals(expected, result); //Junit
        assertThat(result).isEqualTo(expected); //AssertJ
    }

    @Test
    void shouldSubtractTwoValues() {
        //given
        Calculator calculator = new Calculator();
        int expected = -1;
        //when
        int result = calculator.subtract(2, 3);
        //then
        assertEquals(expected, result); //Junit
        assertThat(result).isEqualTo(expected); //AssertJ
    }
}