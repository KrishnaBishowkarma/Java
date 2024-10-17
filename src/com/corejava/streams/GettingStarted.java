package com.corejava.streams;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1.  Find people aged less than or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> people = MockData.getpeople();
        List<Person> youngPeople = new ArrayList<>();
        int limit = 10;
        int counter = 0;
        for (Person person : people) {
            if (person.getAge() <= 18) {
                youngPeople.add(person);
                counter++;
                if (counter == limit) {
                    break;
                }
            }
        }
        youngPeople.forEach(System.out::println);
    }
}
