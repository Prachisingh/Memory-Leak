package org.example;

import java.util.ArrayList;
import java.util.List;

public class AcceptableGCActivity {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        
        while (true){
            for (int i = 0; i < 1000; i++) {
                list.add(Integer.valueOf(3));
            }
            list = new ArrayList<>();
        }
    }
}