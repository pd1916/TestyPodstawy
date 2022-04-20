package pl.sdacademy.unit.test.basic.exercises.unit.task4;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean isChild() {
        return age >= 0 && age <= 18;
    }
}