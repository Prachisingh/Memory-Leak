package org.example;

import java.util.ArrayList;
import java.util.List;

public class FixingMemoryLeak {
    //problem was we got stuck in infinite loo
    // solution is either get out of loop or create new list to hold objects so the older list become un referenced
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        int i = 0;

        while (true){
            Person person = new Person("Prachi");
            list.add(person);
            if(i>1000){
                list = new ArrayList<>();
                i=0;
            }
            i++;
        }
    }
}
