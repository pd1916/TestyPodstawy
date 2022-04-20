package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

public class StringUtilTdd {

    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}