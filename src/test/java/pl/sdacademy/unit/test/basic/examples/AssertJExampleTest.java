package pl.sdacademy.unit.test.basic.examples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJExampleTest {

    @Test
    void assertJExample() {
        //given
        String input = "programowanie w javie";
        //then
        assertThat(input)
                .startsWith("programowanie")
                .contains(" ")
                .endsWith("javie");
    }

    @Test
    void assertJExample2() {
        //given
        int[] ints = {1, 2, 3};
        //then
        assertThat(ints)
                .hasSize(3)
                .contains(2, 3);
    }
}