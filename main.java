import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter number");
    int userInput = scan.nextInt();   

    if(userInput > 0){
        System.out.println("The number is positive");
    }else if(userInput < 0){
        System.out.println("The number is negative");
    }else if (userInput == 0) {
        System.out.println("The value equals 0");
    }
    }
}
