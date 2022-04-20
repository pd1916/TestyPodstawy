package pl.sdacademy.unit.test.basic.exercises.tdd.task6;

import java.util.Arrays;

public class ArrayUtil {

    public static String[] removeDuplicates(String[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[length - 1];
                    length--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, length);
    }
}