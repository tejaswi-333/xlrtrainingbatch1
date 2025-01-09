import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fibonacci Series displayed till terms: ");
        int n=sc.nextInt();
        System.out.println(n);

        int first = 0;
        int second = 1;
    
        for (int i = 1; i <= n; ++i) {
        System.out.print(first + ", ");
      
        int nextnum = first + second;
        first = second;
        second = nextnum;
        }

        sc.close();
    }
}

