// Syntax for Switch case

/*
 Switch(var) {
	Case C1:
		//Code;
		break;
	Case C2:
		//Code;
		break;
	Case C3:
		//Code
		break;
	default:
		//Code
 */

public class Java_18_Switch_Case_Statements {
    public static void main(String[] args) {
        String var = "Vishaka";

        // enhanced switch
        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                break;
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");

        /*
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
         */

    }
}
