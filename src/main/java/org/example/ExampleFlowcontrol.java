package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExampleFlowcontrol {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 0;

        // for loop
        for (i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // while loop
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

        // if statement
        if (i == 10) {
            System.out.println("i is 10");
        } else {
            System.out.println("i is not 10");
        }

        // for each loop
        ArrayList<String> sampleList = new ArrayList<String>(Arrays.asList("one", "two", "three"));
        for (String item : sampleList) {
            System.out.println(item);
        }

        // for each loop with map
        Map<String, String> sampleMap = new HashMap<String, String>();
        sampleMap.put("one", "1");
        sampleMap.put("two", "2");
        sampleMap.put("three", "3");
        for (Map.Entry<String, String> entry : sampleMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
