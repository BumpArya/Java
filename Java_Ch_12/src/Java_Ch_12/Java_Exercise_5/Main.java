package Java_Ch_12.Java_Exercise_5;

import Java_Ch_12.Java_Exercise_5.Shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shapes\n1.Circle\n2.Rectangle\n3.Square\n4.Sphere\n5.Cylinder");
        System.out.print("Choice : ");
        int choice = sc.nextInt();
        System.out.println();

        if (choice == 1){
            Circle obj = new Circle();
            System.out.print("Enter radius of circle : ");
            double r = sc.nextDouble();
            obj.setR(r);
            System.out.println("Radius of Circle = " + obj.getR());
            System.out.println("Area of Circle = " + obj.area(obj.getR(), obj.getNil()));
            System.out.println("Perimeter of Circle = " + obj.perimeter(obj.getR(), obj.getNil()));
        }

        if (choice == 2){
            Rectangle obj = new Rectangle();
            System.out.print("Enter length of rectangle : ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth of rectangle : ");
            double b = sc.nextDouble();
            obj.setL(l);
            obj.setB(b);
            System.out.println("Length of Rectangle = " + obj.getL());
            System.out.println("Breadth of Rectangle = " + obj.getB());
            System.out.println("Area of Rectangle = " + obj.area(obj.getL(), obj.getB()));
            System.out.println("Perimeter of Rectangle = " + obj.perimeter(obj.getL(), obj.getB()));
        }

        if (choice == 3){
            Square obj = new Square();
            System.out.print("Enter side of square : ");
            double s = sc.nextDouble();
            obj.setS(s);
            System.out.println("Side of Square = " + obj.getS());
            System.out.println("Area of Square = " + obj.area(obj.getS(), obj.getNil()));
            System.out.println("Perimeter of Square = " + obj.perimeter(obj.getS(), obj.getNil()));
        }

        if (choice == 4){
            Sphere obj = new Sphere();
            System.out.print("Enter radius of sphere : ");
            double r = sc.nextDouble();
            obj.setR(r);
            System.out.println("Radius of Sphere = " + obj.getR());
            System.out.println("Surface area of Sphere = " + obj.surfaceArea(obj.getR(), obj.getN1(), obj.getN2()));
            System.out.println("Volume of Sphere = " + obj.volume(obj.getR(), obj.getN1(), obj.getN2()));
        }

        if (choice == 5){
            Cylinder obj = new Cylinder();
            System.out.print("Enter radius of cylinder : ");
            double r = sc.nextDouble();
            obj.setR(r);
            System.out.print("Enter height of cylinder : ");
            double h = sc.nextDouble();
            obj.setH(h);
            System.out.println("Height of the Cylinder = " + obj.getH());
            System.out.println("Radius of the Cylinder = " + obj.getR());
            System.out.println("Surface area of the Cylinder = " + obj.surfaceArea(obj.getR(), obj.getH(), obj.getN1()));
            System.out.println("Volume of the Cylinder = " + obj.volume(obj.getR(), obj.getH(), obj.getN1()));
        }
    }
}
