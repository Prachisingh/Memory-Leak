package org.example;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeak {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        while (true){
            Person person = new Person("Prachi");
            list.add(person);
        }
    }
}
