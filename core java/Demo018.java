import java.util.Scanner;

public class Demo018 {
     public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        double min = sc.nextDouble();

        double minutesInYear = 60 * 24 * 365;
        
        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

        sc.close();
    }
}
