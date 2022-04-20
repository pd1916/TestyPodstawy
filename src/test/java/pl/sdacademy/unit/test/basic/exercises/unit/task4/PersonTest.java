package pl.sdacademy.unit.test.basic.exercises.unit.task4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {
    private static final String PERSON_NAME = "Jan";
    private static final String PERSON_SURNAME = "Kowalski";
    /*
    true:
    0
    18
    5

    false
    19
     */

    @Test
    void thatPersonIsAChild() {
        //given
        Person person = new Person(PERSON_NAME, PERSON_SURNAME, 0);
        //when
        boolean result = person.isChild();
        //then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void thatPersonIsNotAChild() {
        //given
        Person person = new Person(PERSON_NAME, PERSON_SURNAME, 19);
        //when
        boolean result = person.isChild();
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

}