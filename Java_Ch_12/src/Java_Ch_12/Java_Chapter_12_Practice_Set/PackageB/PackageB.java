package Java_Chapter_12_Practice_Set.PackageB;

import Java_Chapter_12_Practice_Set.PackageA.*;

public class PackageB extends PackageA {
    public static void main(String[] args) {
        PackageB BObj = new PackageB();
        PackageA AObj = new PackageA();
        // AObj.proMethod(); --> not valid
        BObj.proMethod();
        // BObj.defMethod(); --> not valid
        // AObj.defMethod(); --> not valid
    }
}
