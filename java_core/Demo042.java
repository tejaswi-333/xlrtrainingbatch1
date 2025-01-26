import java.util.Scanner;

public class Demo042 {
    //Write a java program to convert lowercase charcter into upper case.
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            char upperCh = Character.toUpperCase(ch);
            System.out.println("Uppercase of " + ch + " is " + upperCh);
        } else {
            System.out.println("Entered character is not a lowercase letter.");
        }
        scanner.close();
    }
}
