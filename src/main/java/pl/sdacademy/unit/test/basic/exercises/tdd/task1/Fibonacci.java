package pl.sdacademy.unit.test.basic.exercises.tdd.task1;

public class Fibonacci {

    public int getValueFromIndex(int index) {
        if (index == 0 || index == 1) {
            return index;
        }
        return getValueFromIndex(index - 1) + getValueFromIndex(index - 2);
    }
}