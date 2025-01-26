import java.util.Scanner;

public class Demo039 {
    //Write a java program to check character lowercase or uppercase or digit
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter input: ");
        char ch=sc.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println(ch+" Uppercase character");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println(ch+" Lowercase character");
        }
        else if(Character.isDigit(ch)){
            System.out.println(ch+" is a digit");
        }
        else{
            System.out.println("Not valid");
        }
        sc.close();
    }
}
