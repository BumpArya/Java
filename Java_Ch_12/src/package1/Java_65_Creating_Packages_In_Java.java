package package1; // New Package

import Java_Ch_12.*;

public class Java_65_Creating_Packages_In_Java {
    public static void main(String[] args) {
        System.out.println("This is package (package1) imports another user-defined package (Java_Ch_12) in same project");
        Java_64_Packages_In_Java Obj = new Java_64_Packages_In_Java();
        Obj.method();
    }
}
