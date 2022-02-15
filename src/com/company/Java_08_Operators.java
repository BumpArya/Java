package com.company;

public class Java_08_Operators {
    public static void main(String[] args) {
        int b = 9;
        b += 3 ; // add 3 in 9 // works with all arithmetic operator
        System.out.println(b);
        System.out.println(4==5); //returns boolean value
        System.out.println(2&3); //bitwise operator - perform operations on every bit of numbers\

        int p = 6*5-34/2; // Here (*,/) take precedence over (-)
        // 6*5-34/2 --> 30 - 34/2 --> 30 - 17 --> 13
        System.out.println(p);
        int q = 60/5-34/2;// Here (*) and (/) are equal in precedence hence associativity of (*) and (/) is used which is from left to right
        // 60/5-34/2 --> 12 - 34/2 --> 12 - 17 --> -5
        System.out.println(q);
    }
}
