import java.util.Scanner;

public class Java_Chapter_4_Practice_Set {
    public static void main(String[] args) {

        int a = 10;
        if (a==11){
            System.out.println("I am 11");}
        else{
            System.out.println("I am not 11");}

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percent For Sub 1 : ");
        int Per1 = sc.nextInt();
        System.out.print("Enter Percent For Sub 2 : ");
        int Per2 = sc.nextInt();
        System.out.print("Enter Percent For Sub 3 : ");
        int Per3 = sc.nextInt();

        if (Per1 > 33 && Per2 > 33 && Per3 > 33 && (Per1 + Per2 + Per3) > 40 ){
            System.out.println("You Have Passed");
        }else{
            System.out.println("You Have Failed");
        }

        System.out.print("Enter Your Salary : ");
        double Salary = sc.nextInt();

        if (Salary > 250000 && Salary <= 500000) {
            System.out.print("Tax On Your Income is ");
            System.out.println(((Salary*5)/100));
        }
        else if (Salary > 500000 && Salary <= 1000000){
            System.out.print("Tax On Your Income is ");
            System.out.println(((Salary*20)/100));
        }
        else if (Salary > 1000000 ){
            System.out.print("Tax On Your Income is ");
            System.out.println(((Salary*30)/100));
        }
        else {
            System.out.println("No Tax For You");
        }

    }
}
