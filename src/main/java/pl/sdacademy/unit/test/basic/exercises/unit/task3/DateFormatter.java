package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    private static final String DATE_FORMAT_YEAR_DAY_MONTH = "yyyy-dd-MM";

    public String formatDate(LocalDate date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_FORMAT_YEAR_DAY_MONTH);
        return date.format(dateTimeFormatter);
    }
}