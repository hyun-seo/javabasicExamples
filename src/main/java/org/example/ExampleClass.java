package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleClass {

    // staic - belongs to class, share same value across all objects
    static String country = "USA";
    // final - constant value (cannot be changed once assigned. esp primitives types)
    final String CITY = "Bangalore";
    final ArrayList<String> finallist = new ArrayList<>(Arrays.asList("a", "b", "c"));
    // public, protected, private
    // public - access from anywhere
    public String name;
    // protected - access from same package or subclass
    protected int age;
    // private - access from same class
    private String address;


    // constructor
    ExampleClass() {
        System.out.println("Constructor called");
    }

    ExampleClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");

        // create object
        System.out.println(ExampleClass.country);
        ExampleClass.modifyStaticVariable("India");
        System.out.println(ExampleClass.country);

        ExampleClass obj = new ExampleClass();
        System.out.println(obj.finallist);
        obj.modifyFinalArrayList();
        System.out.println(obj.finallist);
    }

    // modify static variable
    public static void modifyStaticVariable(String country) {
        ExampleClass.country = country;
    }

    // modify final arraylist variable
    public void modifyFinalArrayList() {
        finallist.add("d");
    }
}
