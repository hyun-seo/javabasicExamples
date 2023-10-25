package org.example;


// This is an example interface
interface SampleInterface {
    // This is an example method
    void exampleMethod();
}

interface SampleInterface2 {
    // This is an example method
    void exampleMethod();

    void exampleMethod2();
}


// This is an example class
class SampleClass implements SampleInterface, SampleInterface2 {
    // This is an example method
    public void exampleMethod() {
        System.out.println("Hello world!");
    }

    @Override
    public void exampleMethod2() {
        System.out.println("Hello world!");
    }
}


public class ExampleInterface {

    static SampleInterface obj;
    static SampleClass obj2;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        obj = new SampleClass();
        obj.exampleMethod();

        obj2 = new SampleClass();
        obj2.exampleMethod();


    }

}






