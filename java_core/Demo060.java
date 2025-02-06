class Fibonnaci {
    void fib(int n) {
        System.out.println("Fibonacci Series for " + n + " terms: ");
        if (n <= 0) {
            return;
        }
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
//Fibonnaci series 20 without scanner
public class Demo060 {
    public static void main(String[] args) {
        int numTerms = 20; 
        Fibonnaci f = new Fibonnaci();
        f.fib(numTerms);
    }
}
