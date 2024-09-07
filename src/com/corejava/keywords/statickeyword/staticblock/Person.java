package com.corejava.keywords.statickeyword.staticblock;

import java.util.Objects;

public class Person {
    private static String type;
    private String name;
    private int age;

    static {
        type = "Person";
        System.out.println("From Static Block!!");
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Person.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                "name='" + name + '\'' +
                ",age=" + age +
                '}';
    }
}
