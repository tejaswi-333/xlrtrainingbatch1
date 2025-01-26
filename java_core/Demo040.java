import java.util.Scanner;

public class Demo040 {
   // Write a java program to check character lowercase or uppercase or digit or special
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter input: ");
    char ch=sc.next().charAt(0);

    if(Character.isUpperCase(ch)){
        System.out.println(ch+" is a uppercase character");
    }
    else if(Character.isLowerCase(ch)){
        System.out.println(ch+" is a lowercase character");
    }
    else if(Character.isDigit(ch)){
        System.out.println(ch+" is a digit");
    }
    else{
        System.out.println(ch+" is a special character");
    }
    sc.close();
   }
}
