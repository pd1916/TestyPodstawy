package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilTest {

    /*
    true:
    ""
    null
    " "
    new String()
    "\n"

    false:
    "SDA"
    "."
    " SDA"
    " SDA "
    "SDA "
    "null"
     */

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        //given
        String input = "";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfStringContainsText() {
        //when
        boolean result = StringUtil.isBlank("SDA");
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

}