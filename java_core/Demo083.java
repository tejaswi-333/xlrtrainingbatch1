import java.util.Scanner;

public class Demo083 {
    //Write a java program to check 1st character is vowel or consonant in String.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        scanner.close();
        
        char firstChar = input.charAt(0);
        
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            System.out.println("The first character is a vowel.");
        } else if (Character.isLetter(firstChar)) { 
            System.out.println("The first character is a consonant.");
        } else {
            System.out.println("The first character is not a letter.");
        }
    }
}


