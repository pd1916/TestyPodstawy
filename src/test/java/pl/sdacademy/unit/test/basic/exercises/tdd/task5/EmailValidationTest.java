package pl.sdacademy.unit.test.basic.exercises.tdd.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailValidationTest {
    @Test
    void shouldReturnTrueForValidEmailAddress1() {
        //given
        String input = "sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForValidEmailAddress2() {
        //given
        String input = "sda@sda.com";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForValidEmailAddress3() {
        //given
        String input = "sda.sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress1() {
        //given
        String input = "@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress2() {
        //given
        String input = "sda,sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress3() {
        //given
        String input = "sda?sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress4() {
        //given
        String input = "1sda^sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress5() {
        //given
        String input = "sda^sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress6() {
        //given
        String input = "@";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress7() {
        //given
        String input = null;
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }
}