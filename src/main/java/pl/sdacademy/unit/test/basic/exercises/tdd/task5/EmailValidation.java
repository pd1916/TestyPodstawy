package pl.sdacademy.unit.test.basic.exercises.tdd.task5;

import java.util.regex.Pattern;

public class EmailValidation {
    private static final String EMAIL_REGEX = "[a-zA-Z0-9._]+\\@[a-zA-z]+(\\.[a-zA-Z]+)*";

    public static boolean validate(String emailStr) {
        if(emailStr == null || emailStr.trim().isBlank()) {
            return false;
        }
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        return pattern.matcher(emailStr).matches();
    }
}