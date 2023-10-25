package org.example;

public class ExampleDatatypes {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Datatypes
        // int
        int myInt = 5;
        // double
        double myDouble = 5.99;
        // char
        char myChar = 'A';
        // boolean
        boolean myBoolean = true;
        // String
        String myString = "Hello";
        // byte
        byte myByte = 100;
        // short
        short myShort = 5000;
        // long
        long myLong = 15000000000L;
        // float
        float myFloat = 5.75f;

        // Type casting
        // Widening casting
        // byte -> short -> char -> int -> long -> float -> double
        int myInt2 = 9;
        double myDouble2 = myInt2; // Automatic casting: int to double
        System.out.println(myInt2); // Outputs 9
        System.out.println(myDouble2); // Outputs 9.0

        // Narrowing casting
        // double -> float -> long -> int -> char -> short -> byte
        float myFloat2 = 9.78f;
        int myInt3 = (int) myFloat2; // Manual casting: float to int
        System.out.println(myFloat2); // Outputs 9.78
        System.out.println(myInt3); // Outputs 9


        // Operators
        // Arithmetic operators
        int x = 5;
        int y = 3;
        System.out.println(x + y); // Outputs 8
        System.out.println(x - y); // Outputs 2

        // Assignment operators
        int z = 5;
        z += 3;

        // Comparison operators
        int a = 5;
        int b = 3;
        System.out.println(a == b); // Returns false
        System.out.println(a != b); // Returns true

        // Logical operators
        int c = 5;
        int d = 3;
        System.out.println(c > 3 && d > 1); // Returns true
        System.out.println(c > 3 || d > 1); // Returns true
        System.out.println(!(c > 3 && d > 1)); // Returns false

        // Bitwise operators
        int e = 5; // 0101
        int f = 3; // 0011
        System.out.println(e & f); // 0001 = 1
        System.out.println(e | f); // 0111 = 7
        System.out.println(e ^ f); // 0110 = 6
        System.out.println(~e); // 1010 = -6
        System.out.println(e << 1); // 1010 = 10
        System.out.println(e >> 1); // 0010 = 2

        // String operators
        String txt1 = "Hello";
        String txt2 = "World";
        System.out.println(txt1 + " " + txt2); // Outputs "Hello World"

        // String Slice operator
        String txt3 = "Hello World";
        System.out.println(txt3.substring(0, 5)); // Outputs "Hello"

        // String length operator
        System.out.println(txt3.length()); // Outputs 11

        // String uppercase operator
        System.out.println(txt3.toUpperCase()); // Outputs "HELLO WORLD"

        // String replace operator
        System.out.println(txt3.replace("H", "J")); // Outputs "Jello World"

        // String trim operator
        System.out.println(txt3.trim()); // Outputs "Hello World"

        // String array operator
        System.out.println(txt3.charAt(0)); // Outputs "H"


        // Type conversion
        // String to int
        String txt4 = "10";
        int myInt4 = Integer.parseInt(txt4);

        // String to double
        String txt5 = "10.99";
        double myDouble3 = Double.parseDouble(txt5);

        // int to String
        int myInt5 = 100;
        String txt6 = String.valueOf(myInt5);


    }
}
