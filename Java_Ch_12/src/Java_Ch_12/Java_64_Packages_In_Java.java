/*
Syntax : Using Java Packages
import java.lang.*; --> import full package
import java.lang.String; --> import a class from package
new java.lang.String s = new java.lang.String("String"); -->  use without importing
*/

package Java_Ch_12; // Base Package

import java.util.*;
import java.lang.String;

public class Java_64_Packages_In_Java {

    public void method(){
        System.out.println("This is method from package (Java_Ch_12)");
    }

    public static void main(String[] args) {
        System.out.print("Input String : ");
        Scanner sc = new Scanner(System.in);
        String s = new String(sc.nextLine());
        sc.close();
        System.out.println("Your String " + s);

        java.lang.String string = new java.lang.String("This is a String");
        System.out.println(string);
    }
}
