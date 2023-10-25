package org.example;

import java.util.*;


public class ExampleCollection {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Collections
        // Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]); // Outputs Volvo
        System.out.println(cars.length); // Outputs 4
        // add element
        cars[0] = "Opel";
        // remove element
        cars[0] = null;

        // copy array
        String[] carsCopy = Arrays.copyOf(cars, cars.length);


        // ArrayList
        ArrayList<String> cars2 = new ArrayList<String>();
        ArrayList<String> cars3 = new ArrayList<>(Arrays.asList("Volvo", "BMW", "Ford", "Mazda"));
        // add element
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        System.out.println(cars2.get(0)); // Outputs Volvo
        System.out.println(cars2); // Outputs [Volvo, BMW, Ford, Mazda]

        // remove element
        cars2.remove(0);
        System.out.println(cars2); // Outputs [BMW, Ford, Mazda]

        // copy ArrayList
        ArrayList<String> cars2Copy = new ArrayList<>(cars2);

        // clear ArrayList
        cars2.clear();
        System.out.println(cars2); // Outputs []

        // contains element
        System.out.println(cars3.contains("Volvo")); // Outputs true
        System.out.println(cars3.contains("Opel")); // Outputs false

        // size
        System.out.println(cars3.size()); // Outputs 4

        // sort
        Collections.sort(cars3);
        System.out.println(cars3); // Outputs [BMW, Ford, Mazda, Volvo]

        // reverse
        Collections.reverse(cars3);
        System.out.println(cars3); // Outputs [Volvo, Mazda, Ford, BMW]

        // get index
        System.out.println(cars3.indexOf("Volvo")); // Outputs 0

        // set element
        cars3.set(0, "Opel");
        System.out.println(cars3); // Outputs [Opel, Mazda, Ford, BMW]


        // Vector (similar to ArrayList) - synchronized
        Vector<String> cars4 = new Vector<String>();


        // HashMap
        Map<String, String> capitalCities = new HashMap<String, String>();
        // add element
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        System.out.println(capitalCities.get("England")); // Outputs London
        System.out.println(capitalCities); // Outputs {Norway=Oslo, Germany=Berlin, England=London}

        // remove element
        capitalCities.remove("England");

        // clear HashMap
        capitalCities.clear();

        // contains keys
        System.out.println(capitalCities.containsKey("England")); // Outputs false
        System.out.println(capitalCities.containsKey("Norway")); // Outputs true

        // contains values
        System.out.println(capitalCities.containsValue("London")); // Outputs false
        System.out.println(capitalCities.containsValue("Oslo")); // Outputs true

        // keySet
        System.out.println(capitalCities.keySet()); // Outputs [Norway, Germany, England]

        Set<String> a = capitalCities.keySet();


        // HashSet
        Set<String> cars5 = new HashSet<String>();
        // add element
        cars5.add("Volvo");
        cars5.add("BMW");
        cars5.add("Ford");
        cars5.add("Mazda");

        // remove element
        cars5.remove("Volvo");

        // clear HashSet
        cars5.clear();

        // contains element
        System.out.println(cars5.contains("Volvo")); // Outputs false
        System.out.println(cars5.contains("Opel")); // Outputs false


    }
}
