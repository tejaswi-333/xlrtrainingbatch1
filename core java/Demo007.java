import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Username: ");
        String Name=sc.nextLine();
        System.out.println(Name);
        System.out.print("Age: ");
        int Age=sc.nextInt();
        System.out.println(Age);
        System.out.print("Phone number: ");
        int Ph=sc.nextInt();
        System.out.println(Ph);

        sc.close();
    }
}
